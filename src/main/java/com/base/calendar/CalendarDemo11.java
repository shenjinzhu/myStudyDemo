package com.base.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo11 {
	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
//		cal.add(Calendar.MONTH,8);
//		int month=cal.get(Calendar.MONTH);
//		System.out.println(month);
		cal.add(Calendar.DAY_OF_YEAR,180);
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH)+1;
		int day=cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"-"+month+"-"+day);
		System.out.println(cal.getTime());
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(fmt.format(cal.getTime()));
		
	}
}
