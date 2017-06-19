package com.base.oos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.BufferedReader
 * �����ַ����������ص��ǿ��԰��ж�ȡ�ַ���
 * @author nbtarena
 *
 */
public class BRDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis
			=new FileInputStream("./src/day08/BRDemo.java");
		/*
		 * ��׼д��
		 * "."+File.separator+"src"+File.separator+"day08"+File.separator+"BRDemo.java"
		 */
		InputStreamReader isr=new InputStreamReader(fis);
		BufferedReader by=new BufferedReader(isr);
		/*
		 * BufferedReader�ṩ�ķ�����
		 * String readerLine();
		 * ���ж�ȡ�ַ������÷�����������ȡ���ɸ��ַ�
		 * ֱ����ȡ�ַ�����Ȼ�󽫻��з�֮ǰ�������ַ�
		 * ���һ���ַ������أ�������ֵΪnull��ʾEOF
		 */
		String s=null;
		while((s=by.readLine())!=null){
			System.out.println(s);
		}
		System.out.println("OK");
		by.close();
	}

}
