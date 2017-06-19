package com.base.oos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class OOSDemo01 {

	/**
	 * java.io.ObjectOutoputStream
	 * 对象输出流，是一个高级流，使用它可以很方便的，
	 * 将给定的对象转换为一组字节后写出
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Person p=new Person();
		p.setName("苍老师");
		p.setAge(18);
		p.setGender("女");
		
		List<String> other=new ArrayList<String>();
		other.add("是一名演员");
		other.add("爱写毛笔字`");
		other.add("促进中日文化交流");
		p.setOtherInfo(other);
		FileOutputStream fos=new FileOutputStream("person.obj");
		 
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		/*
		 * void writeObject(Object o)
		 * oos的该方法可以将java中任何对象转换为一组字节写出，由于这里
		 * oos处理的是fos，所以转换的字节最终通过fos写入到了文件中
		 * 
		 * 对象在下面的案例中，经过oos时，对象呗转换为了一组字节
		 * 这个过程称为：对象序列化
		 * 
		 * 这组字节经过FOS时：
		 * 被写入到了文件中（硬盘上）
		 * 这个过程称为：持久化
		 */
		oos.writeObject(p);
		System.out.println("写出完毕");
		fos.close();
	}

}
