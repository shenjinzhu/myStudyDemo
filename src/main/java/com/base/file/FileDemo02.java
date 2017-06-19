package com.base.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * java.id.File
 * 该类的每一个实例表示当前文件系统中的一个文件或目录
 * 文件系统是操作系统的一部分，用于管理硬盘上的数据，
 * 通常会将数据以文件形式表示，并用于进行归纳
 */
public class FileDemo02 {

	public static void main(String[] args) {
		File file=new File("."+File.separator+"demo.txt");//   File.sparator==/,   ./->相对路径
		/*
		 * File可以访问其表示的文件或目录的属性信息
		 */
		System.out.println(file);
		String name=file.getName();
		System.out.println("name:"+name);
		/*
		 * 获取该文件的大小
		 */
		long length=file.length();
		System.out.println("length:"+length+"字节");
		System.out.println("可写:"+file.canWrite());//可写？
		
		System.out.println("是否隐藏："+file.isHidden());//是否隐藏？
		
		long time=file.lastModified();
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		System.out.println("最后修改日期：\n"+fmt.format(time));
	}

}
