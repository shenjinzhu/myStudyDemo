package com.base.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo {

	/**
	 * 复制文件
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		RandomAccessFile src=new RandomAccessFile("start.png", "r");
		RandomAccessFile copy=new RandomAccessFile("start_copy.png","rw");
		int d=0;
		while((d=src.read())!=-1){
			copy.write(d);
		}
		System.out.println("读取完毕");
		src.close();
		copy.close();
		

	}

}
