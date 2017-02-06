package com.fyn.sys.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fyn.common.util.Constants;
import com.fyn.common.util.PasswordUtil;
import com.fyn.common.util.data.EventParam;
import com.fyn.common.util.data.ServiceResult.Code;
import com.fyn.sys.beans.SysMenuInfo;
import com.fyn.sys.beans.SysRoleInfo;
import com.fyn.sys.beans.SysUserInfo;
import com.fyn.sys.controller.vo.MenuTreeVO;
import com.fyn.sys.controller.vo.SysMenuInfoVO;
import com.fyn.sys.mapper.SysMenuInfoMapper;
import com.fyn.sys.mapper.SysRoleInfoMapper;
import com.fyn.sys.mapper.SysRoleMenuMapper;
import com.fyn.sys.mapper.SysUserInfoMapper;
import com.fyn.sys.service.UserService;

@Service("userService")
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

	@Autowired
	private SysUserInfoMapper sysUserInfoMapper;
	@Autowired
	private SysMenuInfoMapper sysMenuInfoMapper;
	@Autowired
    private SysRoleInfoMapper sysRoleInfoMapper;
	@Autowired
	private SysRoleMenuMapper sysRoleMenuMapper;

	@Override
	public SysUserInfo getUser(String userName, String password) {
		SysUserInfo sysUser = new SysUserInfo();
		sysUser.setUserName(userName);
		sysUser.setPasswd(PasswordUtil.encodeMD5Password(password));
		return sysUserInfoMapper.getOneByNameAndPasswd(sysUser);
	}

	@Override
	public List<SysMenuInfoVO> getMenus(int userId) {
	    List<SysMenuInfoVO> list = sysMenuInfoMapper.getPMenuListByUserId(userId);
	    for (SysMenuInfoVO vo : list) {
            vo.setMenuList(sysMenuInfoMapper.getMenuListByPId(userId, vo.getpMenuId()));
        }
	    return list;
	}

	@Override
	public SysUserInfo register(EventParam param) {
		SysUserInfo user = param.getParam("param");
		String password = user.getPasswd();
		user.setPasswd(PasswordUtil.encodeMD5Password(password));
		user.setUserUuid(UUID.randomUUID().toString().toUpperCase().replace("-", ""));
		try {
			sysUserInfoMapper.addSysUserInfo(user);
	        param.setResultStatus(Code.OK);
	        param.setResultMessage(Constants.SUCCESS);
		} catch (Exception e) {
	        param.setResultStatus(Code.FAILED);
	    }
		return this.getUser(user.getUserName(), password);
	}

    @Override
    public List<SysRoleInfo> getRoleInfo(SysRoleInfo param) {        
        return sysRoleInfoMapper.getSysRoleInfoList(param);
    }

    @Override
    public List<SysUserInfo> getUserInfo() {
        return sysUserInfoMapper.getSysUserInfoList();
    }

    @Override
    public List<SysMenuInfo> getMenuInfo() {
        return sysMenuInfoMapper.getSysMenuInfoList();
    }

    @Override
    public void addOrUpdateRole(EventParam param) {
        SysRoleInfo role = param.getParam("role");
        String menuIds = param.getParam("menuIds");
        String[] menuId = menuIds.split(",");
        Integer roleId = role.getRoleId();
        try {            
            if (roleId == 0) {
                sysRoleInfoMapper.addSysRoleInfo(role);
                roleId = sysRoleInfoMapper.getIdByName(role.getRoleName());
            } else {
                sysRoleInfoMapper.updateSysRoleInfo(role);
            }
            sysRoleMenuMapper.deleteByRoleId(roleId);
            sysRoleMenuMapper.addRoleMenuBatch(roleId,menuId);
            param.setResultStatus(Code.OK);
            param.setResultMessage(Constants.SUCCESS);
        } catch (Exception e) {
            param.setResultStatus(Code.FAILED);
        }
    }

    @Override
    public void deleteRole(EventParam param) {
        String roleId = param.getParam("param");
        String[] ids = roleId.split(",");
        try {
            sysRoleInfoMapper.deleteSysRoleInfoById(ids);                
            param.setResultStatus(Code.OK);
            param.setResultMessage(Constants.SUCCESS);
        } catch (Exception e) {
            param.setResultStatus(Code.FAILED);
        }
    }

    @Override
    public List<MenuTreeVO> getMenuTreeList() {        
        List<MenuTreeVO> list = sysMenuInfoMapper.getPMenuList();
        for (MenuTreeVO vo : list) {
            vo.setChildren(sysMenuInfoMapper.getCMenuList(vo.getId()));
        }
        return list;
    }

}
