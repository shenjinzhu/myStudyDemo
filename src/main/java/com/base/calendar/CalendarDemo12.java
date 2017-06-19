package com.base.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo12 {

	/**
	 * 如何格式化输出Calendar对象
	 */
	public static void main(String[] args) {
		/**
		 * 1.将Calendar对象转换为Date对象
		 * 	Date date=cal.getTime();
		 * 2.创建SimpleDateFormat对象
		 * 3.利用fmt.format方法将Date对象格式为日期字符串
		 * 4.输出日期字符串
		 */
		Calendar cal=Calendar.getInstance();
		Date date=cal.getTime();
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(fmt.format(date));
	}

}
