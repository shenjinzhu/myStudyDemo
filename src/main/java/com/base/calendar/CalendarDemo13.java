package com.base.calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * ���ԣ���Date����ת��ΪCalendar
 * ���Date����ʱ�䣬��Ҫ����Calendar�ṩ�ķ�������ʱ����㣬
 * ����Ҫ��Dateת��ΪCalendar
 * @author nbtarena
 *
 */
public class CalendarDemo13 {
	public static void main(String[] args) {
		long t=System.currentTimeMillis();
		t+=1000L*60*60*24*8;
		Date d=new Date(t);
		Calendar cal=Calendar.getInstance();
		cal.setTime(d);//��cal��ʱ��ĳ�d�����ʱ��
		int mon=cal.get(Calendar.MONTH);
		int day=cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(mon+1);
		System.out.println(day);
	}
}
