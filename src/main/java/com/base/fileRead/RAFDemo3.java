package com.base.fileRead;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 向文中写入 文本 数据
 */
public class RAFDemo3 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("raf.txt", "rw");
		
		String str="我love天安门";
		byte[] data=str.getBytes("utf-8");
		/*
		 * String 提供了将字符串转换为对应字节的相关方法：
		 * byte[] getBytes()
		 * 按照当前系统默认的字符集转换为对应的一组字节
		 * 
		 * byte[] getBytes(String charsetName)
		 * 按照指定的字符集转换字符串
		 */
		raf.write(data);
		System.out.println("写出完毕");
		raf.close();
	}
}
