package com.mxjzq.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mxjzq.entity.SysDic;
import com.mxjzq.mapper.ComplexSelectMapper;
import com.mxjzq.mapper.SysDicMapper;
import com.mxjzq.service.ComplexSelectService;
import com.mxjzq.util.ResponseHandle;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class ComplexSelectServiceImpl implements ComplexSelectService{

	@Autowired
	private ComplexSelectMapper complexSelectMapper;
	@Autowired
	private SysDicMapper sysDicMapper;
	
	@Override
	public String selectSubject(String organization) {
		//String name = sysDicMapper.selectNameByCode(str);
		List<HashMap<String, Object>> courseList = complexSelectMapper.selectSubject(organization);
		List<HashMap<String, Object>> tempList = new ArrayList<HashMap<String, Object>>();
		HashMap<String,Object> resultMap = new HashMap<String,Object>();
		for(HashMap<String, Object> map : courseList) {	
			String subjectcode = (String) map.get("subjectcode");
			map.put("subjectcodeName", sysDicMapper.selectNameByCode(subjectcode));
			//获取知识点
			String knowledges = (String)map.get("knowledge");
			String[] knowledge = knowledges.split(",");
			List<String> collect = Arrays.asList(knowledge).stream().sorted().collect(Collectors.toList());
			//存放科目下的知识点
			List<HashMap<String,Object>> knowledgesList = new ArrayList<HashMap<String,Object>>();
			for(String str :collect) {
				HashMap<String,Object> knowledgeMap = new HashMap<String,Object>();
				knowledgeMap.put("knowledge", str);
				knowledgeMap.put("knowledgeName", sysDicMapper.selectNameByCode(str));
				List<HashMap<String, Object>> subCourseList = complexSelectMapper.selectKnowledgeCourse(str);
				for(HashMap<String, Object> map1 : subCourseList) {	
					String subjectcode1 = (String) map.get("subjectcode");
					map1.put("subjectcodeName", sysDicMapper.selectNameByCode(subjectcode1));
				}
				knowledgeMap.put("subCourse", subCourseList);
				knowledgesList.add(knowledgeMap);
			}
			map.put("knowledges", knowledgesList);
			tempList.add(map);
			resultMap.put("result", tempList);	
		}
		JSONObject json = new JSONObject(resultMap);
		return ResponseHandle.response("N", json.toString());
	}

}
