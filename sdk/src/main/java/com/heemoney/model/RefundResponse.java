package com.heemoney.model;

/**
 * 退款响应类，封装了Heemoney退款响应信息
 * 
 * @author DavidKong
 * @since 2016.7.29
 */
public class RefundResponse extends Response {
	private String return_code;

	private String err_code;

	private String err_code_des;

	private String version;

	private String app_id;

	private String mch_id;

	private String charset;

	private String sign_type;

	private String out_trade_no;

	private String out_refund_no;

	private String hy_bill_no;

	private String channel_provider;

	private String currency;

	private String total_amt_fen;

	private String refund_fen_amt;

	private String refund_status;

	private String refund_msg;

	private String deal_time;

	private String merch_extra;

	private String hy_pay_extra;

	public String getReturn_code() {
		return return_code;
	}

	public void setReturn_code(String return_code) {
		this.return_code = return_code;
	}

	public String getErr_code() {
		return err_code;
	}

	public void setErr_code(String err_code) {
		this.err_code = err_code;
	}

	public String getErr_code_des() {
		return err_code_des;
	}

	public void setErr_code_des(String err_code_des) {
		this.err_code_des = err_code_des;
	}

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

	public String getHy_bill_no() {
		return hy_bill_no;
	}

	public void setHy_bill_no(String hy_bill_no) {
		this.hy_bill_no = hy_bill_no;
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

	public String getRefund_fen_amt() {
		return refund_fen_amt;
	}

	public void setRefund_fen_amt(String refund_fen_amt) {
		this.refund_fen_amt = refund_fen_amt;
	}

	public String getRefund_status() {
		return refund_status;
	}

	public void setRefund_status(String refund_status) {
		this.refund_status = refund_status;
	}

	public String getRefund_msg() {
		return refund_msg;
	}

	public void setRefund_msg(String refund_msg) {
		this.refund_msg = refund_msg;
	}

	public String getDeal_time() {
		return deal_time;
	}

	public void setDeal_time(String deal_time) {
		this.deal_time = deal_time;
	}

	public String getMerch_extra() {
		return merch_extra;
	}

	public void setMerch_extra(String merch_extra) {
		this.merch_extra = merch_extra;
	}

	public String getHy_pay_extra() {
		return hy_pay_extra;
	}

	public void setHy_pay_extra(String hy_pay_extra) {
		this.hy_pay_extra = hy_pay_extra;
	}
}
