package com.base.fileRead;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class homework {

	/**
	 * day07_homework
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
//		FileOutputStream fos=new FileOutputStream("myfile.txt");
//		fos.write("我爱北京天安门".getBytes("utf-8"));
//		fos.close();
		//第一题
//		FileInputStream fis=new FileInputStream("myfile.txt");
//		
//		
//		FileOutputStream fos=new FileOutputStream("myfile_copy.txt");
//		byte []by=new byte[100];
//		int d=-1;
////		while((d=fis.read())!=-1){
////			fos.write(d);
////		}
//		while(fis.read(by)!=-1){
//			fos.write(by);
//		}
//		System.out.println("Ok");
//		fis.close();
//		fos.close();
		//第二题
		RandomAccessFile raf=new RandomAccessFile("raf.txt", "rw");
//		int max=Integer.MAX_VALUE;
//		raf.write(max>>>24);
//		raf.write(max>>>16);
//		raf.write(max>>>8);
//		raf.write(max);
//		
//		raf.writeLong(Long.MAX_VALUE);
//		raf.close();

//		System.out.println(raf.readInt()+"+++"+raf.readLong());
		//第三题
//		FileOutputStream fos=new FileOutputStream("myfile.txt");
//		fos.write("我爱北京天安门".getBytes("utf-8"));
//		fos.close();
		//第一题
		FileInputStream fis=new FileInputStream("myfile.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		FileOutputStream fos=new FileOutputStream("myfile2.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		byte []by=new byte[1024*10];
//		while((d=fis.read())!=-1){
//			fos.write(d);
//		}
		while(bis.read(by)!=-1){
			bos.write(by);
		}
		System.out.println("Ok");
		fis.close();
		fos.close();
	}

}
