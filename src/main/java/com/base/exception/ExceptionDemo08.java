package com.base.exception;

/**
 * �����쳣API
 */
public class ExceptionDemo08 {
	public static void main(String[] args) {
		System.out.println("begin");
		try{
			String str="a";
			System.out.println(Integer.valueOf(str));
		}catch(Exception e){
			/*
			 * �쳣�ĸ÷������Խ��쳣�Ĳ����������������
			 * �Ա������ǵ�������
			 */
			e.printStackTrace();
			String s=e.getMessage();
			System.out.println(s                                                                                                    );
		}
		System.out.println("end");
	}
}
