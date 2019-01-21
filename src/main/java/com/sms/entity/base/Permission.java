package com.sms.entity.base;

import java.io.Serializable;

public class Permission implements Serializable {
    /**
     * 
    **/
    private String id;

    /**
     * 标识
    **/
    private String code;

    /**
     * 功能名称
    **/
    private String name;

    /**
     * 标志位
    **/
    private Integer flag;

    /**
     * URL
    **/
    private String url;

    /**
     * 父ID
    **/
    private String pid;

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

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
}