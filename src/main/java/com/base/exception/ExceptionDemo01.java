package com.base.exception;


/**
 * java异常捕获机制中的try-catch
 * try用来包含可能出现错误的代码片段
 * catch跟在try块之后，用来捕获并解决try块中代码出现的错误
 * try语句块不能独立存在，后面可以跟catch块或finally块
 */
public class ExceptionDemo01 {
	public static void main(String[] args) {
		System.out.println("begin");
		try{
		String s=null;
		/*
		 * JVM在执行到下面代码处若str为null时，
		 * 那么JVM会发现这里有一个空指针问题，
		 * 于是会实例化一个空指针（NullPointerException）
		 * 的异常实例并将它跑出来，这是JVM会检查当前出错代码片段
		 * 是否被try语句块包含，若没有，则认为当前代码段没有捕获异常的能力
		 * 于是将该异常抛出到当前代码片段所属方法（这里是main）之外，
		 * 由调用这个方法的代码片段去处理
		 */
		System.out.println(s.length());//空指针异常
		//try代码块中出错的代码后面的其他代码都不会 
		
		}catch(NullPointerException e){
			System.out.println("出现了空指针");
		}
		System.out.println("end");
	}

}
