package com.base.string;

/**
 * java�ַ���������
 * java�Ƽ�ʹ����������ʽ�����ַ�������
 * ���ң�ʹ�������������Ķ���Ỻ����JVM�ڲ����ַ�����������
 * һ�������ٴ�ʹ�ø������������ַ�������ʱ���Ͳ����ظ���������
 * ����ֱ��ʹ��֮ǰ���������ַ�������.
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
		 * �������Ż���
		 * �������ڱ���Դ����ʱ������һ��������ʽ�ļ�������߶���������
		 * ʱ����ֱ�ӽ��м��㲢��������ɵ�������class�ļ��С����������
		 * ������class�ļ���Ϊ��String s4="123abc";
		 */
		
		String s5=new String("123abc");
		//new һ�������¶���
		System.out.println(s1==s5);
		System.out.println(s1==s4);
	}
}
