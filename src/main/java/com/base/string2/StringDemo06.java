package com.base.string2;

import java.util.Arrays;
import java.util.Scanner;

public class StringDemo06 {
	public static void main(String[] args) {
		Foo foo=new Foo();
		//toString 是Foo父类型Object上定义的toString方法
		System.out.println(foo);
		//toString方法会被Java自动调用：
		/*toString方法会被Java自动调用：
		 *	1. 凡是需要将对象转换成字符串时就会调用这个方法
		 */
		String str1="创建对象:"+foo;
		System.out.println(str1);
		Foo[] arr={foo,new Foo()};
		System.out.println(Arrays.toString(arr));
		/*
		 * 默认的toString结果没有什么意义！
		 * Java 建议子类重写toString方法。
		 */
		Goo goo=new Goo();
		Foo[] ary={foo,goo,new Foo(),new Goo()};
		System.out.println("新对象："+goo);
		System.out.println(Arrays.toString(ary));
		Point p1=new Point(3,4);
		System.out.println(p1);
		Point p2=new Point(3,4);
		System.out.println("p1是否与p2是一个点？\n"+p1.equals(p2));
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
 * 代表屏幕上的点"坐标"
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