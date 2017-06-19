package com.base.string;

/**
 * char charAt(int index)
 * 查看当前字符串中指定位置的字符
 * @author nbtarena
 *
 */
public class StringDemo7 {
	public static void main(String[] args) {
		String str="thinking in java";
		char c=str.charAt(9);
		System.out.println(c);
		System.out.println(str.substring(9,10));
		String info="上海自来水来自海上";
		for(int i=0;i<info.length()/2;i++){
			if(info.charAt(i)!=info.charAt(info.length()-1-i)){
				System.out.print("不");
				break;
			}
		}
		System.out.println("是回文");
	}
}
