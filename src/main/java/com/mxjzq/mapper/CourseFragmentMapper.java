package com.mxjzq.mapper;

import com.mxjzq.entity.CourseFragment;

public interface CourseFragmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseFragment record);

    int insertSelective(CourseFragment record);

    CourseFragment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseFragment record);

    int updateByPrimaryKey(CourseFragment record);
}