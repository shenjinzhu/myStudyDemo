package com.base.calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * 测试：将Date类型转换为Calendar
 * 如果Date类型时间，需要利用Calendar提供的方法进行时间计算，
 * 就需要将Date转换为Calendar
 * @author nbtarena
 *
 */
public class CalendarDemo13 {
	public static void main(String[] args) {
		long t=System.currentTimeMillis();
		t+=1000L*60*60*24*8;
		Date d=new Date(t);
		Calendar cal=Calendar.getInstance();
		cal.setTime(d);//将cal的时间改成d代表的时间
		int mon=cal.get(Calendar.MONTH);
		int day=cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(mon+1);
		System.out.println(day);
	}
}
