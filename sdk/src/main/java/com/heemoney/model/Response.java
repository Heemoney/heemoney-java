package com.heemoney.model;

/**
 * 响应类，封装了Heemoney基础响应信息
 * 
 * @author DavidKong
 * @since 2016.7.29
 */
public class Response {
	private String request_url;
	
	private String request_data;
	
	private String response_data;

	public String getRequest_url() {
		return request_url;
	}

	public void setRequest_url(String request_url) {
		this.request_url = request_url;
	}

	public String getRequest_data() {
		return request_data;
	}

	public void setRequest_data(String request_data) {
		this.request_data = request_data;
	}

	public String getResponse_data() {
		return response_data;
	}

	public void setResponse_data(String response_data) {
		this.response_data = response_data;
	}
}
