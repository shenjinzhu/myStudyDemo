package com.base.file;

import java.io.File;
import java.io.IOException;

public class FileDemo03 {

	/**
	 * File还可以操作文件或目录
	 * 即： 创建，删除一个文件或目录
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		/*
		 * 当前目录下创建test.txt文件
		 * 不加路径默认在当前目录下
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
