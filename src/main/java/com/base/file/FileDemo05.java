package com.base.file;

import java.io.File;

public class FileDemo05 {

	/**
	 *����Ŀ¼
	 */
	public static void main(String[] args) {
		File dir=new File("demo");
		if(!dir.exists()){
			dir.mkdir();
			System.out.println("�������");
		}else{
			System.out.println("��Ŀ¼�Ѿ�����");
		}
	}

}
