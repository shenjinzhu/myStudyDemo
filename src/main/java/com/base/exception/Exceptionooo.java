package com.base.exception;
import javax.management.RuntimeErrorException;

/**
 * 异常的抛出
 * 
 */
public class Exceptionooo {

	public static void main(String[] args){
		Person p=new Person();
		try{
			/*
			 *程序可以运行，但是已经不满足业务逻辑要求，
			 *当我们调用一个含有throws抛出异常声明方法时
			 *编译器要求我们必须处理该方法声明抛出的异常，否则编译不通过
			 *处理方法：自行捕获，或者在当前方法上使用throws继续声明将该异常抛出 
			 */
			p.setAge(1000);
		}catch(IllegalAgeException e){
			System.out.println("年龄不符合");
		}
		System.out.println("年龄是："+p.getAge());
		
	}

}
class Person{
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) throws IllegalAgeException{
		if(age<0||age>100){
		
			throw new IllegalAgeException("年龄不合法");
			
		}
		this.age=age;
	}
	
}