package com.base.fileRead;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo1 {

	/**
	 * 若想提高读写效率，要提高每次读写的数据量
	 * 来减少读写次数，从而提高读写效率
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		RandomAccessFile src=new RandomAccessFile("z.CHM","r");
		RandomAccessFile copy=new RandomAccessFile("z_copy.CHM","rw");
		/*
		 * 批量读写数据的方法：
		 * int read(byte[]data)
		 * 一次性尝试读取给定的字节数长度的字节量，并存入到该数组中，
		 * 而返回值为实际读取到的字节量，若返回值为实际读取到的字节量，
		 * 若返回值为-1，则表示读取到了文件末尾
		 */
		byte[] buf=new byte[1024*10];//读写量，一次10K
		int len=-1;
		long start=System.currentTimeMillis();
		while((len=src.read(buf))!=-1){
		/*
		 * void write(byte[] data)
		 * 一次性将给定的字节数组全部字节写出	
		 * 
		 * 
		 * void write(byte[] data,int start,int len)
		 * 将给定字节数从下标为start处开始，len个字节一次性写出
		 */
			copy.write(buf,0,len);
		}
		long end=System.currentTimeMillis();
		System.out.println("读写完毕");
		System.out.println(end-start);
		src.close();
		copy.close();
	}

}
