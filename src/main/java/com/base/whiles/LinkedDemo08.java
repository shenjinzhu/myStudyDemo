package com.base.whiles;

import java.util.LinkedList;
import java.util.List;

public class LinkedDemo08 {
	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();
		list.add("Tom");
		list.add("Jerry");
		list.add("ÌÆÈı²Ø");
		list.add("ËïÎò¿Õ");
		System.out.println(list);
		list.add(4,"Ğ¡°×Áú");
		System.out.println(list);
		String name=list.remove(4);
		System.out.println(list);
		System.out.println(name);
	}
}
