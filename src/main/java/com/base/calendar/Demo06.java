package com.base.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo06 {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");
		boolean i=true;
		String regex="\\d{4}-\\d{1,2}-\\d{1,2}";
		String s;
		do{
			s=scan.next();
			if(s.matches(regex)){
				Date d=fmt.parse(s);
				System.out.println(d);
				i= false;
			}else{
				System.out.println(" ‰»Î”–ŒÛ");
			}
		}while(i);
	}
}
