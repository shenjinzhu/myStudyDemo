package com.base.calendar;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

public class homework_day03 {

	public static void main(String[] args) {
		//第一题
//		Calendar cal=Calendar.getInstance();
//		SimpleDateFormat fam=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Date date=new Date();
//		System.out.println(fam.format(date.getTime()));
//		cal.set(Calendar.DAY_OF_MONTH,29);
//		Date date1=cal.getTime();
//		System.out.println(fam.format(date1));
		
		
		//第二题
//		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Date date=new Date();
//		System.out.println(fmt.format(date.getTime()));
		
		//第三题  1994-11-01
//		Scanner scan=new Scanner(System.in);
//		String regex="\\d{4}-\\d{1,2}-\\d{1,2}";
//		String regex1="[-]";
//		String s;
//		do{
//			System.out.println("输入年月日");
//			s=scan.next();
//		}while(!s.matches(regex));
//		String[] arr=s.split(regex1);
//		int[] arr1=new int[3];
//		long now=System.currentTimeMillis();
//		Calendar cal=Calendar.getInstance();
//		for(int i=0;i<3;i++){
//			arr1[i]=Integer.valueOf(arr[i]);
//		}
//		cal.set(Calendar.YEAR, arr1[0]);
//		cal.set(Calendar.MONTH, arr1[1]-1);
//		cal.set(Calendar.DAY_OF_MONTH, arr1[2]);
//		Date date=cal.getTime();
//		System.out.println((now-date.getTime())/24/60/60/1000L/7);
		
		//第四题
//		Scanner scan=new Scanner(System.in);
//		String regex="\\d{4}-\\d{1,2}-\\d{1,2}";
//		String regex1="[-]";
//		String s;
//		do{
//			System.out.println("输入年月日");
//			s=scan.next();
//		}while(!s.matches(regex));
//		String[] arr=s.split(regex1);
//		int[] arr1=new int[3];
//		Calendar cal=Calendar.getInstance();
//		for(int i=0;i<3;i++){
//		arr1[i]=Integer.valueOf(arr[i]);
//		}
//		cal.set(Calendar.YEAR, arr1[0]);
//		cal.set(Calendar.MONTH, arr1[1]);
//		cal.set(Calendar.DAY_OF_MONTH, arr1[2]);
//		cal.add(Calendar.DAY_OF_MONTH,180);
//		System.out.println(cal.getTime());
//		System.out.println("清仓日期");
//		int i=cal.get(Calendar.DAY_OF_WEEK);
//		SimpleDateFormat fam=new SimpleDateFormat();
//		int j=0;
//		if(i==1){j=-12;}
//		if(i==2){j=-13;}
//		if(i==3){j=-14;}
//		if(i==4){j=-15;}
//		if(i==5){j=-16;}
//		if(i==6){j=-17;}
//		if(i==7){j=-18;}
//		cal.set(Calendar.DAY_OF_MONTH, j);
//		Date date=cal.getTime();
//		System.out.println(fam.format(date));
			//第五题
//		Collection col=new ArrayList();
//		col.add("one");
//		col.add("two");
//		col.add("three");
//		System.out.println(col.size());
//		System.out.println(col.equals("four"));
//		System.out.println(col.isEmpty());
//		System.out.println(col);
//		col.clear();
	}
}


