package com.base.oos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;


/**
 * ������PrintWrite����һ�����Ĺ��췽��ʱ�����Խ���ǰPW����Ϊ�����Զ�ˢ�£�
 * PrintWrite�ṩ�˷ḻ�Ĺ��췽�����ȿ��Դ����ֽ���Ҳ���Դ����ַ���
 */
public class PWDemo06 {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		/*
		 * ���ļ�pw1.txtд����
		 */
		FileOutputStream fos=new FileOutputStream("pw1.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos,"gbk");
		PrintWriter pw=new PrintWriter(osw);
		
		
		pw.println("�������µ�һ");
		pw.println("�������µڶ�");
		System.out.println("д�����");
		pw.close();

	}

}
