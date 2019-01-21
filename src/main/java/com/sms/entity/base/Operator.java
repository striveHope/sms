package com.sms.entity.base;

import java.io.Serializable;
import java.util.Date;

public class Operator implements Serializable {
    /**
     * 
    **/
    private String id;

    /**
     * 
    **/
    private String unitid;

    /**
     * 
    **/
    private String code;

    /**
     * 
    **/
    private String password;

    /**
     * 
    **/
    private String name;

    /**
     * 
    **/
    private Integer status;

    /**
     * 
    **/
    private String roleid;

    /**
     * 
    **/
    private String permission;

    /**
     * 
    **/
    private String telephone;

    /**
     * 
    **/
    private Integer sex;

    /**
     * 
    **/
    private Date createtime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}