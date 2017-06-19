package com.base.oos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 * 记事本功能
 * 功能描述：
 * 	首先要求用户输入文件名，然后针对该文件进行操作
 * 	用户接下来在控制台输入的每一行字符串都要写入到该文件中
 * 	当用户输入：exit时，退出程序
 * @author nbtarena
 *
 */
public class NoteDemo7 {
	public static void main(String[] args) throws IOException {
		Scanner scan=new Scanner(System.in);
		System.out.println("输入文件名");
		String fileName=scan.next();
		System.out.println("可以写入数据了");
		FileOutputStream fos=new FileOutputStream(fileName,true);
		OutputStreamWriter osw=new OutputStreamWriter(fos);
		PrintWriter pw=new PrintWriter(osw,true);
		//若pw参数是流，可以添加第二个参数boolean ，若是true，则写入后自动刷新
		while(true){
			String str=scan.next();
			if("exit".equals(str)){
				break;
			}
			pw.println(str);
		}
		System.out.println("结束");
		pw.close();
	}
}
