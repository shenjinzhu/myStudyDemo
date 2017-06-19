package com.base.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo07 {

	public static void main(String[] args) {
		//默认的Calendar对象内部是当前时间
		Calendar cal=new GregorianCalendar();
		//获取时间分量
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH);
		int date=cal.get(Calendar.DAY_OF_MONTH);//月份，从0开始，需要+1
		int week=cal.get(Calendar.DAY_OF_WEEK);
		//周日是1，周一是2，周二是3，周三是4，周四是5，周5是6，周六是7
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		int minute=cal.get(Calendar.MINUTE);
		int second=cal.get(Calendar.SECOND);
		int sss=cal.get(Calendar.WEEK_OF_YEAR);//每年的第几周
		int am=cal.get(Calendar.AM_PM);//AM=0.PM=1;
		System.out.println(year);
		System.out.println(month+1);
		System.out.println(date);
		System.out.println(week-1);
		System.out.print(hour+":");
		System.out.print(minute+":");
		System.out.println(second);
		System.out.println(sss);
		System.out.println(am);
	}

}
