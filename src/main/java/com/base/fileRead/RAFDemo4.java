package com.base.fileRead;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFDemo4 {

	/**
	 * 读取字符串
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("raf.txt", "rw");
		byte[] buf=new byte[100];
		int len=raf.read(buf);
		System.out.println("实际读取到："+len+"个字节");
		String str=new String(buf,0,len,"utf-8");
		System.out.println(str);
		raf.close();
	}

}
