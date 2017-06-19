package com.base.string;

public class StringDemo11 {
	public static void main(String[] args) {
		String a="a";
		for(int i=0;i<100;i++){
			a+=a;
			System.out.println(a);
		}
		System.out.println(a);
	}
}
