package com.base.string;


/**
 * 文档注释可以修饰三个地方：
 * 类，常量，方法
 * 在类上声明。是用来说明当前类的设计目的
 * 
 * 当前类是用来测试文档注释的使用
 * @author adminitartor
 * @version 1.0 2016/07/22
 * @see java.lang.String
 */
public class ApiDocDemo {

		public static final String INFO="你好！";
		/**
		 * 为给定的用户名添加一个问候语
		 * @param name 指定的用户名
		 * @return 含有用户名的问候语
		 */
		public static String sayHello(String name){
			return INFO+name;
		}
	
	
}
