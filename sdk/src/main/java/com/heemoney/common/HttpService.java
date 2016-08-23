package com.heemoney.common;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import com.heemoney.exception.HeemoneyException;

public class HttpService {

	public static String Post(String requestUrl, String requestData, int timeout) throws HeemoneyException {
		
		HttpURLConnection connection = null;
		PrintWriter out = null;
		BufferedReader in = null;
		StringBuffer result = new StringBuffer();

		try {
			URL url = new URL(requestUrl);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json");

//			connection.setReadTimeout(timeout);
//			connection.setConnectTimeout(timeout);
//			connection.setDoInput(true);
			connection.setDoOutput(true);

			// 获取URLConnection对象对应的输出流
			out = new PrintWriter(connection.getOutputStream());
			// 发送请求参数
			out.print(requestData);
			// flush输出流的缓冲
			out.flush();

			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
			String line;
			while ((line = in.readLine()) != null) {
				result.append(line);
			}			
			return result.toString();
		} catch (Exception e) {
			throw new HeemoneyException(e.getMessage());
		} finally {
			if (connection != null) {
				connection.disconnect();
			}
		}
	}
}
