package com.base.file;

import java.io.File;

public class FileDemo06 {

	/**
	 * Ŀ¼ɾ��
	 * ������ɾ�ļ�һ��
	 * ע����������ǿ�Ŀ¼������
	 * ������ɾ��
	 */
	public static void main(String[] args) {
		File dir=new File("demo");
		if(dir.exists()){
			dir.delete();
			System.out.println("ɾ���ɹ�");
		}else{
			System.out.println("û�и��ļ�");
		}
	}

}
 