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
	 * �������������һ���߼�����ʹ�������Ժܷ���ģ�
	 * �������Ķ���ת��Ϊһ���ֽں�д��
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Person p=new Person();
		p.setName("����ʦ");
		p.setAge(18);
		p.setGender("Ů");
		
		List<String> other=new ArrayList<String>();
		other.add("��һ����Ա");
		other.add("��дë����`");
		other.add("�ٽ������Ļ�����");
		p.setOtherInfo(other);
		FileOutputStream fos=new FileOutputStream("person.obj");
		 
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		/*
		 * void writeObject(Object o)
		 * oos�ĸ÷������Խ�java���κζ���ת��Ϊһ���ֽ�д������������
		 * oos�������fos������ת�����ֽ�����ͨ��fosд�뵽���ļ���
		 * 
		 * ����������İ����У�����oosʱ��������ת��Ϊ��һ���ֽ�
		 * ������̳�Ϊ���������л�
		 * 
		 * �����ֽھ���FOSʱ��
		 * ��д�뵽���ļ��У�Ӳ���ϣ�
		 * ������̳�Ϊ���־û�
		 */
		oos.writeObject(p);
		System.out.println("д�����");
		fos.close();
	}

}
