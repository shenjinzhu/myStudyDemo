package com.base.oos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 * ���±�����
 * ����������
 * 	����Ҫ���û������ļ�����Ȼ����Ը��ļ����в���
 * 	�û��������ڿ���̨�����ÿһ���ַ�����Ҫд�뵽���ļ���
 * 	���û����룺exitʱ���˳�����
 * @author nbtarena
 *
 */
public class NoteDemo7 {
	public static void main(String[] args) throws IOException {
		Scanner scan=new Scanner(System.in);
		System.out.println("�����ļ���");
		String fileName=scan.next();
		System.out.println("����д��������");
		FileOutputStream fos=new FileOutputStream(fileName,true);
		OutputStreamWriter osw=new OutputStreamWriter(fos);
		PrintWriter pw=new PrintWriter(osw,true);
		//��pw����������������ӵڶ�������boolean ������true����д����Զ�ˢ��
		while(true){
			String str=scan.next();
			if("exit".equals(str)){
				break;
			}
			pw.println(str);
		}
		System.out.println("����");
		pw.close();
	}
}
