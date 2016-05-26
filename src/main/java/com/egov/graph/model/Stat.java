package com.egov.graph.model;

public class Stat {
    private Integer id;

    private Long allnum;

    private Long viewalltiome;

    public Stat(Integer id, Long allnum, Long viewalltiome) {
        this.id = id;
        this.allnum = allnum;
        this.viewalltiome = viewalltiome;
    }

    public Stat() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getAllnum() {
        return allnum;
    }

    public void setAllnum(Long allnum) {
        this.allnum = allnum;
    }

    public Long getViewalltiome() {
        return viewalltiome;
    }

    public void setViewalltiome(Long viewalltiome) {
        this.viewalltiome = viewalltiome;
    }
}