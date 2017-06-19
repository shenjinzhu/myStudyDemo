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
			System.out.println("��ָ���쳣");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("�ַ����±�Խ��");
		}catch(Exception e){
			System.out.println("�޵��Ƕ�ô��į");	
		}
		/*
		 * ��Բ�ͬ�쳣�в�ͬ�����ֶ�ʱ�����Էֱ�ȥ������Щ�쳣��
		 * �������һ��Ҫ��һ������Exception�����������Ա���
		 * ����һ��δ������쳣���³����ж�
		 */
	}
	
	//@Test
	/**
	 * finally��
	 * finally���붨�����쳣������Ƶ���������Ա�֤
	 * �ڲ��Ĵ���һ��ִ�У�����try���еĴ����Ƿ�����쳣��
	 * ͨ���Ὣע���ͷ���Դ�Ȳ�������finally��
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
	 * �����쳣����
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
	 * finally����������
	 * final -----�����޸ģ����ܱ��̳� 
	 * finally-----�쳣���������ʹ��   
	 * finalize----object�ж����,�ڶ��󽫱�GC�ͷ���Դǰ����JVM����ִ��
	 * ����������д�����ݲ�Ӧ�к�ʱ����������Ӱ��GC����
	 */
	public void ExceptionDemo05(){
		System.out.println(test("0")+","+test(null)+","+test(""));
	}
	@SuppressWarnings("finally")
	public static int test(String str){
		try{
			return str.charAt(0)-'0';
		}catch(NullPointerException e){
			System.out.println("��ָ��");
			return 1;
		}catch(Exception e){
			return 2;
		}finally{
			return 3;
			//finally����ִ��
		}
		
	}
	
	//@Test
	/**
	 * �쳣���׳�
	 * 
	 */
	public void ExceptionDemo06() throws Exception{
		
		Person p=new Person();
		p.setAge(1000);
		System.out.println("�����ǣ�"+p.getAge());
	
	}
	
	
	
}
