package com.base.string2;

public class day02_test {
	public static void main(String[] args) {
		String regex="[0-9a-zA-Z]+(\\.[0-9a-zA-Z]+)+(\\.[0-9a-zA-Z]+)+";
		String s="asdas.asd3214.asd";
		boolean yn=s.matches(regex);
		System.out.println(yn);
	}
}
