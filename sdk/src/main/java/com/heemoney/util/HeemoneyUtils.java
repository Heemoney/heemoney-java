package com.heemoney.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import com.heemoney.common.HeemoneyConfig;
import com.heemoney.common.MD5;

public class HeemoneyUtils {
	
	public static String getTimestamp()
	{
		long timeStamp=System.currentTimeMillis();
		return Long.toString(timeStamp);
	}
	
    public static String getSign(Map<String,Object> map){
        ArrayList<String> list = new ArrayList<String>();
        for(Map.Entry<String,Object> entry:map.entrySet()){
        	String vaule=entry.getValue().toString();
            if(!vaule.equals("")){
                list.add(entry.getKey() + "=" + entry.getValue() + "&");
            }
        }
        int size = list.size();
        String [] arrayToSort = list.toArray(new String[size]);
        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i ++) {
            sb.append(arrayToSort[i]);
        }
        String result = sb.toString();
        result += "key=" + HeemoneyConfig.KEY;

        System.out.println(result+"\n");
        
        result = MD5.MD5Encode(result).toUpperCase();
        
        System.out.println(result);
        return result;
    }
}
