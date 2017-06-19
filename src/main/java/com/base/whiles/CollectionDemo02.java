 package com.base.whiles;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * 测试contains 方法和equals方法的关系
 * contains方法正常功能依赖于equals方法
 * @author nbtarena
 *
 */
public class CollectionDemo02 {
	public static void main(String[] args) {
		Collection col=new ArrayList();
		col.add(new Point(3,4));
		col.add(new Point(5,6));
		col.add(new Point(7,8));
		col.add(new Point(7,8));
		System.out.println(col);
		Point p1=new Point(5,6);
		boolean b=col.contains(p1);
		System.out.println(b);
	}
}
class Point{
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "("+x+","+y+") ";
	}
	public boolean equals(Object obj) {
		if(obj==null){
			return false;
		}
		if(this==obj){
			return true;
		}
		if(obj instanceof Point){
			Point other=(Point)obj;
		return this.x==other.x&&this.y==other.y;
		}
		return false;
	}
	
	
}