package com.base.oos;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * java.io.PrintWriter
 * 
 * 缓冲字符输出流，可以按行写出字符串，并且具有自动行刷新。
 * 缓冲效果是依靠BufferedWriter实现的，创建PrintWriter时，
 * 它会自动在羡慕创建一个BufferedWriter来完成其缓冲功能
 */
public class PWDemo05 {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter pw=new PrintWriter("pw.txt","utf-8");
		pw.println("这么厉害啊");
		pw.println("好害羞");
		pw.close();
		System.out.println("OK");
	}

}
