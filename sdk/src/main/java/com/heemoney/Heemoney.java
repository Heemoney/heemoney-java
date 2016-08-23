package com.heemoney;

import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.heemoney.exception.HeemoneyException;
import com.heemoney.model.*;
import com.heemoney.util.HeemoneyUtils;
import com.heemoney.common.*;

/**
 * Heemoney SDK核心类， 包括支付、查单、退款等接口
 *
 * @author DavidKong
 * @since 2016.7.29
 */
public class Heemoney {
	private static Gson gson = new Gson();

	public static PayResponse pay(PayRequest payRequest) throws Exception {
		PayResponse payResponse = new PayResponse();
		try {
			String jsonData = gson.toJson(payRequest);
			Map<String, Object> map = gson.fromJson(jsonData, new TypeToken<Map<String, Object>>() {
			}.getType());
			map.put("sign", HeemoneyUtils.getSign(map));
			String requestData = gson.toJson(map);

			String requestUrl = HeemoneyConfig.ApiBase + HeemoneyConfig.Version + HeemoneyConfig.PAY_URL;
			String responseData = HttpService.Post(requestUrl, requestData, HeemoneyConfig.TIME_OUT);
			payResponse = gson.fromJson(responseData, PayResponse.class);

			payResponse.setRequest_url(requestUrl);
			payResponse.setRequest_data(requestData);
			payResponse.setResponse_data(responseData);
		} catch (Exception e) {
			throw new HeemoneyException(e.getMessage());
		}
		return payResponse;
	}

	public static QueryResponse pay(QueryRequest queryRequest) throws Exception {
		QueryResponse queryResponse = new QueryResponse();
		try {
			String jsonData = gson.toJson(queryRequest);
			Map<String, Object> map = gson.fromJson(jsonData, new TypeToken<Map<String, Object>>() {
			}.getType());
			map.put("sign", HeemoneyUtils.getSign(map));
			String requestData = gson.toJson(map);

			String requestUrl = HeemoneyConfig.ApiBase + HeemoneyConfig.Version + HeemoneyConfig.Query_URL;
			String responseData = HttpService.Post(requestUrl, requestData, HeemoneyConfig.TIME_OUT);
			queryResponse = gson.fromJson(responseData, QueryResponse.class);

			queryResponse.setRequest_url(requestUrl);
			queryResponse.setRequest_data(requestData);
			queryResponse.setResponse_data(responseData);
		} catch (Exception e) {
			throw new HeemoneyException(e.getMessage());
		}
		return queryResponse;
	}

	public static RefundResponse pay(RefundRequest refundRequest) throws Exception {
		RefundResponse refundResponse = new RefundResponse();
		try {
			String jsonData = gson.toJson(refundRequest);
			Map<String, Object> map = gson.fromJson(jsonData, new TypeToken<Map<String, Object>>() {
			}.getType());
			map.put("sign", HeemoneyUtils.getSign(map));
			String requestData = gson.toJson(map);

			String requestUrl = HeemoneyConfig.ApiBase + HeemoneyConfig.Version + HeemoneyConfig.Refund_URL;
			String responseData = HttpService.Post(requestUrl, requestData, HeemoneyConfig.TIME_OUT);
			refundResponse =  gson.fromJson(responseData, RefundResponse.class);

			refundResponse.setRequest_url(requestUrl);
			refundResponse.setRequest_data(requestData);
			refundResponse.setResponse_data(responseData);
		} catch (Exception e) {
			throw new HeemoneyException(e.getMessage());
		}
		return refundResponse;
	}
}
