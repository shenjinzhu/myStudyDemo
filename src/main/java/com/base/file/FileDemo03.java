package com.base.file;

import java.io.File;
import java.io.IOException;

public class FileDemo03 {

	/**
	 * File�����Բ����ļ���Ŀ¼
	 * ���� ������ɾ��һ���ļ���Ŀ¼
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		/*
		 * ��ǰĿ¼�´���test.txt�ļ�
		 * ����·��Ĭ���ڵ�ǰĿ¼��
		 */
		File file=new File("test.txt");
		if(!file.exists()){
			file.createNewFile();
			System.out.println("Ok");
		}
		File[] f=file.listFiles();
		for(File fi:f){
			System.out.println(fi.getName());
		}

	}

}
