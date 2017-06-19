package com.base.calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

//格式化时间输出格式
public class Demo04 {
	public static void main(String[] args) {
		SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date da=new Date();
		String str=date.format(da);
		long l=da.getTime()+1000L*24*60*60*300;
		String ss=date.format(l);
		System.out.println(str);
		System.out.println(ss);
	}
}
