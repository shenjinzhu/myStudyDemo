package com.base.fileRead;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFDemo4 {

	/**
	 * ��ȡ�ַ���
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("raf.txt", "rw");
		byte[] buf=new byte[100];
		int len=raf.read(buf);
		System.out.println("ʵ�ʶ�ȡ����"+len+"���ֽ�");
		String str=new String(buf,0,len,"utf-8");
		System.out.println(str);
		raf.close();
	}

}
