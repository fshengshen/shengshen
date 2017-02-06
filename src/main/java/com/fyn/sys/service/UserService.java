package com.fyn.sys.service;

import java.util.List;

import com.fyn.common.util.data.EventParam;
import com.fyn.sys.beans.SysMenuInfo;
import com.fyn.sys.beans.SysRoleInfo;
import com.fyn.sys.beans.SysUserInfo;
import com.fyn.sys.controller.vo.MenuTreeVO;
import com.fyn.sys.controller.vo.SysMenuInfoVO;

public interface UserService{

	/**
	 * 根据用用户名密码查询用户
	 * @param userName
	 * @param password
	 * @return
	 */
	SysUserInfo getUser(String userName, String password);

	/**
	 * 根据用户ID查找菜单
	 * @param userId
	 * @return
	 */
	List<SysMenuInfoVO> getMenus(int userId);

	/**
	 * 注册用户并返回用户ID
	 * @param param
	 * @return
	 */
	SysUserInfo register(EventParam param);

	/**
	 * 获取角色信息列表
	 * @param param 
	 * @param userId
	 * @return
	 */
    List<SysRoleInfo> getRoleInfo(SysRoleInfo param);

    /**
     * 获取用户信息列表
     * @return
     */
    List<SysUserInfo> getUserInfo();

    /**
     * 获取菜单信息列表
     * @return
     */
    List<SysMenuInfo> getMenuInfo();

    /**
     * 添加或修改角色信息
     * @param param
     */
    void addOrUpdateRole(EventParam param);

    /**
     * 删除一个角色
     * @param param
     */
    void deleteRole(EventParam param);

    List<MenuTreeVO> getMenuTreeList();

}
