package com.base.whiles;

import java.awt.Paint;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class Test_day4 {
	
	@Test
	public void no1(){
		Collection<Point> col=new ArrayList<Point>();
		col.add(new Point(1,2));
		col.add(new Point(2,3));
		col.add(new Point(3,4));
		col.add(new Point(3,4));
		System.out.println(col);
		Point p1=new Point(3,4);
		System.out.println(col.contains(p1));
	}
}
