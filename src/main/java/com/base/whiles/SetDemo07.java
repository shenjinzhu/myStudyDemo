package com.base.whiles;

import java.util.ArrayList;
import java.util.List;

public class SetDemo07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Tom");
		list.add("Jerry");
		list.add("������");
		list.add("�����");
		System.out.println(list);
		String name=list.get(2);
		System.out.println(name);
		//set �������滻Ԫ��
		name=list.set(1,"������");
		System.out.println(list);
		//����Ԫ��
		list.set(2,list.set(3, list.get(2)));
		System.out.println(list);
		
	}

}
