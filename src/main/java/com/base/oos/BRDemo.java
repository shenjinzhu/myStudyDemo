package com.base.oos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.BufferedReader
 * 缓冲字符输入流，特点是可以按行读取字符串
 * @author nbtarena
 *
 */
public class BRDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis
			=new FileInputStream("./src/day08/BRDemo.java");
		/*
		 * 标准写法
		 * "."+File.separator+"src"+File.separator+"day08"+File.separator+"BRDemo.java"
		 */
		InputStreamReader isr=new InputStreamReader(fis);
		BufferedReader by=new BufferedReader(isr);
		/*
		 * BufferedReader提供的方法：
		 * String readerLine();
		 * 按行读取字符串，该方法会连续读取若干个字符
		 * 直到读取字符串，然后将换行符之前的所有字符
		 * 组成一个字符串返回，若返回值为null表示EOF
		 */
		String s=null;
		while((s=by.readLine())!=null){
			System.out.println(s);
		}
		System.out.println("OK");
		by.close();
	}

}
