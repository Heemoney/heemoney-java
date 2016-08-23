package com.heemoney.model;

/**
 * 支付请求类，封装了Heemoney请求信息
 * 
 * @author DavidKong
 * @since 2016.7.29
 */
public class PayRequest {
	private String version;

	private String app_id;

	private String mch_id;

	private String charset;

	private String timestamp;

	private String sign_type;

	private String channel_provider;

	private String channel_code;

	private String out_trade_no;

	private String currency;

	private String total_amt_fen;

	private String bill_timeout;

	private String subject;

	private String subject_detail;

	private String user_identity;

	private String user_ip;

	private String merch_extra;
	
	private String meta_option;

	private String pay_option;

	private String notify_url;

	private String return_url;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getApp_id() {
		return app_id;
	}

	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}

	public String getMch_id() {
		return mch_id;
	}

	public void setMch_id(String mch_id) {
		this.mch_id = mch_id;
	}

	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getSign_type() {
		return sign_type;
	}

	public void setSign_type(String sign_type) {
		this.sign_type = sign_type;
	}

	public String getChannel_provider() {
		return channel_provider;
	}

	public void setChannel_provider(String channel_provider) {
		this.channel_provider = channel_provider;
	}

	public String getChannel_code() {
		return channel_code;
	}

	public void setChannel_code(String channel_code) {
		this.channel_code = channel_code;
	}

	public String getOut_trade_no() {
		return out_trade_no;
	}

	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getTotal_amt_fen() {
		return total_amt_fen;
	}

	public void setTotal_amt_fen(String total_amt_fen) {
		this.total_amt_fen = total_amt_fen;
	}

	public String getBill_timeout() {
		return bill_timeout;
	}

	public void setBill_timeout(String bill_timeout) {
		this.bill_timeout = bill_timeout;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubject_detail() {
		return subject_detail;
	}

	public void setSubject_detail(String subject_detail) {
		this.subject_detail = subject_detail;
	}

	public String getUser_identity() {
		return user_identity;
	}

	public void setUser_identity(String user_identity) {
		this.user_identity = user_identity;
	}

	public String getUser_ip() {
		return user_ip;
	}

	public void setUser_ip(String user_ip) {
		this.user_ip = user_ip;
	}

	public String getMerch_extra() {
		return merch_extra;
	}

	public void setMerch_extra(String merch_extra) {
		this.merch_extra = merch_extra;
	}

	public String getMeta_option() {
		return meta_option;
	}

	public void setMeta_option(String meta_option) {
		this.meta_option = meta_option;
	}

	public String getPay_option() {
		return pay_option;
	}

	public void setPay_option(String pay_option) {
		this.pay_option = pay_option;
	}

	public String getNotify_url() {
		return notify_url;
	}

	public void setNotify_url(String notify_url) {
		this.notify_url = notify_url;
	}

	public String getReturn_url() {
		return return_url;
	}

	public void setReturn_url(String return_url) {
		this.return_url = return_url;
	}
}
