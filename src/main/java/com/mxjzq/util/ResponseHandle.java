package com.mxjzq.util;

import com.alibaba.fastjson.JSONObject;

public class ResponseHandle {
	/**
	 * 返回信息处理
	 * @param responseType 返回是否成功 N-成功  E-失败
	 * @param responseData 后端返回前端数据
	 * @return String
	 */
	public static String response(String responseType,String responseData) {
		JSONObject json = new JSONObject();
		json.put("responseType", responseType);
		json.put("responseData", responseData);
		return json.toString();	
	}
	/**
	 * 返回信息处理
	 * @param responseType 返回是否成功 N-成功  E-失败
	 * @param remark 后端返回前端异常信息
	 * @return String
	 */
	public static String responseError(String responseType,String remark) {
		JSONObject json = new JSONObject();
		json.put("responseType", responseType);
		json.put("remark", remark);
		return json.toString();	
	}
}
