package com.base.calendar;

import java.util.Date;

public class Demo02 {
	public static void main(String[] args) {
		Date date=new Date();
		int year=date.getYear()+1900;
		System.out.println(year);
		int month=date.getMonth();
		System.out.println(month+1);
		int day=date.getDate();
		System.out.println(day);
		long end=System.currentTimeMillis()+500*24*60*60*1000L;
		Date date1=new Date(end);
		System.out.println((date1.getYear()+1900)+"\n"+(date1.getMonth()+1)+"\n"+date1.getDate());
	}
}
