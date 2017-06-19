package com.base.file;

import java.io.File;

public class FileDemo05 {

	/**
	 *创建目录
	 */
	public static void main(String[] args) {
		File dir=new File("demo");
		if(!dir.exists()){
			dir.mkdir();
			System.out.println("创建完毕");
		}else{
			System.out.println("该目录已经存在");
		}
	}

}
