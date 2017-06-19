package com.base.calendar;

import java.util.Date;

public class Demo03 {
	public static void main(String[] args) {
		//获取当前时间毫秒数
		long now=System.currentTimeMillis();
		//利用Date获取当前时间毫秒数
		Date date=new Date();
		date.getTime();
		//结果一样
		System.out.println(now);
		System.out.println(date.getTime());
		//setTime()改变时间毫秒数
		//计算300天以后是哪一年
		Date d=new Date();
		long l=d.getTime();
		l+=1000L*60*60*24*300;
		d.setTime(l);
		int year=d.getYear()+1900;
		int month=d.getMonth()+1;
		int day=d.getDate();
		int dayn=d.getDay();//返回是星期
		System.out.println(year+"\n"+month+"\n"+day+"\n"+"星期："+dayn);
		
	}
}
