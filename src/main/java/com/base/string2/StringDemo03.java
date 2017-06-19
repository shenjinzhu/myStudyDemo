package com.base.string2;

public class StringDemo03 {
	public static void main(String[] args) {
		String imgName="1.jpg";
		String name[]=imgName.split("\\.");
		imgName=System.currentTimeMillis()+"."+name[1];
		System.out.println(imgName);
	}
}
