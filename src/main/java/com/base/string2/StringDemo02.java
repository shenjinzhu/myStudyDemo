package com.base.string2;

import java.util.Arrays;

/**
 * String 支持正则表达式方法二
 * String[] split (String regex)
 * 将当前字符串按照给定的正则表达式进行拆分
 * @author nbtarena
 *
 */
public class StringDemo02 {
	public static void main(String[] args) {
		/**
		 * 按照数字部分进行拆分
		 * 拆分时，若连续匹配两次要拆分的内容时
		 * 只会会拆分处一个空字符串
		 * 但是若是在当前字符串末尾连续匹配，
		 * 那么拆分的空字符串全部被忽略
		 */
		String str="abc123del234sd223sd234x231322342342342356325";
		String[] data=str.split("[0-9]+");
		System.out.println(Arrays.toString(data));
		System.out.println(data.length);
	}
}
