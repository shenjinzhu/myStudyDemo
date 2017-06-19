package com.base.string;

/**
 * java字符串常量池
 * java推荐使用字面量形式创建字符串对象
 * 并且，使用字面量创建的对象会缓存在JVM内部的字符串常量池中
 * 一旦发现再次使用该字面量创建字符串对象时，就不再重复创建对象，
 * 而是直接使用之前创建过的字符串对象.
 * @author nbtarena
 *
 */
public class StringDemo02 {
	public static void main(String[] args) {
		String s1="123abc";
		String s2="123abc";
		String s3="123abc";
		String s4="123"+"abc";
		
		/*
		 * 编译器优化：
		 * 编译器在编译源程序时若发现一个计算表达式的计算符两边都是字面量
		 * 时，会直接进行计算并将结果生成到编译后的class文件中。所以下面的
		 * 代码在class文件中为：String s4="123abc";
		 */
		
		String s5=new String("123abc");
		//new 一定创建新对象
		System.out.println(s1==s5);
		System.out.println(s1==s4);
	}
}
