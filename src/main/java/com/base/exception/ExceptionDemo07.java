package com.base.exception;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 重写父类含有throws异常抛出声明的方法时
 * 针对throws的重写准则
 */
public class ExceptionDemo07 {
	public void dosome() throws IOException,AWTException{
		
		
	}

}
class Son extends ExceptionDemo07{
	//1.可以不抛出异常
//	public void dosome(){
//		
//	}
//	public void dosome() throws FileNotFoundException{
//		/*
//		 * 2.可以抛出父类型抛出异常的子类异常
//		 */
//	}
	public void dosome() throws IOException{
		//3.可以抛出其中一个异常
	}
	//不能抛出额外异常：不是父类的异常也不是其子类异常
	
//	public void dosome() throws Exception{
//		
//	}//错误
}