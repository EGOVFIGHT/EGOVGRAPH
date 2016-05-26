package com.egov.graph.model;

public class Role {
    private Integer id;

    private String rolename;

    private String rolenum;

    private String remark;

    public Role(Integer id, String rolename, String rolenum, String remark) {
        this.id = id;
        this.rolename = rolename;
        this.rolenum = rolenum;
        this.remark = remark;
    }

    public Role() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRolenum() {
        return rolenum;
    }

    public void setRolenum(String rolenum) {
        this.rolenum = rolenum == null ? null : rolenum.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}