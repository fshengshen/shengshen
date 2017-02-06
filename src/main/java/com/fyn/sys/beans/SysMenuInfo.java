package com.fyn.sys.beans;

import com.fyn.common.dal.object.AbstractDO;

/**
 * 菜单表模型
 * @author fyn
 * @date 2016-06-06
 * @source Generated by MySQL2Java
 */
public class SysMenuInfo extends AbstractDO {

    /**
     * 菜单或者按钮id
     */
    private int menuId;

    /**
     * 菜单等级
     */
    private int menuLevel;

    /**
     * 菜单顺序
     */
    private int menuIndex;

    /**
     * 父级菜单id
     */
    private int parentMenuId;

    /**
     * 菜单或者按钮名称
     */
    private String menuName;

    /**
     * 菜单url地址
     */
    private String menuUrl;

    /**
     * 菜单或者按钮图标样式
     */
    private String menuCss;

    /**
     * 按钮函数
     */
    private String buttonFun;

    /**
     * 菜单或者按钮：1：菜单；0：按钮
     */
    private String isMenu;

    /**
     * 取值 菜单或者按钮id
     * @return 菜单或者按钮id
     */
    public int getMenuId() {
        return this.menuId;
    }

    /**
     * 赋值 菜单或者按钮id
     * @param menuId 菜单或者按钮id
     */
    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    /**
     * 取值 菜单等级
     * @return 菜单等级
     */
    public int getMenuLevel() {
        return this.menuLevel;
    }

    /**
     * 赋值 菜单等级
     * @param menuLevel 菜单等级
     */
    public void setMenuLevel(int menuLevel) {
        this.menuLevel = menuLevel;
    }

    /**
     * 取值 菜单顺序
     * @return 菜单顺序
     */
    public int getMenuIndex() {
        return this.menuIndex;
    }

    /**
     * 赋值 菜单顺序
     * @param menuIndex 菜单顺序
     */
    public void setMenuIndex(int menuIndex) {
        this.menuIndex = menuIndex;
    }

    /**
     * 取值 父级菜单id
     * @return 父级菜单id
     */
    public int getParentMenuId() {
        return this.parentMenuId;
    }

    /**
     * 赋值 父级菜单id
     * @param parentMenuId 父级菜单id
     */
    public void setParentMenuId(int parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    /**
     * 取值 菜单或者按钮名称
     * @return 菜单或者按钮名称
     */
    public String getMenuName() {
        return this.menuName;
    }

    /**
     * 赋值 菜单或者按钮名称
     * @param menuName 菜单或者按钮名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * 取值 菜单url地址
     * @return 菜单url地址
     */
    public String getMenuUrl() {
        return this.menuUrl;
    }

    /**
     * 赋值 菜单url地址
     * @param menuUrl 菜单url地址
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     * 取值 菜单或者按钮图标样式
     * @return 菜单或者按钮图标样式
     */
    public String getMenuCss() {
        return this.menuCss;
    }

    /**
     * 赋值 菜单或者按钮图标样式
     * @param menuCss 菜单或者按钮图标样式
     */
    public void setMenuCss(String menuCss) {
        this.menuCss = menuCss;
    }

    /**
     * 取值 按钮函数
     * @return 按钮函数
     */
    public String getButtonFun() {
        return this.buttonFun;
    }

    /**
     * 赋值 按钮函数
     * @param buttonFun 按钮函数
     */
    public void setButtonFun(String buttonFun) {
        this.buttonFun = buttonFun;
    }

    /**
     * 取值 菜单或者按钮：1：菜单；0：按钮
     * @return 菜单或者按钮：1：菜单；0：按钮
     */
    public String getIsMenu() {
        return this.isMenu;
    }

    /**
     * 赋值 菜单或者按钮：1：菜单；0：按钮
     * @param isMenu 菜单或者按钮：1：菜单；0：按钮
     */
    public void setIsMenu(String isMenu) {
        this.isMenu = isMenu;
    }

}
