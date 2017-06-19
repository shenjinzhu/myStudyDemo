package com.base.oos;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * java.io.InputStreamReader
 * 字符输入流，可以按照，指定的字符集，读取字符
 * @author nbtarena
 *
 */
public class ISRDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("osw.txt");
		InputStreamReader isr=new InputStreamReader(fis);
		char[] data=new char[100];
		int len=-1;
		while((len=isr.read())!=-1){
			System.out.println(new String(data,0,len));
		}
		
		isr.close();
	}
}
