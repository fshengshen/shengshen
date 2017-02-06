package com.mb.memp.persistence.beans;

import com.mb.common.dal.object.AbstractDO;

/**
 * 角色信息表。模型
 * @author fyn
 * @date 2016-08-02
 * @source Generated by MySQL2Java
 */
public class PmHplRoleInfo extends AbstractDO {

    /**
     * 角色ID
     */
    private String roleId;

    /**
     * 区域id
     */
    private int areaId;

    /**
     * 系统ID。用于区分不同医院
     */
    private String sysId;

    /**
     * 父角色ID
     */
    private String roleParentId;

    /**
     * 同级角色顺序。从0开始编号
     */
    private String roleIndex;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色描述
     */
    private String roleDesc;

    /**
     * 角色适用范围
     */
    private String rolePermitLevel;

    /**
     * 添加人
     */
    private String addBy;

    /**
     * 添加人名称
     */
    private String addName;

    /**
     * 添加时间
     */
    private String addTime;

    /**
     * 最后修改人
     */
    private String lastEditBy;

    /**
     * 最后修改人名称
     */
    private String lastEditName;

    /**
     * 最后修改时间
     */
    private String lastEditTime;

    /**
     * 作废标记。0有效，1无效
     */
    private String delFlag;

    /**
     * 取值 角色ID
     * @return 角色ID
     */
    public String getRoleId() {
        return this.roleId;
    }

    /**
     * 赋值 角色ID
     * @param roleId 角色ID
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * 取值 区域id
     * @return 区域id
     */
    public int getAreaId() {
        return this.areaId;
    }

    /**
     * 赋值 区域id
     * @param areaId 区域id
     */
    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    /**
     * 取值 系统ID。用于区分不同医院
     * @return 系统ID。用于区分不同医院
     */
    public String getSysId() {
        return this.sysId;
    }

    /**
     * 赋值 系统ID。用于区分不同医院
     * @param sysId 系统ID。用于区分不同医院
     */
    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    /**
     * 取值 父角色ID
     * @return 父角色ID
     */
    public String getRoleParentId() {
        return this.roleParentId;
    }

    /**
     * 赋值 父角色ID
     * @param roleParentId 父角色ID
     */
    public void setRoleParentId(String roleParentId) {
        this.roleParentId = roleParentId;
    }

    /**
     * 取值 同级角色顺序。从0开始编号
     * @return 同级角色顺序。从0开始编号
     */
    public String getRoleIndex() {
        return this.roleIndex;
    }

    /**
     * 赋值 同级角色顺序。从0开始编号
     * @param roleIndex 同级角色顺序。从0开始编号
     */
    public void setRoleIndex(String roleIndex) {
        this.roleIndex = roleIndex;
    }

    /**
     * 取值 角色名称
     * @return 角色名称
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * 赋值 角色名称
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 取值 角色描述
     * @return 角色描述
     */
    public String getRoleDesc() {
        return this.roleDesc;
    }

    /**
     * 赋值 角色描述
     * @param roleDesc 角色描述
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    /**
     * 取值 角色适用范围
     * @return 角色适用范围
     */
    public String getRolePermitLevel() {
        return this.rolePermitLevel;
    }

    /**
     * 赋值 角色适用范围
     * @param rolePermitLevel 角色适用范围
     */
    public void setRolePermitLevel(String rolePermitLevel) {
        this.rolePermitLevel = rolePermitLevel;
    }

    /**
     * 取值 添加人
     * @return 添加人
     */
    public String getAddBy() {
        return this.addBy;
    }

    /**
     * 赋值 添加人
     * @param addBy 添加人
     */
    public void setAddBy(String addBy) {
        this.addBy = addBy;
    }

    /**
     * 取值 添加人名称
     * @return 添加人名称
     */
    public String getAddName() {
        return this.addName;
    }

    /**
     * 赋值 添加人名称
     * @param addName 添加人名称
     */
    public void setAddName(String addName) {
        this.addName = addName;
    }

    /**
     * 取值 添加时间
     * @return 添加时间
     */
    public String getAddTime() {
        return this.addTime;
    }

    /**
     * 赋值 添加时间
     * @param addTime 添加时间
     */
    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    /**
     * 取值 最后修改人
     * @return 最后修改人
     */
    public String getLastEditBy() {
        return this.lastEditBy;
    }

    /**
     * 赋值 最后修改人
     * @param lastEditBy 最后修改人
     */
    public void setLastEditBy(String lastEditBy) {
        this.lastEditBy = lastEditBy;
    }

    /**
     * 取值 最后修改人名称
     * @return 最后修改人名称
     */
    public String getLastEditName() {
        return this.lastEditName;
    }

    /**
     * 赋值 最后修改人名称
     * @param lastEditName 最后修改人名称
     */
    public void setLastEditName(String lastEditName) {
        this.lastEditName = lastEditName;
    }

    /**
     * 取值 最后修改时间
     * @return 最后修改时间
     */
    public String getLastEditTime() {
        return this.lastEditTime;
    }

    /**
     * 赋值 最后修改时间
     * @param lastEditTime 最后修改时间
     */
    public void setLastEditTime(String lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    /**
     * 取值 作废标记。0有效，1无效
     * @return 作废标记。0有效，1无效
     */
    public String getDelFlag() {
        return this.delFlag;
    }

    /**
     * 赋值 作废标记。0有效，1无效
     * @param delFlag 作废标记。0有效，1无效
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

}
