package com.base.exception;


/**
 * java�쳣��������е�try-catch
 * try�����������ܳ��ִ���Ĵ���Ƭ��
 * catch����try��֮���������񲢽��try���д�����ֵĴ���
 * try���鲻�ܶ������ڣ�������Ը�catch���finally��
 */
public class ExceptionDemo01 {
	public static void main(String[] args) {
		System.out.println("begin");
		try{
		String s=null;
		/*
		 * JVM��ִ�е�������봦��strΪnullʱ��
		 * ��ôJVM�ᷢ��������һ����ָ�����⣬
		 * ���ǻ�ʵ����һ����ָ�루NullPointerException��
		 * ���쳣ʵ���������ܳ���������JVM���鵱ǰ�������Ƭ��
		 * �Ƿ�try�����������û�У�����Ϊ��ǰ�����û�в����쳣������
		 * ���ǽ����쳣�׳�����ǰ����Ƭ������������������main��֮�⣬
		 * �ɵ�����������Ĵ���Ƭ��ȥ����
		 */
		System.out.println(s.length());//��ָ���쳣
		//try������г���Ĵ��������������붼���� 
		
		}catch(NullPointerException e){
			System.out.println("�����˿�ָ��");
		}
		System.out.println("end");
	}

}
