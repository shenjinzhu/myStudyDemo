package com.base.fileRead;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo03 {

	/**
	 * 缓冲流
	 * 是一对高级流，使用缓冲流，可以提高读写效率
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fl=new FileInputStream("z.CHM");
		BufferedInputStream bis=new BufferedInputStream(fl);
		
		FileOutputStream copy_to=new FileOutputStream("copy_newz.CHM");
		BufferedOutputStream bis2=new BufferedOutputStream(copy_to);
		
		int len=-1;
		/*
		 * 使用缓冲输入流的read()方法读取一个字节时，实际上缓冲流内部有一个字节数组，
		 * 它会一次性读取若干字节填满字节数组，然后将第一个字节返回，当再次调用read()
		 * 读取第二个字节时，缓冲流字节将字节数组第二个字节返回，而不是再去读取了，
		 * 直到字节数组中所有字节都已经读取完毕后，才会再次读取一组字节回来 ，
		 * 所以缓冲流还是通过提高每次读写的数据量减少实际读写次数提高读写效率
		 */
		while((len=bis.read())!=-1){
			bis2.write(len);
		}
		System.out.println("完成");
		/*
		 * 流使用完以后要关闭来及时释放资源 
		 */
		fl.close();
		copy_to.close();

	}

}
