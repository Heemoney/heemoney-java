package com.heemoney.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.heemoney.*;
import com.heemoney.common.HeemoneyConfig;
import com.heemoney.model.*;
import com.heemoney.util.HeemoneyUtils;;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		String time = format.format(date);

		PayRequest payRequest = new PayRequest();
		payRequest.setApp_id(HeemoneyConfig.APP_ID);
		payRequest.setMch_id(HeemoneyConfig.MCH_ID);
		payRequest.setBill_timeout("6");
		payRequest.setChannel_provider("WeiXin");
		payRequest.setChannel_code("WX_NATIVE");
		payRequest.setCharset("gb2312");
		payRequest.setCurrency("CNY");
		payRequest.setOut_trade_no(time);
		payRequest.setSign_type("MD5");
		payRequest.setSubject("ceshi");
		payRequest.setTimestamp(HeemoneyUtils.getTimestamp());
		payRequest.setTotal_amt_fen("1");
		payRequest.setUser_ip("127.0.0.1");
		payRequest.setVersion("1");
		payRequest.setMerch_extra("");
		payRequest.setMeta_option("");
		payRequest.setPay_option("");
		payRequest.setSubject_detail("");
		payRequest.setUser_identity("");
		payRequest.setNotify_url("https://www.heemoney.com");
		payRequest.setReturn_url("https://www.heemoney.com");

		try {
			PayResponse payResponse = Heemoney.pay(payRequest);
			String page_url = null;

			if (payResponse != null) {
				if (payResponse.getReturn_code().equals("SUCCESS")) {
					if (payResponse.getErr_code().equals("E0000")) {
						String hy_pay_extra = payResponse.getHy_pay_extra();
						Gson gson = new Gson();
						Map<String, Object> map = gson.fromJson(hy_pay_extra, new TypeToken<Map<String, Object>>() {
						}.getType());
						page_url = map.get("page_url").toString();
						System.out.println(page_url);
					}
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
