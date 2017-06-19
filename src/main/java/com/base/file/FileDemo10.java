package com.base.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileDemo10 {

	/**
	 * java.id.RandomAccessFile
	 *	该类是基于指针形式读写文件数据的类
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		/*
		 * RandomAccessFile的两种创建模式：
		 * r：只读模式，仅对文件数据进行读取操作
		 * rw：可以对文件数据精细读写操作
		 * 
		 * RandomAccessFile的第一个参数可以传入字符串（文件路径）
		 * 也可以传入file对象
		 */
		RandomAccessFile raf=new RandomAccessFile("dt.txt","rw");
		//向文件中写入数据，只写入二进制的”低八位“
		raf.write(97);
		raf.close();
		System.out.println("写出完毕");
	}

}
