package com.base.fileRead;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class Tests {
	//@Test    输出流写入数据
	public void write01() throws IOException{
		FileOutputStream fop=new FileOutputStream("test.txt");
		String str="浙江";
		byte[] b=str.getBytes();
		fop.write(b);
		System.out.println("完成");
		fop.close();
	}
	
	//@Test  输入流读取数据
	public void read01() throws IOException{
		FileInputStream fis=new FileInputStream("test.txt");
		byte[] by=new byte[1024*10];
		int len=fis.read(by);
		String s=new String(by,0,len,"gbk");
		System.out.println(s);
	}
	
	//@Test  //读取一体
	public void rw() throws IOException{
		FileInputStream fis=new FileInputStream("start.png");
		
		FileOutputStream fos=new FileOutputStream("start_copy.png");
		
		byte[] by=new byte[1024*10];
		
		while((fis.read(by))!=-1){
			fos.write(by);
		}
		System.out.println("OK");
		fis.close();
		fos.close();
	}
	
	
	//@Test//缓冲流
	public void rw_h() throws IOException{
		FileInputStream fis=new FileInputStream("z.CHM");
		BufferedInputStream bis=new BufferedInputStream(fis);
		FileOutputStream fos=new FileOutputStream("s.CHM");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		byte[] by=new byte[1024*10];
		
		while((bis.read(by))!=-1){
			bos.write(by);
		}
		System.out.println("OK");
		fis.close();
		fos.close();
	}
	
	@Test
	public void FileAc() throws IOException{
		File f=new File("test.txt");
		String name=f.getName();
		System.out.println("文件名:"+name);
		String path=f.getPath();
		System.out.println("路径:"+path);
		System.out.println("大小:"+f.length());
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-M-d HH:mm:ss");
		System.out.println("最后修改日期:"+fmt.format(f.lastModified()));
		System.out.println("是否隐藏："+f.isHidden());
		System.out.println("是否可读："+f.canWrite());
	}
	
}
