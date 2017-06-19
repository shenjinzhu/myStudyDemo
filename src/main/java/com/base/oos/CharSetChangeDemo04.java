package com.base.oos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * 转换字符集
 * @author nbtarena
 *
 */
public class CharSetChangeDemo04 {
	public static void main(String[] args) throws IOException {
		/*
		 *osw.txt文件是gbk编码，需要转换为utf-8编码
		 *原理，先用gbk编码读出来，再用utf-8编码写到另一个文件中即可 
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
		System.out.println("转码 OK");
		isr.close();
		osw.close();
		
	}
}
