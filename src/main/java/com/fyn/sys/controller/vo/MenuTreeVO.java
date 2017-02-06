package com.fyn.sys.controller.vo;

import java.util.List;

public class MenuTreeVO {
    private String id;
    private String text;
    private List<MenuTreeChildVO> children;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public List<MenuTreeChildVO> getChildren() {
        return children;
    }
    public void setChildren(List<MenuTreeChildVO> children) {
        this.children = children;
    }
    
}
