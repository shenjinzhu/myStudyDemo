package com.base.whiles;

import java.util.Collection;
import java.util.HashSet;

public class AddAllDemo04 {

	/**
	 * ����addAll����ֵ
	 */
	public static void main(String[] args) {
		Collection<String> s1=new HashSet<String>();
		s1.add("�ó�");
		s1.add("����");
		s1.add("������");
		System.out.println(s1);
		Collection<String> s2=new HashSet<String>();
		s2.add("�ó�");
		s2.add("����");
		s2.add("Ģ��");
		System.out.println(s2);
		//����addAll����ֵ
		boolean b=s1.addAll(s2);
		System.out.println(s1);
		//���addAll�����ı��˼��ϵ����ݣ�����true
		//add����Ҳ��ͬ���ı伯�����ݣ�����true
		System.out.println(b);
	}

}
