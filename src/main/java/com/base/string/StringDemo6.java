package com.base.string;


/**
 * trim();
 * ��ȡ�ַ���ȥ�����߿հ�
 * @author nbtarena
 *
 */
public class StringDemo6 {
	public static void main(String[] args) {
		String str=" hello"+"          ";
		System.out.println(str);
		String trim=str.trim();
		System.out.println(trim);
	}
}
