package com.base.fileRead;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo5 {

	/**
	 * Java IO
	 * ��׼�Ķ�д����
	 * �����ݷ����Ϊ���������������������������
	 * ���������д
	 * ���ַ�Ϊ�ڵ������ͼ������ʹ��������߼�����
	 * �ͼ�������д���뽨���ڵͼ����Ͻ��У���������Դ��ȷ��
	 * 			����ʵ�ʰ������ݵ���
	 * �߼��������ܶ������ڣ�û�����壩�����봦����������
	 * 			������������Ŀ���Ǽ����ǵĶ�д����
	 * 
	 * �ļ��������ڶ�д�ļ���������һ�ֵͼ���
	 * java.io.FileInputStream:�ļ�������
	 * java.io.FileOutputStream:�ļ������
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		/*
		 *�ļ��������ֶ��ļ���д����
		 *����д������Ĭ�ϲ�����׷��д���������ļ�������ṩ�˹��췽����
		 *FileOutputStream(String path)
		 *FileOutputStream(File file)
		 *�������ַ�ʽ�������ļ���������Ǹ���д������
		 *���������Ƚ����ļ�������գ��ٿ�ʼ�µ�д����
		 *�ļ�����֧��һ���ڶ�������Ϊbooleanֵ�����Ĺ��췽����
		 *����ֵΪtrue������׷��д������
		 *����ͬ������д�����������ڵ�ǰ�ļ�ĩβ��׷�ӵ� 
		 */
		
		FileOutputStream fos=new FileOutputStream("fos.txt",true);
		//��true���ļ�ĩβ׷�ӣ�����true�Ǹ���ԭ�ļ�
		String str="�Ұ�����";
		byte[] but=str.getBytes("utf-8");
		fos.write(but);
		System.out.println("д�����");
		fos.close();

	}

}
