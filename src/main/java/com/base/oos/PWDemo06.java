package com.base.oos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;


/**
 * 当调用PrintWrite处理一个流的构造方法时，可以将当前PW创建为具有自动刷新，
 * PrintWrite提供了丰富的构造方法，既可以传入字节流也可以传入字符流
 */
public class PWDemo06 {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		/*
		 * 对文件pw1.txt写操作
		 */
		FileOutputStream fos=new FileOutputStream("pw1.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos,"gbk");
		PrintWriter pw=new PrintWriter(osw);
		
		
		pw.println("老子天下第一");
		pw.println("老子天下第二");
		System.out.println("写出完毕");
		pw.close();

	}

}
