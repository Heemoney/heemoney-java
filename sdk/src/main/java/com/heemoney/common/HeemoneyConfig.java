package com.heemoney.common;

public class HeemoneyConfig {
	//=======【基本信息设置】=====================================
    /* 汇收银商户信息配置
     * APP_ID：汇收银应用ID
     * MCH_ID：汇收银商户号
     * KEY：汇收银支付密钥
    */
    public final static String APP_ID = "app_JWsWp1q1nIgtjA4E";
    public final static String MCH_ID = "1970535";
    public final static String KEY = "123456789";

    //=======【Host设置】===================================== 
    public final static String ApiBase = "http://192.168.2.95/PayHeemoney";
    public final static String Version = "/api/v1";

    //=======【请求Url】===================================== 
    public final static String PAY_URL = "/pay";
    public final static String PAY_Test_URL = "/test";
    public final static String Query_URL = "/query";
    public final static String Refund_URL = "/refund";

    //=======【超时时间设置】===================================== 
    public final static int TIME_OUT = 60000;
}
