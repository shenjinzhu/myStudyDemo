package com.base.calendar;

import java.util.Date;

public class Demo03 {
	public static void main(String[] args) {
		//��ȡ��ǰʱ�������
		long now=System.currentTimeMillis();
		//����Date��ȡ��ǰʱ�������
		Date date=new Date();
		date.getTime();
		//���һ��
		System.out.println(now);
		System.out.println(date.getTime());
		//setTime()�ı�ʱ�������
		//����300���Ժ�����һ��
		Date d=new Date();
		long l=d.getTime();
		l+=1000L*60*60*24*300;
		d.setTime(l);
		int year=d.getYear()+1900;
		int month=d.getMonth()+1;
		int day=d.getDate();
		int dayn=d.getDay();//����������
		System.out.println(year+"\n"+month+"\n"+day+"\n"+"���ڣ�"+dayn);
		
	}
}
