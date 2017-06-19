package com.base.whiles;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GetDemo06 {

	/**
	 * List  get方法测试+
	 */
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<Integer>();//集合中使用整数必须使用包装类
		List<Integer> list2=new LinkedList<Integer>();
		//list1 内部是数组任何位置读取性能一致
		//list2 内部是双向循环列表，头尾读取快，中间读取慢
		for(int i=0;i<100000;i++){
			list1.add(i);
			list2.add(i);
		}
		//元素0-9999，共计10000个元素
		int n;
		long t1,t2;
		t1=System.nanoTime();
		n=list1.get(0);
		t2=System.nanoTime();
		System.out.print(n+":");
		System.out.println(t2-t1);

		
		t1=System.nanoTime();
		n=list1.get(50000);
		t2=System.nanoTime();
		System.out.print(n+":");
		System.out.println(t2-t1);
		
		t1=System.nanoTime();
		n=list1.get(99999);
		t2=System.nanoTime();
		System.out.print(n+":");
		System.out.println(t2-t1);
		
		
		
		System.out.println();
		t1=System.nanoTime();
		n=list2.get(0);
		t2=System.nanoTime();
		System.out.print(n+":");
		System.out.println(t2-t1);

		
		t1=System.nanoTime();
		n=list2.get(50000);
		t2=System.nanoTime();
		System.out.print(n+":");
		System.out.println(t2-t1);
		
		t1=System.nanoTime();
		n=list2.get(99999);
		t2=System.nanoTime();
		System.out.print(n+":");
		System.out.println(t2-t1);
	}

}
