package com.base.string2;


/**
 * String 支持正则表达式方法一：
 * boolean matches(String regex)
 * 根据给定的正则表达式判断当前字符串是否满足格式要求。
 * 满足则返回true
 * @author nbtarena
 *
 */
public class StringDemo01 {
	public static void main(String[] args) {
		/**
		 * 邮箱正则表达式
		 * [a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\.[a-zA-Z]+)+
		 */
		String regex="[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z]+)+";
		System.out.println(regex);
		String mail="assds@163.com";
		boolean tf=mail.matches(regex);
		if(!tf){
			System.out.print("不");
		}
		System.out.println("是邮箱地址");
	}
}
