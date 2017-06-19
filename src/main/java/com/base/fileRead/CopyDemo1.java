package com.base.fileRead;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo1 {

	/**
	 * ������߶�дЧ�ʣ�Ҫ���ÿ�ζ�д��������
	 * �����ٶ�д�������Ӷ���߶�дЧ��
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		RandomAccessFile src=new RandomAccessFile("z.CHM","r");
		RandomAccessFile copy=new RandomAccessFile("z_copy.CHM","rw");
		/*
		 * ������д���ݵķ�����
		 * int read(byte[]data)
		 * һ���Գ��Զ�ȡ�������ֽ������ȵ��ֽ����������뵽�������У�
		 * ������ֵΪʵ�ʶ�ȡ�����ֽ�����������ֵΪʵ�ʶ�ȡ�����ֽ�����
		 * ������ֵΪ-1�����ʾ��ȡ�����ļ�ĩβ
		 */
		byte[] buf=new byte[1024*10];//��д����һ��10K
		int len=-1;
		long start=System.currentTimeMillis();
		while((len=src.read(buf))!=-1){
		/*
		 * void write(byte[] data)
		 * һ���Խ��������ֽ�����ȫ���ֽ�д��	
		 * 
		 * 
		 * void write(byte[] data,int start,int len)
		 * �������ֽ������±�Ϊstart����ʼ��len���ֽ�һ����д��
		 */
			copy.write(buf,0,len);
		}
		long end=System.currentTimeMillis();
		System.out.println("��д���");
		System.out.println(end-start);
		src.close();
		copy.close();
	}

}
