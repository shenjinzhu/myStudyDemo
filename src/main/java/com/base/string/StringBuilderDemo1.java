package com.base.string;

import java.util.Arrays;

/**
 * �����ַ���Ƶ���޸Ķ��ڴ濪���ϴ�
 * java�ṩ��һ�������޸��ַ������ݵ��ࣺ
 * java.lang.StringBuilder
 * ���ڲ�ά��һ���ɱ���ַ����飬���������ַ��������޸Ķ��������������е�
 * ����ÿ���޸Ķ������¶��󡣴Ӷ������ڴ濪��
 * Ϊ��StringBuilder�������������༭�ַ������ݵ���
 * @author nbtarena
 *
 */
public class StringBuilderDemo1 {
	public static void main(String[] args) {
		String str="Ŭ��ѧϰjava��Ϊ���Ҹ��ù���";
		StringBuilder builder=new StringBuilder(str);
		/**
		 * StringBuilder�ṩ�����ڱ༭�ַ�������ط�������������ɾ�Ĳ�
		 * 
		 */
		/**
		 * Ŭ��ѧϰjava��Ϊ���Ҹ��ù���
		 * Ŭ��ѧϰjava,����Ϊ�˸ı�����
		 */
		builder.replace(9,16,"����Ϊ�˸ı�����");
		str=builder.toString();
		System.out.println(str);
		builder.append(",this my dream");
		System.out.println(builder.toString());
	}
}
