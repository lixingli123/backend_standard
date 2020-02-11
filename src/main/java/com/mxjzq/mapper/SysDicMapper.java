package com.mxjzq.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.mxjzq.entity.SysDic;
@Mapper
public interface SysDicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysDic record);

    int insertSelective(SysDic record);

    SysDic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysDic record);

    int updateByPrimaryKeyWithBLOBs(SysDic record);

    int updateByPrimaryKey(SysDic record);
    
    String selectNameByCode(String code);
}