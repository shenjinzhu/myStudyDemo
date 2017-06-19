package com.base.string2;
/**
 * String replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为给定的字符串
 * @author nbtarena
 *
 */
public class StringDemo04 {
	public static void main(String[] args) {
		/**
		 * 将当前字符串中的数字部分替换
		 * 为"#NUMBER#"
		 * 将英文部分替换成
		 * "Wrod"
		 */
		String str="abc123del234sd223sd234x231322342342342356325";
		str=str.replaceAll("[0-9]+", "#NUMBER#");
		str=str.replaceAll("[a-z]+", "word");
		System.out.println(str);
	}
}
