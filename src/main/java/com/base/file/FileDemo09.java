package com.base.file;

import java.io.File;
import java.io.FileFilter;

public class FileDemo09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * ��ȡ��ǰĿ¼��������"."��ͷ���ļ���Ŀ¼
		 */
		File dir=new File(".");
		MyFillter ml=new MyFillter();
		File[] subs=dir.listFiles();
		for(File sub:subs){
			if(ml.accept(sub)){
			System.out.println(sub.getName());
			}
		}
		
	}

}
class MyFillter implements FileFilter{

	public boolean accept(File pathname) {
		String name=pathname.getName();
		return name.startsWith(".");
	}
	
}