package com.base.string;
/**
 * static String valueOf(XXX xxx)
 * String 提供了一组重载的静态方法valueOf
 * 作用是将给定的内容转换为字符串，最常用的
 * 方法是将基本类型转换为字符串
 * @author nbtarena
 *
 */
public class StringDemo10 {
	public static void main(String[] args) {
		int a=100;
		String astr=String.valueOf(a);
		String astrs=astr+0;
		astrs=astrs+100;
		System.out.println(astrs);
	}
}
