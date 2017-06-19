package com.base.calendar;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo14 {
	public static void main(String[] args) {
		//创建了一个新集合对象，结合对象中不包含任何新元素
		Collection col=new ArrayList();
		System.out.println(col);//空集合
		col.add("蜜蜂");
		col.add("大飞机");
		col.add("小飞机");
		col.add(123);
		System.out.println(col);
		//add方法封装了向集合中添加元素的算法
		//remove方法封装了从集合中删除元素的算法
		col.remove("蜜蜂");
		System.out.println(col);
		}
}
