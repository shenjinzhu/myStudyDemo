package com.base.fileRead;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo03 {

	/**
	 * ������
	 * ��һ�Ը߼�����ʹ�û�������������߶�дЧ��
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fl=new FileInputStream("z.CHM");
		BufferedInputStream bis=new BufferedInputStream(fl);
		
		FileOutputStream copy_to=new FileOutputStream("copy_newz.CHM");
		BufferedOutputStream bis2=new BufferedOutputStream(copy_to);
		
		int len=-1;
		/*
		 * ʹ�û�����������read()������ȡһ���ֽ�ʱ��ʵ���ϻ������ڲ���һ���ֽ����飬
		 * ����һ���Զ�ȡ�����ֽ������ֽ����飬Ȼ�󽫵�һ���ֽڷ��أ����ٴε���read()
		 * ��ȡ�ڶ����ֽ�ʱ���������ֽڽ��ֽ�����ڶ����ֽڷ��أ���������ȥ��ȡ�ˣ�
		 * ֱ���ֽ������������ֽڶ��Ѿ���ȡ��Ϻ󣬲Ż��ٴζ�ȡһ���ֽڻ��� ��
		 * ���Ի���������ͨ�����ÿ�ζ�д������������ʵ�ʶ�д������߶�дЧ��
		 */
		while((len=bis.read())!=-1){
			bis2.write(len);
		}
		System.out.println("���");
		/*
		 * ��ʹ�����Ժ�Ҫ�ر�����ʱ�ͷ���Դ 
		 */
		fl.close();
		copy_to.close();

	}

}
