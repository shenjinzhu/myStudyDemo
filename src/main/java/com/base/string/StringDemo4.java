package com.base.string;

/**
 * int indexOf(String str) 查看给定字符串在当前字符串中的位置
 * 
 * @author nbtarena
 * 
 */
public class StringDemo4 {
	public static void main(String[] args) {
		// java编程思想————thinking in java
		String str = "我爱java";
		System.out.println(str.indexOf("j"));
		/**
		 * 重载的indexOf方法可以从指定位置 处查找第一次出现指定字符串的位置
		 */
		int index;
		index = str.indexOf("j", 2);
		System.out.println(index);

	}
}
