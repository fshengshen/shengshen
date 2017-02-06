package com.fyn.sys.controller.vo;

import java.util.List;

import com.fyn.sys.beans.SysMenuInfo;

public class SysMenuInfoVO {
    private String pMenuName;
    private int pMenuId;
    private List<SysMenuInfo> menuList;
    public String getpMenuName() {
        return pMenuName;
    }
    public void setpMenuName(String pMenuName) {
        this.pMenuName = pMenuName;
    }
    public List<SysMenuInfo> getMenuList() {
        return menuList;
    }
    public void setMenuList(List<SysMenuInfo> menuList) {
        this.menuList = menuList;
    }
    public int getpMenuId() {
        return pMenuId;
    }
    public void setpMenuId(int pMenuId) {
        this.pMenuId = pMenuId;
    }
}
