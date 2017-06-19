package com.base.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileRead {

	/**
	 * 读取文件数据
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("raf.dat","rw");
		/*
		 * int read();
		 * 读取一个字节，并将该字节以10进制形式返回
		 * 若该int值为-1，则表示读取到看文件末尾；
		 */
		int d=raf.read();
		raf.close();
		System.out.println(d);
	}

}
