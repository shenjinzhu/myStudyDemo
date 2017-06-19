package com.base.string;

/**
 * String toUpperCase()
 * String toLowerCase()
 * 将当前字符串中的英文部分转换为全大写或全小写
 * @author nbtarena
 *
 */
public class StringDemo9 {
	public static void main(String[] args) {
		String str="Hello World";
		String upper=str.toUpperCase();
		System.out.println(upper);
		String lower=str.toLowerCase();
		System.out.println(lower);
	}
}	
