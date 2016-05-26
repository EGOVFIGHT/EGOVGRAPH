package com.egov.graph.dao;

import com.egov.graph.model.Stat;

public interface StatMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Stat record);

    int insertSelective(Stat record);

    Stat selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stat record);

    int updateByPrimaryKey(Stat record);
}