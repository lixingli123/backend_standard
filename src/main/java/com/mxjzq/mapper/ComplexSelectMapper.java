package com.mxjzq.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ComplexSelectMapper {
	
	List<HashMap<String,Object>> selectSubject(String organization);
	List<HashMap<String,Object>> selectKnowledgeCourse(@Param(value="knowledge") String knowledge);
}
