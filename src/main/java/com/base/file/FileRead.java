package com.base.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileRead {

	/**
	 * ��ȡ�ļ�����
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("raf.dat","rw");
		/*
		 * int read();
		 * ��ȡһ���ֽڣ��������ֽ���10������ʽ����
		 * ����intֵΪ-1�����ʾ��ȡ�����ļ�ĩβ��
		 */
		int d=raf.read();
		raf.close();
		System.out.println(d);
	}

}
