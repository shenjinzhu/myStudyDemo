package com.base.fileRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISDemo {

	/**
	 * java.io.FileInputStream
	 * 文件字节输入流，用来从文件中读取数据的流
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("fos.txt");
		byte[]buf=new byte[100];
		int len=fis.read(buf);
		String str=new String(buf,0,len,"utf-8");
		System.out.println(str);
		fis.close();
	}

}
