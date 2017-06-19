package com.base.fileRead;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile提供了方便读
 * 写基本类型数据的相关方法
 */
public class RAFDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("de.txt", "rw");
		long pos;
		int imax=Integer.MAX_VALUE;
		raf.write(imax>>>24);
		pos=raf.getFilePointer();
		System.out.println("s"+pos);
		raf.write(imax>>>16);
		pos=raf.getFilePointer();
		System.out.println("s"+pos);
		raf.write(imax>>>8);
		pos=raf.getFilePointer();
		System.out.println("s"+pos);
		/*
		 * writeInt() 
		 * 连续写出4个字节，将int值对应的二进制全部写出
		 */
		raf.write(imax);
		pos=raf.getFilePointer();
		System.out.println("s"+pos);
		
		raf.writeInt(imax);
		pos=raf.getFilePointer();
		System.out.println("s"+pos);
		
		raf.writeDouble(223.33);
		pos=raf.getFilePointer();
		System.out.println("s"+pos);
		
		raf.writeLong(213L);
		pos=raf.getFilePointer();
		System.out.println("s"+pos);
		
		raf.writeChar('s');
		pos=raf.getFilePointer();
		System.out.println("s"+pos);
		/*
		 * long getFilePointer()
		 * 该方法可以获取当前RAF的指针位置，
		 * 刚创建的RAF指针默认在文件的第一个字节位置上，以下标的形式表示，即：0
		 * RAF总是基于指针当前位置进行读写字节，
		 * 无论进行的是读还是写，进行读写字节，
		 * 进行后指针都会自动向后移动
		 */
		
		/*
		 * void seek(long pos)
		 * 该方法可以将当前RAF的指针移动到指定位置处
		 */
		//将指针移动到文件第一个字节处
		raf.seek(0);//移动指针位置
		System.out.println(raf.readInt()+"\tpos:"+raf.getFilePointer());
		System.out.println(raf.readInt()+"\tpos:"+raf.getFilePointer());
		System.out.println(raf.readDouble()+"\t\tpos:"+raf.getFilePointer());
		System.out.println(raf.readLong()+"\t\tpos:"+raf.getFilePointer());
		System.out.println(raf.readChar()+"\t\tpos:"+raf.getFilePointer());
		
		raf.close();
	}
}
