package com.fyn.sys.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fyn.common.util.data.EventParam;
import com.fyn.common.util.data.ServiceResult;
import com.fyn.sys.beans.SysMenuInfo;
import com.fyn.sys.beans.SysRoleInfo;
import com.fyn.sys.beans.SysUserInfo;
import com.fyn.sys.controller.vo.MenuTreeVO;
import com.fyn.sys.service.UserService;

@Controller
@RequestMapping("/sys")
public class ManageController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/manageMenu")
	public String manageMenu(Model model, HttpSession session) {	
	    return "/sys/manageMenu";
	}
	
	@RequestMapping(value = "/manageUser")
	public String manageUser(Model model, HttpSession session) {	
        return "/sys/manageUser";
	}
	
    @RequestMapping(value = "/manageRole")
    public String manageRole(Model model, HttpSession session) { 
        return "/sys/manageRole";
    }
    
    @RequestMapping(value = "/getManageRoleList")
    @ResponseBody
    public Map<String,Object> getManageRoleList(SysRoleInfo param, HttpSession session){
        List<SysRoleInfo> roleList = userService.getRoleInfo(param);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("data", roleList);
        return map;
    }
    
    @RequestMapping(value = "/getManageUserList")
    @ResponseBody
    public Map<String,Object> getManageUserList(SysRoleInfo param, HttpSession session){        
        List<SysUserInfo> userList = userService.getUserInfo();
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("data", userList);
        return map;
    }
    
    @RequestMapping(value = "/getManageMenuList")
    @ResponseBody
    public Map<String,Object> getManageMenuList(SysRoleInfo param, HttpSession session){
        List<SysMenuInfo> menuList = userService.getMenuInfo();
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("data", menuList);
        return map;
    }
    
    @RequestMapping(value = "/toAddOrUpdateRole")
    public String toAddOrUpdateRole(Model model, HttpSession session, SysRoleInfo role){
        model.addAttribute("role", role);
        return "/sys/addOrUpdateRole";
    }
    
    @RequestMapping(value = "/addOrUpdateRole")
    @ResponseBody
    public ServiceResult addOrUpdateRole(HttpSession session, SysRoleInfo role, String menuIds) {
        EventParam param = new EventParam();
        param.setParam("role", role);
        param.setParam("menuIds", menuIds);
        userService.addOrUpdateRole(param);
        return param.generateServiceResult();
    }
    
    @RequestMapping(value = "/deleteRole")
    @ResponseBody
    public ServiceResult deleteRole(HttpSession session, String roleId) {
        EventParam param = new EventParam();
        param.setParam("param", roleId);
        userService.deleteRole(param);
        return param.generateServiceResult();
    }
    
    @RequestMapping(value = "/getMenuTreeList")
    @ResponseBody
    public List<MenuTreeVO> getMenuTreeList() {
        return userService.getMenuTreeList();        
    }

}
