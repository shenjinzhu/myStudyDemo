package com.base.oos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * ת���ַ���
 * @author nbtarena
 *
 */
public class CharSetChangeDemo04 {
	public static void main(String[] args) throws IOException {
		/*
		 *osw.txt�ļ���gbk���룬��Ҫת��Ϊutf-8����
		 *ԭ������gbk���������������utf-8����д����һ���ļ��м��� 
		 */
		FileInputStream fis=new FileInputStream("osw.txt");
		InputStreamReader isr=new InputStreamReader(fis,"gbk");
		
		FileOutputStream fos=new FileOutputStream("new_osw.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
		
		char[] by=new char[1024];
		int len=-1;
		while((len=isr.read(by))!=-1){
			osw.write(by,0,len);
		}
		System.out.println("ת�� OK");
		isr.close();
		osw.close();
		
	}
}
