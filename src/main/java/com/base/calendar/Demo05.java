package com.base.calendar;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo05 {							//抛出异常(仅供测试使用)
	public static void main(String[] args) throws Exception{
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date d=fmt.parse("2016-08-15 13:08:09");
		System.out.println(d);
	}
}
