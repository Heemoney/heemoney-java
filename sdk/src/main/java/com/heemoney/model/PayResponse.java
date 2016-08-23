package com.heemoney.model;

/**
 * 支付响应类，封装了Heemoney响应信息
 * 
 * @author DavidKong
 * @since 2016.7.29
 */
public class PayResponse extends Response {
	private String return_code;

	private String err_code;

	private String err_code_des;

	private String version;

	private String app_id;

	private String mch_id;

	private String charset;

	private String out_trade_no;

	private String hy_bill_no;

	private String trade_status;

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

	public String getOut_trade_no() {
		return out_trade_no;
	}

	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}

	public String getHy_bill_no() {
		return hy_bill_no;
	}

	public void setHy_bill_no(String hy_bill_no) {
		this.hy_bill_no = hy_bill_no;
	}

	public String getTrade_status() {
		return trade_status;
	}

	public void setTrade_status(String trade_status) {
		this.trade_status = trade_status;
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
