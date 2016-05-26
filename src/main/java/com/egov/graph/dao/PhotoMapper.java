package com.egov.graph.dao;

import com.egov.graph.model.Photo;

public interface PhotoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Photo record);

    int insertSelective(Photo record);

    Photo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Photo record);

    int updateByPrimaryKey(Photo record);
}