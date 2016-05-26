package com.egov.graph.model;

import java.util.Date;

public class Remark {
    private Integer id;

    private Integer photoid;

    private Date ctime;

    private Integer remarkfromid;

    private String context;

    public Remark(Integer id, Integer photoid, Date ctime, Integer remarkfromid, String context) {
        this.id = id;
        this.photoid = photoid;
        this.ctime = ctime;
        this.remarkfromid = remarkfromid;
        this.context = context;
    }

    public Remark() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPhotoid() {
        return photoid;
    }

    public void setPhotoid(Integer photoid) {
        this.photoid = photoid;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Integer getRemarkfromid() {
        return remarkfromid;
    }

    public void setRemarkfromid(Integer remarkfromid) {
        this.remarkfromid = remarkfromid;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}