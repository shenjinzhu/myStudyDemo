package com.base.string;

/**
 * boolean startsWith（String str）
 * boolean endsWith(String str)
 * 判断当前字符串是否是以给定的字符串开始或结尾的
 * @author nbtarena
 *
 */
public class StringDemo8 {
	public static void main(String[] args) {
		String str="thinking in java";
		str.startsWith("thin");
		boolean tf=str.startsWith("thin");
		System.out.println(tf);
	}
}
