package com.base.whiles;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * �������ӿ���ʾ
 * 
 */
public class IteratorDemo05 {
	public static void main(String[] args) {
		Collection<String> col=new HashSet<String>();
		col.add("��");
		col.add("��");
		col.add("��");
		col.add("��");
		col.add("����");
		System.out.println(col);
		Iterator<String> it=col.iterator();
		while(it.hasNext()){
			//�����ڼ䲻��ʹ��col.add  col.remove�ȷ���
			String s=it.next();
			System.out.println(s);
			if(s.equals("����")){
				System.out.println();
				System.out.println("����");
				System.out.println();
				//�������ṩ�İ�ȫɾ������
				//�����ڵ�����Ԫ�ش�ԭ������ɾ����
				//�ڵ����ڼ�ʱ��ɾ��ԭ�����е�Ԫ��
				it.remove();
			}
		}
		System.out.println(col);
	}
}
