package com.base.string2;

public class NumberDemo09 {

	public static void main(String[] args) {
		Number n=9.96;
		//Number����ͨ�õ�����ת������
		//��ȫ�����඼�̳�����Щת�ͷ���
		//Integer Long Float Double Byte Short
		n=2000;
		long l=n.longValue();
		int i=n.intValue();
		double d=n.doubleValue();
		System.out.println(l);
		System.out.println(i);
		System.out.println(d);
	}

}
