package com.base.fileRead;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BOSDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("src/main/java/com/base/fileRead/de.txt");
		BufferedOutputStream fis=new BufferedOutputStream(fos);
		fis.write("suibl".getBytes());
		fis.flush();
		fos.close();
		System.out.println("ok");
	}

}
