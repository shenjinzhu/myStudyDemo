package com.base.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * java.id.File
 * �����ÿһ��ʵ����ʾ��ǰ�ļ�ϵͳ�е�һ���ļ���Ŀ¼
 * �ļ�ϵͳ�ǲ���ϵͳ��һ���֣����ڹ���Ӳ���ϵ����ݣ�
 * ͨ���Ὣ�������ļ���ʽ��ʾ�������ڽ��й���
 */
public class FileDemo02 {

	public static void main(String[] args) {
		File file=new File("."+File.separator+"demo.txt");//   File.sparator==/,   ./->���·��
		/*
		 * File���Է������ʾ���ļ���Ŀ¼��������Ϣ
		 */
		System.out.println(file);
		String name=file.getName();
		System.out.println("name:"+name);
		/*
		 * ��ȡ���ļ��Ĵ�С
		 */
		long length=file.length();
		System.out.println("length:"+length+"�ֽ�");
		System.out.println("��д:"+file.canWrite());//��д��
		
		System.out.println("�Ƿ����أ�"+file.isHidden());//�Ƿ����أ�
		
		long time=file.lastModified();
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		System.out.println("����޸����ڣ�\n"+fmt.format(time));
	}

}
