package com.fyn.sys.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fyn.common.util.Constants;
import com.fyn.common.util.data.EventParam;
import com.fyn.common.util.data.ServiceResult;
import com.fyn.common.util.data.ServiceResult.Code;
import com.fyn.sys.beans.SysMenuInfo;
import com.fyn.sys.beans.SysUserInfo;
import com.fyn.sys.controller.vo.SysMenuInfoVO;
import com.fyn.sys.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/toLogin")
	public String toLogin(Model model, String t) {
		if (null != t && !"".equals(t)) {
			model.addAttribute("t", t);
		}
		return "/login";
	}
	
	@RequestMapping(value = "/newLogin")
	public String login(Model model, HttpSession session) {
	    SysUserInfo user = (SysUserInfo) session.getAttribute("USER");
		if (null != user) {
			List<SysMenuInfoVO> menuVOList = userService.getMenus(user.getUserId());
			model.addAttribute("user", user).addAttribute("menuVOList", menuVOList);
			return "/homePage";			
		} else {
			return "redirect:/toLogin?t=1";
		}
	}
	
	@ResponseBody
    @RequestMapping(value = "/login")
    public ServiceResult login(String userName, String password, HttpSession session) {
        EventParam params = new EventParam();
        SysUserInfo user = userService.getUser(userName, password);
        try {
            session.setAttribute("USER", user);
            params.setResultStatus(Code.OK);
            params.setResultMessage(Constants.SUCCESS);
            return params.generateServiceResult();
        } catch (RuntimeException e) {
            params.setResultStatus(Code.FAILED);
            params.setResultMessage(e.getMessage());
            return params.generateServiceResult();
        }
    }
	   
	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {	
		session.invalidate();
		return "redirect:/toLogin";
	}
	
	@RequestMapping(value = "/toRegister")
	public String toRegister(HttpSession session) {	
		return "/register";
	}
	
	@ResponseBody
	@RequestMapping(value = "/register")
	public ServiceResult register(HttpSession session, SysUserInfo user) {
		EventParam param = new EventParam();		
		param.setParam("param", user);
		user = userService.register(param);
		session.setAttribute("USER", user);
		return param.generateServiceResult();
	}

}
