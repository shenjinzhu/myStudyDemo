package com.base.string;

/**
 * int indexOf(String str) �鿴�����ַ����ڵ�ǰ�ַ����е�λ��
 * 
 * @author nbtarena
 * 
 */
public class StringDemo4 {
	public static void main(String[] args) {
		// java���˼�롪������thinking in java
		String str = "�Ұ�java";
		System.out.println(str.indexOf("j"));
		/**
		 * ���ص�indexOf�������Դ�ָ��λ�� �����ҵ�һ�γ���ָ���ַ�����λ��
		 */
		int index;
		index = str.indexOf("j", 2);
		System.out.println(index);

	}
}
