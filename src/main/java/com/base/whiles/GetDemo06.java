package com.base.whiles;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GetDemo06 {

	/**
	 * List  get��������+
	 */
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<Integer>();//������ʹ����������ʹ�ð�װ��
		List<Integer> list2=new LinkedList<Integer>();
		//list1 �ڲ��������κ�λ�ö�ȡ����һ��
		//list2 �ڲ���˫��ѭ���б�ͷβ��ȡ�죬�м��ȡ��
		for(int i=0;i<100000;i++){
			list1.add(i);
			list2.add(i);
		}
		//Ԫ��0-9999������10000��Ԫ��
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
