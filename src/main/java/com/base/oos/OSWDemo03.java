package com.base.oos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 
 * 字符流：
 * 字符流的读写单位是以字符为单位的，
 * 但是底层本质还是读写字节，只不过字符与字节的
 * 转换过程有这组流完成，所以字符流都是高级流
 * 
 * 转换流：
 * java.io.OutputStreamWriter
 * 字符输出流
 *
 */

public class OSWDemo03 {
	public static void main(String[] args) throws IOException {
		/*
		 *向文件中写入字符串 
		 */
		FileOutputStream fos=new FileOutputStream("osw.txt");
		
		OutputStreamWriter osw=new OutputStreamWriter(fos,"gbk");
		/*
		 *默认的构造方法创建的OSW使用系统默认字符集
		 *OutputStreamWrite(OutputStream out)
		 *
		 * 也可以按照指定的字符集写出字符串
		 * OutputStreamWrite(OutputStream out,String csn )
		 * 
		 * 
		 * OutputStreanWruter与InputStreamReader称为字符转换流，体现在
		 * 	1：可以转换字符集，即：按照指定的字符集读写字符
		 * 	2：有些字符流需要处理其他字符流，而不能直接处理字节流，这时候就需要
		 * 使用者对流先将字节流转换为字符流，在让其他字符流处理流即可
		 * 
		 */
		osw.write("苍老师是世界的");
		osw.write(",也是我们的！");
		System.out.println("ok");
		osw.close();
	}
}
