package com.base.fileRead;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile�ṩ�˷����
 * д�����������ݵ���ط���
 */
public class RAFDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("de.txt", "rw");
		long pos;
		int imax=Integer.MAX_VALUE;
		raf.write(imax>>>24);
		pos=raf.getFilePointer();
		System.out.println("s"+pos);
		raf.write(imax>>>16);
		pos=raf.getFilePointer();
		System.out.println("s"+pos);
		raf.write(imax>>>8);
		pos=raf.getFilePointer();
		System.out.println("s"+pos);
		/*
		 * writeInt() 
		 * ����д��4���ֽڣ���intֵ��Ӧ�Ķ�����ȫ��д��
		 */
		raf.write(imax);
		pos=raf.getFilePointer();
		System.out.println("s"+pos);
		
		raf.writeInt(imax);
		pos=raf.getFilePointer();
		System.out.println("s"+pos);
		
		raf.writeDouble(223.33);
		pos=raf.getFilePointer();
		System.out.println("s"+pos);
		
		raf.writeLong(213L);
		pos=raf.getFilePointer();
		System.out.println("s"+pos);
		
		raf.writeChar('s');
		pos=raf.getFilePointer();
		System.out.println("s"+pos);
		/*
		 * long getFilePointer()
		 * �÷������Ի�ȡ��ǰRAF��ָ��λ�ã�
		 * �մ�����RAFָ��Ĭ�����ļ��ĵ�һ���ֽ�λ���ϣ����±����ʽ��ʾ������0
		 * RAF���ǻ���ָ�뵱ǰλ�ý��ж�д�ֽڣ�
		 * ���۽��е��Ƕ�����д�����ж�д�ֽڣ�
		 * ���к�ָ�붼���Զ�����ƶ�
		 */
		
		/*
		 * void seek(long pos)
		 * �÷������Խ���ǰRAF��ָ���ƶ���ָ��λ�ô�
		 */
		//��ָ���ƶ����ļ���һ���ֽڴ�
		raf.seek(0);//�ƶ�ָ��λ��
		System.out.println(raf.readInt()+"\tpos:"+raf.getFilePointer());
		System.out.println(raf.readInt()+"\tpos:"+raf.getFilePointer());
		System.out.println(raf.readDouble()+"\t\tpos:"+raf.getFilePointer());
		System.out.println(raf.readLong()+"\t\tpos:"+raf.getFilePointer());
		System.out.println(raf.readChar()+"\t\tpos:"+raf.getFilePointer());
		
		raf.close();
	}
}
