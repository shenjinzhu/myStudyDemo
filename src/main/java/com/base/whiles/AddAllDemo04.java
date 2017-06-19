package com.base.whiles;

import java.util.Collection;
import java.util.HashSet;

public class AddAllDemo04 {

	/**
	 * 测试addAll返回值
	 */
	public static void main(String[] args) {
		Collection<String> s1=new HashSet<String>();
		s1.add("好吃");
		s1.add("好玩");
		s1.add("好潇洒");
		System.out.println(s1);
		Collection<String> s2=new HashSet<String>();
		s2.add("好吃");
		s2.add("好玩");
		s2.add("蘑菇");
		System.out.println(s2);
		//测试addAll返回值
		boolean b=s1.addAll(s2);
		System.out.println(s1);
		//如果addAll方法改变了集合的内容，返回true
		//add方法也相同，改变集合内容，返回true
		System.out.println(b);
	}

}
