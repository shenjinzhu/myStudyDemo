package com.base.calendar;

import java.util.Calendar;

/**
 * ����ʱ������޸�calendar
 */
public class CalwndarDemo09 {
	public static void main(String[] args) {
		//����Calendar����Ĭ���ǵ�ǰʱ��
		Calendar cal=Calendar.getInstance();
		//����޸Ľ��
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH);
		int day=cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		cal.set(Calendar.YEAR, 1994);
		cal.set(Calendar.MONTH, Calendar.DECEMBER);
		cal.set(Calendar.DAY_OF_MONTH, 3);
		long start=cal.getTimeInMillis();
		cal.set(Calendar.YEAR, 1994+80);
		cal.set(Calendar.MONTH, Calendar.DECEMBER);
		cal.set(Calendar.DAY_OF_MONTH, 3);
		long end=cal.getTimeInMillis();
		System.out.println((end-start)/24/60/60/1000);
		
	}
}

