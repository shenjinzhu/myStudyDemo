package com.base.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo12 {

	/**
	 * ��θ�ʽ�����Calendar����
	 */
	public static void main(String[] args) {
		/**
		 * 1.��Calendar����ת��ΪDate����
		 * 	Date date=cal.getTime();
		 * 2.����SimpleDateFormat����
		 * 3.����fmt.format������Date�����ʽΪ�����ַ���
		 * 4.��������ַ���
		 */
		Calendar cal=Calendar.getInstance();
		Date date=cal.getTime();
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(fmt.format(date));
	}

}
