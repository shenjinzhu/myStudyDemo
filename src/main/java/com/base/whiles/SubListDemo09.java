package com.base.whiles;

import java.util.ArrayList;
import java.util.List;

public class SubListDemo09 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("����3");
		list.add("����3");
		list.add("����Q");
		list.add("����Q");
		list.add("�ݻ�Q");
		list.add("����Q");
		list.add("����K");
		System.out.println(list);
		//ȡ3-7
		List<String> bomb=list.subList(3, 7);
		System.out.println(bomb);
		bomb.remove(0);
		//���б������б�����ͬһ�洢�ռ�
		System.out.println(bomb);
		System.out.println(list);
		bomb.clear();
		System.out.println(list);
	}
}
