  package com.base.string2;

public class AutoBoxingDemo12 {
	public static void main(String[] args) {
		//Integer i=100;      //擦除这行
		//替换为如下代码
		Integer i=Integer.valueOf(100);
		//Integer.valueOf(100)将 int 100包装成为Integer类型的对象（穿上马甲）
		Integer n=200;
		int k=n;//Integer->int
		//编译器擦除（替换） int k=n.intValue()    int->Integer(包装)   Integer->int (拆包)	
		//包装类计算性能很差
		Integer x=5;
		Integer y=x+6;
		
		/*
		 * 包装类的意义：将基本类型转换为对象
		 * 可以按照对象操作数据。比如：包装可以为对象以后就可以保存在”集合“中
		 */
		int[]arr;
		int[]abc=new int[5];
		int[]ac={1,2};
			
	}
}
