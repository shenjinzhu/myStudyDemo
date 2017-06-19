package com.base.exception;

/**
 * 常用异常API
 */
public class ExceptionDemo08 {
	public static void main(String[] args) {
		System.out.println("begin");
		try{
			String str="a";
			System.out.println(Integer.valueOf(str));
		}catch(Exception e){
			/*
			 * 异常的该方法可以将异常的产生过程输出出来，
			 * 以便于我们调整错误
			 */
			e.printStackTrace();
			String s=e.getMessage();
			System.out.println(s                                                                                                    );
		}
		System.out.println("end");
	}
}
