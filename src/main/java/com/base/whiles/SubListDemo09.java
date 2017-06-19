package com.base.whiles;

import java.util.ArrayList;
import java.util.List;

public class SubListDemo09 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("红桃3");
		list.add("方块3");
		list.add("红桃Q");
		list.add("黑桃Q");
		list.add("草花Q");
		list.add("方块Q");
		list.add("红桃K");
		System.out.println(list);
		//取3-7
		List<String> bomb=list.subList(3, 7);
		System.out.println(bomb);
		bomb.remove(0);
		//子列表与主列表，共享同一存储空间
		System.out.println(bomb);
		System.out.println(list);
		bomb.clear();
		System.out.println(list);
	}
}
