package com.base.string;

/**
 * boolean startsWith��String str��
 * boolean endsWith(String str)
 * �жϵ�ǰ�ַ����Ƿ����Ը������ַ�����ʼ���β��
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
