package com.base.file;

import java.io.File;

public class FileDemo07 {

	/**
	 * ��ȡһ��Ŀ¼�У����е�����
	 */
	public static void main(String[] args) {
		File dir=new File(".");
		File[] subs=dir.listFiles();
		System.out.println(subs.length);
		for(File file:subs){
			/*
			 * �鿴��ǰFile�����ʾ�����ļ�����Ŀ¼�ķ�����
			 * boolean isFile()
			 * �Ƿ�Ϊ�ļ�
			 */
			if(file.isFile()){
				System.out.print("�ļ���");
			}
			if(file.isDirectory()){
				System.out.print("Ŀ¼��");
			}
			System.out.println(file.getName());
		}
	}

}
