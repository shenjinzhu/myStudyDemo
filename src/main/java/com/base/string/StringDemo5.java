package com.base.string;

/**
 * String substring(int start,int end)
 * ��ȡ��ǰ�ַ�����ָ����Χ�ڵ��ַ���
 * @author nbtarena
 *
 */
public class StringDemo5 {
	public static void main(String[] args) {
		String str="www.oracle.com";
		//��ȡoracle
		String s=str.substring(0,4);
		System.out.println(s);
		int start=str.indexOf(".")+1;
		int end=str.indexOf(".",start);
		String sub=str.substring(start,end);
		System.out.println(sub);
		//���ط��������ָ��λ��һ�½�ȡ���ַ�ĩβ
		sub=str.substring(start);
		System.out.println(sub);
	}
}
