package com.base.calendar;

import java.util.Calendar;

public class CalendarDemo10 {

	/**
	 * ��ȡ�·ݵ��������
	 */
	public static void main(String[] args) {
		//1.����CAlendar����2016/7/26
		Calendar cal=Calendar.getInstance();
		//2.��ȡ�����������
		cal.set(Calendar.MONTH, Calendar.AUGUST);
		int day=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		//3.������
		System.out.println(day);
		/*
		 * Actual:ʵ����
		 * 
		 */
		//����ȫ���������
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
