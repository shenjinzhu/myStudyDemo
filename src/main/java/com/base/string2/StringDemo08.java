package com.base.string2;

import java.util.Date;

public class StringDemo08 {

	public static void main(String[] args) {
		//Java提供的API类大多重写了equals方法 
		String s0="ABC";//字符串字面量
		String s1=new String();
		String s2=new String();
		// ==号不能用于字符串相等比较！
		System.out.println(s1==s2);//false
		
		System.out.println(s1.equals(s2));
		//字符串String重写了equals方法，用于比较字符串是否相等
		Date d1=new Date(10000);
		Date d2=new Date(10000);
		System.out.println(d1.equals(d2));
	}

}
