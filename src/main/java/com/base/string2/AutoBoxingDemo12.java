  package com.base.string2;

public class AutoBoxingDemo12 {
	public static void main(String[] args) {
		//Integer i=100;      //��������
		//�滻Ϊ���´���
		Integer i=Integer.valueOf(100);
		//Integer.valueOf(100)�� int 100��װ��ΪInteger���͵Ķ��󣨴�����ף�
		Integer n=200;
		int k=n;//Integer->int
		//�������������滻�� int k=n.intValue()    int->Integer(��װ)   Integer->int (���)	
		//��װ��������ܺܲ�
		Integer x=5;
		Integer y=x+6;
		
		/*
		 * ��װ������壺����������ת��Ϊ����
		 * ���԰��ն���������ݡ����磺��װ����Ϊ�����Ժ�Ϳ��Ա����ڡ����ϡ���
		 */
		int[]arr;
		int[]abc=new int[5];
		int[]ac={1,2};
			
	}
}
