package com.base.fileRead;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo5 {

	/**
	 * Java IO
	 * 标准的读写操作
	 * 流根据方向分为输入流与输出流，输入流用来读
	 * 输出流用来写
	 * 流又分为节点流（低级流）和处理流（高级流）
	 * 低级流：读写必须建立在低级流上进行，它的数据源明确，
	 * 			负责实际搬运数据的流
	 * 高级流：不能独立存在（没有意义），必须处理其他流，
	 * 			处理其他流的目的是简化我们的读写操作
	 * 
	 * 文件流：用于读写文件的流，是一种低级流
	 * java.io.FileInputStream:文件输入流
	 * java.io.FileOutputStream:文件输出流
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		/*
		 *文件流有两种对文件的写操作
		 *覆盖写操作（默认操作和追加写操作），文件输出流提供了构造方法：
		 *FileOutputStream(String path)
		 *FileOutputStream(File file)
		 *以上两种方式创建的文件输出流都是覆盖写操作，
		 *即该流会先将该文件数据清空，再开始新的写操作
		 *文件流还支持一个第二个参数为boolean值参数的构造方法，
		 *若该值为true，则是追加写操作，
		 *即：同规格该流写出的数据是在当前文件末尾被追加的 
		 */
		
		FileOutputStream fos=new FileOutputStream("fos.txt",true);
		//加true是文件末尾追加，不加true是覆盖原文件
		String str="我爱北京";
		byte[] but=str.getBytes("utf-8");
		fos.write(but);
		System.out.println("写出完毕");
		fos.close();

	}

}
