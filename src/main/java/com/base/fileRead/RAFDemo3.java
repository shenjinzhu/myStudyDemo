package com.base.fileRead;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ������д�� �ı� ����
 */
public class RAFDemo3 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("raf.txt", "rw");
		
		String str="��love�찲��";
		byte[] data=str.getBytes("utf-8");
		/*
		 * String �ṩ�˽��ַ���ת��Ϊ��Ӧ�ֽڵ���ط�����
		 * byte[] getBytes()
		 * ���յ�ǰϵͳĬ�ϵ��ַ���ת��Ϊ��Ӧ��һ���ֽ�
		 * 
		 * byte[] getBytes(String charsetName)
		 * ����ָ�����ַ���ת���ַ���
		 */
		raf.write(data);
		System.out.println("д�����");
		raf.close();
	}
}
