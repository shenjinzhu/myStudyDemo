package com.base.string;

import java.util.Arrays;

/**
 * 由于字符串频繁修改对内存开销较大
 * java提供了一个用于修改字符串内容的类：
 * java.lang.StringBuilder
 * 其内部维护一个可变的字符数组，所以所有字符串内容修改都是在这个数组进行的
 * 不会每次修改都创建新对象。从而减少内存开销
 * 为此StringBuilder天生就是用来编辑字符串内容的类
 * @author nbtarena
 *
 */
public class StringBuilderDemo1 {
	public static void main(String[] args) {
		String str="努力学习java，为了找个好工作";
		StringBuilder builder=new StringBuilder(str);
		/**
		 * StringBuilder提供了用于编辑字符串的相关方法，包括：增删改插
		 * 
		 */
		/**
		 * 努力学习java，为了找个好工作
		 * 努力学习java,就是为了改变世界
		 */
		builder.replace(9,16,"就是为了改变世界");
		str=builder.toString();
		System.out.println(str);
		builder.append(",this my dream");
		System.out.println(builder.toString());
	}
}
