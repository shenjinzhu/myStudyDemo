package com.base.calendar;

import java.util.Calendar;

public class CalendarDemo10 {

	/**
	 * 获取月份的最大天数
	 */
	public static void main(String[] args) {
		//1.创建CAlendar对象2016/7/26
		Calendar cal=Calendar.getInstance();
		//2.获取当月最大天数
		cal.set(Calendar.MONTH, Calendar.AUGUST);
		int day=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		//3.输出结果
		System.out.println(day);
		/*
		 * Actual:实际上
		 * 
		 */
		//输入全年最大天数
		Calendar c=Calendar.getInstance();
		int month;
		for(month=Calendar.JANUARY;month<=Calendar.DECEMBER;month++){
			c.set(Calendar.MONTH, month);
			int d=c.getActualMaximum(Calendar.DAY_OF_MONTH);
			System.out.println(d);
		}
		System.out.println("_______________________________");
		Calendar ddd=Calendar.getInstance();
		ddd.set(Calendar.YEAR, 2000);
		int day2=ddd.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(day2);
	}

}
