package com.base.whiles;

import java.util.ArrayList;
import java.util.Collection;

public class AddAllDemo03 {

	public static void main(String[] args) {
		//���ͣ��ڼ����е����ã�����Լ��������Ԫ�ص�����
		//��֤Ԫ������һ�£�������ͬԪ����ɵ����д���
		
		//Լ��������ֻ�ܴ洢String���͵�����
		//���Υ���˽����ֱ�����󣡣���
		Collection<String> col=new ArrayList<String>();
		col.add("��Ͱ��ʬ");
		//col.add(12);�������Υ���˷��͵�Լ��
		col.add("���˽�ʬ");
		col.add("���߽�ʬ");
		System.out.println(col);
		//�����ڶ�������
		Collection<String> col2=new ArrayList<String>();
		col2.add("��Ͱ��ʬ");
		col2.add("���߽�ʬ");
		col2.add("Ǳˮ��ʬ");
		System.out.println(col2);
		
		//���� ��col2��ȫ��Ԫ�غϲ���col ��
		col.addAll(col2);
		System.out.println(col);
		//���col���Ƿ����ȫ��col2�е�Ԫ�أ�ȫ����������true�����򷵻�false
		System.out.println(col.containsAll(col2));
		System.out.println(col2.containsAll(col));
		
	}

}
