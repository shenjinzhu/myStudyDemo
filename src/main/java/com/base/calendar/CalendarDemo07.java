package com.base.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo07 {

	public static void main(String[] args) {
		//Ĭ�ϵ�Calendar�����ڲ��ǵ�ǰʱ��
		Calendar cal=new GregorianCalendar();
		//��ȡʱ�����
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH);
		int date=cal.get(Calendar.DAY_OF_MONTH);//�·ݣ���0��ʼ����Ҫ+1
		int week=cal.get(Calendar.DAY_OF_WEEK);
		//������1����һ��2���ܶ���3��������4��������5����5��6��������7
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		int minute=cal.get(Calendar.MINUTE);
		int second=cal.get(Calendar.SECOND);
		int sss=cal.get(Calendar.WEEK_OF_YEAR);//ÿ��ĵڼ���
		int am=cal.get(Calendar.AM_PM);//AM=0.PM=1;
		System.out.println(year);
		System.out.println(month+1);
		System.out.println(date);
		System.out.println(week-1);
		System.out.print(hour+":");
		System.out.print(minute+":");
		System.out.println(second);
		System.out.println(sss);
		System.out.println(am);
	}

}
