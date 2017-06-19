package com.base.fileRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {

	/**
	 * 使用文件流对文件进行复制操作
	 * 
	 * RandomAccessFile与流对文件的读写操作是不同的
	 * 1：RAF是基于指针进行读写的，所以可以随意的，读写任何位置，
	 * 		但是流不行，流只能向后读写，不能回头。
	 * 2：RAF即可以读又可以写，但是流要根据方向用输入流读，输出流写。
	 * 3：RAF可以将文件任何位置的数据覆盖，但是流不行，
	 * 		流要么将所有数据覆盖重新写，要么只能在文件末尾追加
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fl=new FileInputStream("z.CHM");
		FileOutputStream copy_to=new FileOutputStream("copy_fz.CHM");
		byte[]buf=new byte[1024*10];
		int len=-1;
		while((len=fl.read(buf))!=-1){
			copy_to.write(buf,0,len);
		}
		System.out.println("完成");
		/*
		 * 流使用完以后要关闭来及时释放资源 
		 */
		fl.close();
		copy_to.close();
	}

}
