package com.base.calendar;

import java.util.Calendar;

public class CalendarDemo08 {
	public static void main(String[] args) {
		/**
		 * ���þ�̬����getInstance����Calendar�������й�ʱ������
		 * ��Ԫ������new GregorianCalendar()һ��
		 */
		Calendar cla=Calendar.getInstance();
		cla.set(Calendar.YEAR,2015);
		int year=cla.get(Calendar.YEAR);
		System.out.println(year);
	}
}
