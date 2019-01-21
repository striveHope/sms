package com.sms.entity.base;

import java.io.Serializable;

public class Role implements Serializable {
    /**
     * 主键ID
    **/
    private String id;

    /**
     * 角色标识
    **/
    private String code;

    /**
     * 角色名称
    **/
    private String name;

    /**
     * 权限
    **/
    private String permission;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}