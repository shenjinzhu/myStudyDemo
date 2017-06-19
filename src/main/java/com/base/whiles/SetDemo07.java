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
		list.add("ÌÆÈı²Ø");
		list.add("ËïÎò¿Õ");
		System.out.println(list);
		String name=list.get(2);
		System.out.println(name);
		//set ·½·¨£ºÌæ»»ÔªËØ
		name=list.set(1,"ÖíÎòÄÜ");
		System.out.println(list);
		//½»»»ÔªËØ
		list.set(2,list.set(3, list.get(2)));
		System.out.println(list);
		
	}

}
