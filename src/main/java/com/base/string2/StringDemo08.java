package com.base.string2;

import java.util.Date;

public class StringDemo08 {

	public static void main(String[] args) {
		//Java�ṩ��API������д��equals���� 
		String s0="ABC";//�ַ���������
		String s1=new String();
		String s2=new String();
		// ==�Ų��������ַ�����ȱȽϣ�
		System.out.println(s1==s2);//false
		
		System.out.println(s1.equals(s2));
		//�ַ���String��д��equals���������ڱȽ��ַ����Ƿ����
		Date d1=new Date(10000);
		Date d2=new Date(10000);
		System.out.println(d1.equals(d2));
	}

}
