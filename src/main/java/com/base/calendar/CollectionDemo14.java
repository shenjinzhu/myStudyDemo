package com.base.calendar;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo14 {
	public static void main(String[] args) {
		//������һ���¼��϶��󣬽�϶����в������κ���Ԫ��
		Collection col=new ArrayList();
		System.out.println(col);//�ռ���
		col.add("�۷�");
		col.add("��ɻ�");
		col.add("С�ɻ�");
		col.add(123);
		System.out.println(col);
		//add������װ���򼯺������Ԫ�ص��㷨
		//remove������װ�˴Ӽ�����ɾ��Ԫ�ص��㷨
		col.remove("�۷�");
		System.out.println(col);
		}
}
