package com.base.string;
/**
 * static String valueOf(XXX xxx)
 * String �ṩ��һ�����صľ�̬����valueOf
 * �����ǽ�����������ת��Ϊ�ַ�������õ�
 * �����ǽ���������ת��Ϊ�ַ���
 * @author nbtarena
 *
 */
public class StringDemo10 {
	public static void main(String[] args) {
		int a=100;
		String astr=String.valueOf(a);
		String astrs=astr+0;
		astrs=astrs+100;
		System.out.println(astrs);
	}
}
