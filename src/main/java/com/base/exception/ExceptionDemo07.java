package com.base.exception;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ��д���ຬ��throws�쳣�׳������ķ���ʱ
 * ���throws����д׼��
 */
public class ExceptionDemo07 {
	public void dosome() throws IOException,AWTException{
		
		
	}

}
class Son extends ExceptionDemo07{
	//1.���Բ��׳��쳣
//	public void dosome(){
//		
//	}
//	public void dosome() throws FileNotFoundException{
//		/*
//		 * 2.�����׳��������׳��쳣�������쳣
//		 */
//	}
	public void dosome() throws IOException{
		//3.�����׳�����һ���쳣
	}
	//�����׳������쳣�����Ǹ�����쳣Ҳ�����������쳣
	
//	public void dosome() throws Exception{
//		
//	}//����
}