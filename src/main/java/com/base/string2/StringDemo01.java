package com.base.string2;


/**
 * String ֧��������ʽ����һ��
 * boolean matches(String regex)
 * ���ݸ�����������ʽ�жϵ�ǰ�ַ����Ƿ������ʽҪ��
 * �����򷵻�true
 * @author nbtarena
 *
 */
public class StringDemo01 {
	public static void main(String[] args) {
		/**
		 * ����������ʽ
		 * [a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\.[a-zA-Z]+)+
		 */
		String regex="[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z]+)+";
		System.out.println(regex);
		String mail="assds@163.com";
		boolean tf=mail.matches(regex);
		if(!tf){
			System.out.print("��");
		}
		System.out.println("�������ַ");
	}
}
