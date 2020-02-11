package com.mxjzq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.mxjzq.entity.Province;
import com.mxjzq.mapper.ProvinceMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/product/v1/")
public class ProductController {   

   @Autowired
   private ProvinceMapper provinceMapper;
   @RequestMapping("/getAllProvince")
   public String getProvince() {
	   List<Province> provinceList = provinceMapper.selectProviceAll();
	   JSONObject json = new JSONObject();
	   json.put("province", provinceList);
	   return json.toString();
   }
    
}