package com.base.string;

/**
 * String substring(int start,int end)
 * 截取当前字符串中指定范围内的字符串
 * @author nbtarena
 *
 */
public class StringDemo5 {
	public static void main(String[] args) {
		String str="www.oracle.com";
		//截取oracle
		String s=str.substring(0,4);
		System.out.println(s);
		int start=str.indexOf(".")+1;
		int end=str.indexOf(".",start);
		String sub=str.substring(start,end);
		System.out.println(sub);
		//重载方法允许从指定位置一致截取到字符末尾
		sub=str.substring(start);
		System.out.println(sub);
	}
}
