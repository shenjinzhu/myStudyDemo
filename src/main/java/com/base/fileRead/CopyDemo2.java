package com.base.fileRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {

	/**
	 * ʹ���ļ������ļ����и��Ʋ���
	 * 
	 * RandomAccessFile�������ļ��Ķ�д�����ǲ�ͬ��
	 * 1��RAF�ǻ���ָ����ж�д�ģ����Կ�������ģ���д�κ�λ�ã�
	 * 		���������У���ֻ������д�����ܻ�ͷ��
	 * 2��RAF�����Զ��ֿ���д��������Ҫ���ݷ��������������������д��
	 * 3��RAF���Խ��ļ��κ�λ�õ����ݸ��ǣ����������У�
	 * 		��Ҫô���������ݸ�������д��Ҫôֻ�����ļ�ĩβ׷��
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fl=new FileInputStream("z.CHM");
		FileOutputStream copy_to=new FileOutputStream("copy_fz.CHM");
		byte[]buf=new byte[1024*10];
		int len=-1;
		while((len=fl.read(buf))!=-1){
			copy_to.write(buf,0,len);
		}
		System.out.println("���");
		/*
		 * ��ʹ�����Ժ�Ҫ�ر�����ʱ�ͷ���Դ 
		 */
		fl.close();
		copy_to.close();
	}

}
