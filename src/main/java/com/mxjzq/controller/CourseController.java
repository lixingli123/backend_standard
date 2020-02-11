package com.mxjzq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.mxjzq.service.ComplexSelectService;
import com.mxjzq.util.ResponseHandle;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/course/v1/")
public class CourseController {
 
	@Autowired
	private ComplexSelectService complexSelectService;
	
	@RequestMapping(value = "/index",method = RequestMethod.POST)
	public String index(@RequestBody String data) {
		JSONObject json = (JSONObject) JSONObject.parse(data);
		String organization = (String) json.get("data");
		if(data == null || "".equals(data)) {
			log.info("传入的organization为空！");
			return ResponseHandle.responseError("E", "传入的organization为空！");
		}
		log.info("查询课程***********"+organization);
		return complexSelectService.selectSubject(organization);
	}
}
