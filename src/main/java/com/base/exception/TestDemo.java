package com.base.exception;

import java.io.PrintWriter;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class TestDemo {
	
	//@Test
	public void ExceptionDemo02(){
		System.out.println("begin");
		try{	
			String str="aaa";
			System.out.println(str.length());
			System.out.println(str.charAt(1));
			System.out.println(Integer.parseInt(str));
		}catch(NullPointerException e){
			System.out.println("空指针异常");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("字符串下标越界");
		}catch(Exception e){
			System.out.println("无敌是多么寂寞");	
		}
		/*
		 * 针对不同异常有不同处理手段时，可以分别去捕获那些异常，
		 * 但是最后一定要加一个最大的Exception。这样做可以避免
		 * 由于一个未捕获的异常导致程序中断
		 */
	}
	
	//@Test
	/**
	 * finally块
	 * finally必须定义在异常捕获机制的最后，它可以保证
	 * 内部的代码一定执行，无论try块中的代码是否出现异常，
	 * 通常会将注入释放资源等操作方在finally中
	 */	
	public void ExceptionDemo03(){
		System.out.println("begin");
		try{
			String str=null;
			System.out.println(str.length());
		}catch(Exception e){
			System.out.println("Exception");
		}finally{
			System.out.println("finally");
		}
		System.out.println("end");
	}
	
	@Test
	/**
	 * 流的异常处理
	 */
	public void ExceptionDemo04(){
		PrintWriter pw=null;
		try{
			pw=new PrintWriter("pw.txt");
			pw.println("hhe");
		}catch(Exception e){
			
		}finally{
			if(pw!=null){
				pw.close();
			}
		}
	}
	
	//@Test
	/**
	 * finally常见面试题
	 * final -----不能修改，不能被继承 
	 * finally-----异常处理机制中使用   
	 * finalize----object中定义的,在对象将被GC释放资源前，由JVM调用执行
	 * 若方法被重写，内容不应有耗时操作，否则影响GC工作
	 */
	public void ExceptionDemo05(){
		System.out.println(test("0")+","+test(null)+","+test(""));
	}
	@SuppressWarnings("finally")
	public static int test(String str){
		try{
			return str.charAt(0)-'0';
		}catch(NullPointerException e){
			System.out.println("空指针");
			return 1;
		}catch(Exception e){
			return 2;
		}finally{
			return 3;
			//finally必须执行
		}
		
	}
	
	//@Test
	/**
	 * 异常的抛出
	 * 
	 */
	public void ExceptionDemo06() throws Exception{
		
		Person p=new Person();
		p.setAge(1000);
		System.out.println("年龄是："+p.getAge());
	
	}
	
	
	
}
