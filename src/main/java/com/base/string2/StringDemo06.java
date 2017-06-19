package com.base.string2;

import java.util.Arrays;
import java.util.Scanner;

public class StringDemo06 {
	public static void main(String[] args) {
		Foo foo=new Foo();
		//toString ��Foo������Object�϶����toString����
		System.out.println(foo);
		//toString�����ᱻJava�Զ����ã�
		/*toString�����ᱻJava�Զ����ã�
		 *	1. ������Ҫ������ת�����ַ���ʱ�ͻ�����������
		 */
		String str1="��������:"+foo;
		System.out.println(str1);
		Foo[] arr={foo,new Foo()};
		System.out.println(Arrays.toString(arr));
		/*
		 * Ĭ�ϵ�toString���û��ʲô���壡
		 * Java ����������дtoString������
		 */
		Goo goo=new Goo();
		Foo[] ary={foo,goo,new Foo(),new Goo()};
		System.out.println("�¶���"+goo);
		System.out.println(Arrays.toString(ary));
		Point p1=new Point(3,4);
		System.out.println(p1);
		Point p2=new Point(3,4);
		System.out.println("p1�Ƿ���p2��һ���㣿\n"+p1.equals(p2));
	}
}

class Foo/*extemds Object*/{
	
}
class Goo extends Foo{
	public String toString(){
		return "Goo";
	}
}
/**
 * ������Ļ�ϵĵ�"����"
 *
 */
class Point{
	int x;
	int y;
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	public String toString(){
		return x+","+y;
		
	}
	public boolean equals(Point obj) {
		if(obj==null){
			return false;
		}
		if(this==obj){
			return true;
		}
		return this.x==obj.x&&this.y==obj.y;
	}
	
}