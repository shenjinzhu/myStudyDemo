package com.base.file;

import java.io.File;

public class FileDemo04 {

	/**
	 * 删除一个文件
	 */
	public static void main(String[] args) {
		/**
		 * 删除当前目录中的test.txt
		 */
		File file=new File("test.txt");
		if(file.exists()){
			file.delete();
			System.out.println("文件已经删除");
		}
		if(!file.exists()){
			System.out.println("文件已经不存在");
		}
	}

}
