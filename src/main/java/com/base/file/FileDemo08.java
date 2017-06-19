package com.base.file;

import java.io.File;

public class FileDemo08 {

	/**
	 * ɾ��File��ʾ���ļ���Ŀ¼
	 */
	public static void main(String[] args) {
		File f=new File("a");
		delete(f);
	}
	
	public static void delete(File file){
		if(file.isFile()){
			file.delete();
		}
		if(file.isDirectory()){
			File[] subs=file.listFiles(); 
				for(File fe:subs){
					delete(fe);
				}
			file.delete();
		}
	}
}
