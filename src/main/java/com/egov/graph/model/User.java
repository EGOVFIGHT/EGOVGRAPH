package com.egov.graph.model;

import java.util.Date;

public class User {
    private Integer id;

    private String sno;

    private String psd;

    private Date ctime;

    private Integer age;

    private Date birthday;

    private String realname;

    private String roleid;

    private Integer lovetime;

    private String logo;

    private Integer mosttime;

    private String info;

    public User(Integer id, String sno, String psd, Date ctime, Integer age, Date birthday, String realname, String roleid, Integer lovetime, String logo, Integer mosttime, String info) {
        this.id = id;
        this.sno = sno;
        this.psd = psd;
        this.ctime = ctime;
        this.age = age;
        this.birthday = birthday;
        this.realname = realname;
        this.roleid = roleid;
        this.lovetime = lovetime;
        this.logo = logo;
        this.mosttime = mosttime;
        this.info = info;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd == null ? null : psd.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public Integer getLovetime() {
        return lovetime;
    }

    public void setLovetime(Integer lovetime) {
        this.lovetime = lovetime;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public Integer getMosttime() {
        return mosttime;
    }

    public void setMosttime(Integer mosttime) {
        this.mosttime = mosttime;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}