package com.base.oos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 
 * �ַ�����
 * �ַ����Ķ�д��λ�����ַ�Ϊ��λ�ģ�
 * ���ǵײ㱾�ʻ��Ƕ�д�ֽڣ�ֻ�����ַ����ֽڵ�
 * ת����������������ɣ������ַ������Ǹ߼���
 * 
 * ת������
 * java.io.OutputStreamWriter
 * �ַ������
 *
 */

public class OSWDemo03 {
	public static void main(String[] args) throws IOException {
		/*
		 *���ļ���д���ַ��� 
		 */
		FileOutputStream fos=new FileOutputStream("osw.txt");
		
		OutputStreamWriter osw=new OutputStreamWriter(fos,"gbk");
		/*
		 *Ĭ�ϵĹ��췽��������OSWʹ��ϵͳĬ���ַ���
		 *OutputStreamWrite(OutputStream out)
		 *
		 * Ҳ���԰���ָ�����ַ���д���ַ���
		 * OutputStreamWrite(OutputStream out,String csn )
		 * 
		 * 
		 * OutputStreanWruter��InputStreamReader��Ϊ�ַ�ת������������
		 * 	1������ת���ַ�������������ָ�����ַ�����д�ַ�
		 * 	2����Щ�ַ�����Ҫ���������ַ�����������ֱ�Ӵ����ֽ�������ʱ�����Ҫ
		 * ʹ���߶����Ƚ��ֽ���ת��Ϊ�ַ��������������ַ�������������
		 * 
		 */
		osw.write("����ʦ�������");
		osw.write(",Ҳ�����ǵģ�");
		System.out.println("ok");
		osw.close();
	}
}
