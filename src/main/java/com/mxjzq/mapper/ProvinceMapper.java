package com.mxjzq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mxjzq.entity.Province;

@Mapper
public interface ProvinceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Province record);

    int insertSelective(Province record);

    Province selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Province record);

    int updateByPrimaryKey(Province record);
    
    List<Province> selectProviceAll();
}