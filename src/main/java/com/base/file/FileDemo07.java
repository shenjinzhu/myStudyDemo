package com.base.file;

import java.io.File;

public class FileDemo07 {

	/**
	 * 获取一个目录中，所有的子项
	 */
	public static void main(String[] args) {
		File dir=new File(".");
		File[] subs=dir.listFiles();
		System.out.println(subs.length);
		for(File file:subs){
			/*
			 * 查看当前File对象表示的是文件还是目录的方法：
			 * boolean isFile()
			 * 是否为文件
			 */
			if(file.isFile()){
				System.out.print("文件：");
			}
			if(file.isDirectory()){
				System.out.print("目录：");
			}
			System.out.println(file.getName());
		}
	}

}
