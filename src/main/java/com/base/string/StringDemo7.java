package com.base.string;

/**
 * char charAt(int index)
 * �鿴��ǰ�ַ�����ָ��λ�õ��ַ�
 * @author nbtarena
 *
 */
public class StringDemo7 {
	public static void main(String[] args) {
		String str="thinking in java";
		char c=str.charAt(9);
		System.out.println(c);
		System.out.println(str.substring(9,10));
		String info="�Ϻ�����ˮ���Ժ���";
		for(int i=0;i<info.length()/2;i++){
			if(info.charAt(i)!=info.charAt(info.length()-1-i)){
				System.out.print("��");
				break;
			}
		}
		System.out.println("�ǻ���");
	}
}
