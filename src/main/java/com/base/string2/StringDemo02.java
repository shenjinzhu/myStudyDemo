package com.base.string2;

import java.util.Arrays;

/**
 * String ֧��������ʽ������
 * String[] split (String regex)
 * ����ǰ�ַ������ո�����������ʽ���в��
 * @author nbtarena
 *
 */
public class StringDemo02 {
	public static void main(String[] args) {
		/**
		 * �������ֲ��ֽ��в��
		 * ���ʱ��������ƥ������Ҫ��ֵ�����ʱ
		 * ֻ����ִ�һ�����ַ���
		 * ���������ڵ�ǰ�ַ���ĩβ����ƥ�䣬
		 * ��ô��ֵĿ��ַ���ȫ��������
		 */
		String str="abc123del234sd223sd234x231322342342342356325";
		String[] data=str.split("[0-9]+");
		System.out.println(Arrays.toString(data));
		System.out.println(data.length);
	}
}
