package com.base.string2;
/**
 * String replaceAll(String regex,String str)
 * ����ǰ�ַ���������������ʽ�Ĳ����滻Ϊ�������ַ���
 * @author nbtarena
 *
 */
public class StringDemo04 {
	public static void main(String[] args) {
		/**
		 * ����ǰ�ַ����е����ֲ����滻
		 * Ϊ"#NUMBER#"
		 * ��Ӣ�Ĳ����滻��
		 * "Wrod"
		 */
		String str="abc123del234sd223sd234x231322342342342356325";
		str=str.replaceAll("[0-9]+", "#NUMBER#");
		str=str.replaceAll("[a-z]+", "word");
		System.out.println(str);
	}
}
