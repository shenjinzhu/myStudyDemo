package com.base.exception;

import java.io.PrintWriter;

public class HomeWork {

	/**
	 * 今日异常复习
	 */
	public static void main(String[] args) {
			//异常一
//		System.out.println("begin");
//		String s=null;
//		try{
//			System.out.println(s.length());
//		}catch(NullPointerException e){
//			System.out.println("空指针异常");
//		}
//		System.out.println("end");
		
		//异常捕捉
//		System.out.println("begin");
//		try{
//			String s="aa";
//			System.out.println(s.charAt(1));
//			System.out.println(Integer.valueOf(s));
//		}catch(NullPointerException e){
//			System.out.println("空指针异常");
//		}catch(StringIndexOutOfBoundsException e){
//			System.out.println("字符串下标越界");
//		}catch(Exception e){
//			System.out.println("其他异常");
//		}
//		System.out.println("end");
		
		
		//流的异常处理
//		System.out.println("begin");
//		PrintWriter pw=null;
//		try{
//			pw=new PrintWriter("pw.txt");
//			pw.write("我在宁波2016");
//		}catch(Exception e){
//			System.out.println("有错误");
//		}finally{
//			if(pw!=null){
//				pw.close();
//			}
//		}
//		System.out.println("end");
		
		
		
	}

}
