package com.base.file;

import java.io.File;

public class FileDemo04 {

	/**
	 * ɾ��һ���ļ�
	 */
	public static void main(String[] args) {
		/**
		 * ɾ����ǰĿ¼�е�test.txt
		 */
		File file=new File("test.txt");
		if(file.exists()){
			file.delete();
			System.out.println("�ļ��Ѿ�ɾ��");
		}
		if(!file.exists()){
			System.out.println("�ļ��Ѿ�������");
		}
	}

}
