package com.base.string2;

public class IntegerDemo10 {
	public static void main(String[] args) {
		//Javaͨ��parseInt������ʵ���˽�10�����ַ���ת����2��������
		//Ҳ����˵ͨ��parseInt����֧����10����
		String s="120122";
		int n=Integer.parseInt(s);
		System.out.println(n);
		s="-1";
		n=Integer.parseInt(s);
		System.out.println(Integer.toBinaryString(n));
		//�ڿ����У������Ҫ��10�����ַ���ת����int���ݽ��м���
		//�Ϳ��Ե����������
		//��������ȡ���֤��������ݵ���ֵ
		String id="330121199411013831";
		String y=id.substring(6,14);
		int year=Integer.parseInt(y);
		System.out.println("year:"+year/10000+"\nmonth:"+(year-year/10000*10000)/100);
		
	}
}
