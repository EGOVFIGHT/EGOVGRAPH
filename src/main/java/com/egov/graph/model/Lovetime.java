package com.egov.graph.model;

import java.util.Date;

public class Lovetime {
    private Integer id;

    private Integer photoid;

    private Integer lovefromid;

    private Date time;

    public Lovetime(Integer id, Integer photoid, Integer lovefromid, Date time) {
        this.id = id;
        this.photoid = photoid;
        this.lovefromid = lovefromid;
        this.time = time;
    }

    public Lovetime() {
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

    public Integer getLovefromid() {
        return lovefromid;
    }

    public void setLovefromid(Integer lovefromid) {
        this.lovefromid = lovefromid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}