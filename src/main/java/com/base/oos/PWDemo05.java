package com.base.oos;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * java.io.PrintWriter
 * 
 * �����ַ�����������԰���д���ַ��������Ҿ����Զ���ˢ�¡�
 * ����Ч��������BufferedWriterʵ�ֵģ�����PrintWriterʱ��
 * �����Զ�����Ľ����һ��BufferedWriter������仺�幦��
 */
public class PWDemo05 {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter pw=new PrintWriter("pw.txt","utf-8");
		pw.println("��ô������");
		pw.println("�ú���");
		pw.close();
		System.out.println("OK");
	}

}
