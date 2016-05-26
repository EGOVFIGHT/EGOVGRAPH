package com.egov.graph.model;

import java.util.Date;

public class Album {
    private Integer id;

    private Integer parentid;

    private String aname;

    private String path;

    private Integer num;

    private Date ctime;

    private Integer authorid;

    public Album(Integer id, Integer parentid, String aname, String path, Integer num, Date ctime, Integer authorid) {
        this.id = id;
        this.parentid = parentid;
        this.aname = aname;
        this.path = path;
        this.num = num;
        this.ctime = ctime;
        this.authorid = authorid;
    }

    public Album() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Integer getAuthorid() {
        return authorid;
    }

    public void setAuthorid(Integer authorid) {
        this.authorid = authorid;
    }
}