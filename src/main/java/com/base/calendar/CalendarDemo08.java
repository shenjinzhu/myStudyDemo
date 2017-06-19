package com.base.calendar;

import java.util.Calendar;

public class CalendarDemo08 {
	public static void main(String[] args) {
		/**
		 * 调用静态方法getInstance创建Calendar对象，在中国时区返回
		 * 公元历，与new GregorianCalendar()一样
		 */
		Calendar cla=Calendar.getInstance();
		cla.set(Calendar.YEAR,2015);
		int year=cla.get(Calendar.YEAR);
		System.out.println(year);
	}
}
