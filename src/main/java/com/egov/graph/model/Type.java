package com.egov.graph.model;

import java.util.Date;

public class Type {
    private Integer id;

    private String tname;

    private String path;

    private Integer num;

    private Long totelnum;

    private Date ctime;

    public Type(Integer id, String tname, String path, Integer num, Long totelnum, Date ctime) {
        this.id = id;
        this.tname = tname;
        this.path = path;
        this.num = num;
        this.totelnum = totelnum;
        this.ctime = ctime;
    }

    public Type() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
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

    public Long getTotelnum() {
        return totelnum;
    }

    public void setTotelnum(Long totelnum) {
        this.totelnum = totelnum;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}