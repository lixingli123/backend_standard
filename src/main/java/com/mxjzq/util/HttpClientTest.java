package com.mxjzq.util;

import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSONObject;

public class HttpClientTest {
//	public static void main(String[] args) {
//		test();
//	}
	public static void test() {
		 HttpClient httpClient = new DefaultHttpClient();
		 String url = "http://172.20.10.6:8080/course/v1/index";
		 HttpPost httpPost = new HttpPost(url);
		 httpPost.addHeader("Content-type","application/json;charset=utf-8");
		 httpPost.setHeader("Accept","application/json");
		 JSONObject json = new JSONObject();
		 json.put("data", "1");
		 httpPost.setEntity(new StringEntity(json.toString(), Charset.forName("utf-8").toString()));
		 HttpResponse httpResponse;
		 try {
			httpResponse = httpClient.execute(httpPost);
			int code = httpResponse.getStatusLine().getStatusCode();
			System.out.println(code);
			String rev = EntityUtils.toString(httpResponse.getEntity());
			System.out.println(rev);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
