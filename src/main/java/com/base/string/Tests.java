package com.base.string;

import java.util.Arrays;

import org.junit.Test;

public class Tests {
	@Test
	public void demo01(){
		//StringBuilder
		String str="在心间种下一颗种子";
		StringBuilder build=new StringBuilder(str);
		build.append(",期待它的发芽");
		//build.delete(0, 3);
		//char[] arr=new char[18] ;
		//build.getChars(3, 15, arr, 0);
		build.insert(0,"我");
		System.out.println(build.toString());
		System.out.println(build.length());
		//System.out.println(Arrays.toString(arr));
		
		
		//indexOf
//		String str="i like to play game,so i begin to study write soft";
//		System.out.println(str.indexOf('t'));
//		System.out.println(str.indexOf('t', 10));
		
		//substring
//		String str="www.baidu.com";
//		int start=str.indexOf(".")+1;
//		int end=str.indexOf(".", start);
//		System.out.println(str.subSequence(start, end));
	}
}
