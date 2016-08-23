package com.heemoney.model;

/**
 * 退款请求类，封装了Heemoney退款请求信息
 * 
 * @author DavidKong
 * @since 2016.7.29
 */
public class RefundRequest {
	private String version;
	
	private String app_id;
	
	private String mch_id;
	
	private String charset;
	
	private String timestamp;
	
	private String sign_type;
	
	private String out_trade_no;
	
	private String out_refund_no;
	
	private String channel_provider;
	
	private String currency;
	
	private String total_amt_fen;
	
	private String refund_amt_fen;
	
	private String notify_url;
	
	private String merch_extra;

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

	public String getOut_trade_no() {
		return out_trade_no;
	}

	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}

	public String getOut_refund_no() {
		return out_refund_no;
	}

	public void setOut_refund_no(String out_refund_no) {
		this.out_refund_no = out_refund_no;
	}

	public String getChannel_provider() {
		return channel_provider;
	}

	public void setChannel_provider(String channel_provider) {
		this.channel_provider = channel_provider;
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

	public String getRefund_amt_fen() {
		return refund_amt_fen;
	}

	public void setRefund_amt_fen(String refund_amt_fen) {
		this.refund_amt_fen = refund_amt_fen;
	}

	public String getNotify_url() {
		return notify_url;
	}

	public void setNotify_url(String notify_url) {
		this.notify_url = notify_url;
	}

	public String getMerch_extra() {
		return merch_extra;
	}

	public void setMerch_extra(String merch_extra) {
		this.merch_extra = merch_extra;
	}
}
