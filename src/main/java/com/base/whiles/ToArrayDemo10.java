package com.base.whiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayDemo10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("Tom");
		list.add("Jerry");
		list.add("������");
		list.add("�����");
//		//�������е�Ԫ�ظ��Ƶ�Object���ͣ���Ԫ����String����
//		Object[]ary=list.toArray();
//		System.out.println(Arrays.toString(ary));
		String [] ary=new String[7];    
		ary=list.toArray(ary);
		System.out.println(Arrays.toString(ary));
		//����������ary��list������ͬ�����Ӧλ��������Ӧ����
		//����������ary����list���ȣ��������������飬����������ary��������list��ͬ
		//����������ary����list���ȣ�����ĩβ��ӿ��ַ�
		//���飡�����ȿ���ѡlist.length
	}

}
