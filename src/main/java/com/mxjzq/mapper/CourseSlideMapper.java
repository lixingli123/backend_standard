package com.mxjzq.mapper;

import com.mxjzq.entity.CourseSlide;

public interface CourseSlideMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseSlide record);

    int insertSelective(CourseSlide record);

    CourseSlide selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseSlide record);

    int updateByPrimaryKey(CourseSlide record);
}