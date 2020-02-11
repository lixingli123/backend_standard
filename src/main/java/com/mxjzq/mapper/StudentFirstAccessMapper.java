package com.mxjzq.mapper;

import com.mxjzq.entity.StudentFirstAccess;

public interface StudentFirstAccessMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentFirstAccess record);

    int insertSelective(StudentFirstAccess record);

    StudentFirstAccess selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentFirstAccess record);

    int updateByPrimaryKey(StudentFirstAccess record);
}