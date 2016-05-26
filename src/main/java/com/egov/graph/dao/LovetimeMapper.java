package com.egov.graph.dao;

import com.egov.graph.model.Lovetime;

public interface LovetimeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Lovetime record);

    int insertSelective(Lovetime record);

    Lovetime selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Lovetime record);

    int updateByPrimaryKey(Lovetime record);
}