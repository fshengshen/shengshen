package com.fyn.adapter.interceptor;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.alibaba.fastjson.JSON;
import com.fyn.common.util.SystemResource;
import com.fyn.sys.beans.SysUserInfo;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	
	/**
	 * 免检地址
	 */
	private List<String> uncheckUrls; 
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		String requestUrl = request.getRequestURL().toString(); 
		if(uncheckUrls != null && uncheckUrls.contains(requestUrl)){ 
			return true;
		}
		
		if (requestUrl.startsWith(SystemResource.getConfig("domain.shengshen") + "/css/")
				|| requestUrl.startsWith(SystemResource.getConfig("domain.shengshen") + "/img/")
				|| requestUrl.startsWith(SystemResource.getConfig("domain.shengshen") + "/js/")) {
			
			return true;
		}
		
		SysUserInfo sessionUser = (SysUserInfo)request.getSession().getAttribute("USER");
		if(sessionUser == null){
			
			// 同步请求会话超时，则跳转登录页面
			if(request.getHeader("X-Requested-With") == null){ 
				response.sendRedirect(SystemResource.getConfig("domain.shengshen")+"/toLogin");
				return false;
				
			// ajax请求会话超时，则还要看情况
			}else{
				
				// ajax请求json数据，则返回status为-1，以登陆框的方式让用户重新登陆，从而不影响用户现场。
				if(request.getHeader("accept").indexOf("application/json") > -1){
					try {
						PrintWriter writer = response.getWriter();

						Map<String, String> map = new HashMap<String, String>();
						map.put("status", "-1");
						map.put("message", "会话超时，请重新登陆！");

						writer.write(JSON.toJSONString(map));
						writer.flush();

					} catch (IOException e) {
						e.printStackTrace();
					}
				
			    // ajax请求非json数据，基本属于ajax局部加载html页面
				// 这个之后，你要是像上面那么返回json，整个json串会被现实在局部页面里去了，不会弹出登录框的。
				// 所以这种情况下，我们把局部载入的页面替换为ajaxTimeout.jsp空白页，这个页面载入后马上会通过js弹出登录框，达到一样的效果。
				} else {
					request.getRequestDispatcher("/WEB-INF/jsp/common/ajaxTimeout.jsp").forward(request, response);
				}
			}
			return false;
		}
//		requestUrl = requestUrl.replace(SystemResource.getConfig("domain.manage"), ""); //设置当前业务模块
		
//		if(sessionUser.getPermMap() != null){
//			if(sessionUser.getPermMap().containsKey(requestUrl)){
//				request.getSession().setAttribute("currBusiModule", sessionUser.getPermMap().get(requestUrl));
//			}
//		}
		return super.preHandle(request, response, handler);
	}
	
	public void setUncheckUrls(List<String> uncheckUrls) {
		this.uncheckUrls = uncheckUrls;
	}

}