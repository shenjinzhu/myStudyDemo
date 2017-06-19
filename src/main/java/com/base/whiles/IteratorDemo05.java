package com.base.whiles;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 迭代器接口演示
 * 
 */
public class IteratorDemo05 {
	public static void main(String[] args) {
		Collection<String> col=new HashSet<String>();
		col.add("东");
		col.add("南");
		col.add("西");
		col.add("北");
		col.add("红中");
		System.out.println(col);
		Iterator<String> it=col.iterator();
		while(it.hasNext()){
			//迭代期间不能使用col.add  col.remove等方法
			String s=it.next();
			System.out.println(s);
			if(s.equals("红中")){
				System.out.println();
				System.out.println("胡了");
				System.out.println();
				//迭代器提供的安全删除方法
				//将正在迭代的元素从原集合中删除！
				//在迭代期间时间删除原集合中的元素
				it.remove();
			}
		}
		System.out.println(col);
	}
}
