package com.base.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileDemo10 {

	/**
	 * java.id.RandomAccessFile
	 *	�����ǻ���ָ����ʽ��д�ļ����ݵ���
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		/*
		 * RandomAccessFile�����ִ���ģʽ��
		 * r��ֻ��ģʽ�������ļ����ݽ��ж�ȡ����
		 * rw�����Զ��ļ����ݾ�ϸ��д����
		 * 
		 * RandomAccessFile�ĵ�һ���������Դ����ַ������ļ�·����
		 * Ҳ���Դ���file����
		 */
		RandomAccessFile raf=new RandomAccessFile("dt.txt","rw");
		//���ļ���д�����ݣ�ֻд������Ƶġ��Ͱ�λ��
		raf.write(97);
		raf.close();
		System.out.println("д�����");
	}

}
