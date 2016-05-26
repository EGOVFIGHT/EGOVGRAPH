package com.egov.graph.model;

import java.util.Date;

public class Photo {
    private Long id;

    private String title;

    private String url;

    private String picSmallUrl;

    private Date ctime;

    private Integer parentid;

    private String keyword;

    private Boolean ischeck;

    private Integer authorid;

    private Boolean isdel;

    private String wfrom;

    private Integer vtime;

    private Integer width;

    private Integer height;

    private Long sizes;

    private Boolean isrecommend;

    private Integer adminid;

    private Integer lovetime;

    public Photo(Long id, String title, String url, String picSmallUrl, Date ctime, Integer parentid, String keyword, Boolean ischeck, Integer authorid, Boolean isdel, String wfrom, Integer vtime, Integer width, Integer height, Long sizes, Boolean isrecommend, Integer adminid, Integer lovetime) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.picSmallUrl = picSmallUrl;
        this.ctime = ctime;
        this.parentid = parentid;
        this.keyword = keyword;
        this.ischeck = ischeck;
        this.authorid = authorid;
        this.isdel = isdel;
        this.wfrom = wfrom;
        this.vtime = vtime;
        this.width = width;
        this.height = height;
        this.sizes = sizes;
        this.isrecommend = isrecommend;
        this.adminid = adminid;
        this.lovetime = lovetime;
    }

    public Photo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPicSmallUrl() {
        return picSmallUrl;
    }

    public void setPicSmallUrl(String picSmallUrl) {
        this.picSmallUrl = picSmallUrl == null ? null : picSmallUrl.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Boolean getIscheck() {
        return ischeck;
    }

    public void setIscheck(Boolean ischeck) {
        this.ischeck = ischeck;
    }

    public Integer getAuthorid() {
        return authorid;
    }

    public void setAuthorid(Integer authorid) {
        this.authorid = authorid;
    }

    public Boolean getIsdel() {
        return isdel;
    }

    public void setIsdel(Boolean isdel) {
        this.isdel = isdel;
    }

    public String getWfrom() {
        return wfrom;
    }

    public void setWfrom(String wfrom) {
        this.wfrom = wfrom == null ? null : wfrom.trim();
    }

    public Integer getVtime() {
        return vtime;
    }

    public void setVtime(Integer vtime) {
        this.vtime = vtime;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Long getSizes() {
        return sizes;
    }

    public void setSizes(Long sizes) {
        this.sizes = sizes;
    }

    public Boolean getIsrecommend() {
        return isrecommend;
    }

    public void setIsrecommend(Boolean isrecommend) {
        this.isrecommend = isrecommend;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Integer getLovetime() {
        return lovetime;
    }

    public void setLovetime(Integer lovetime) {
        this.lovetime = lovetime;
    }
}