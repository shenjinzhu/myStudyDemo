package com.base.exception;
import javax.management.RuntimeErrorException;

/**
 * �쳣���׳�
 * 
 */
public class Exceptionooo {

	public static void main(String[] args){
		Person p=new Person();
		try{
			/*
			 *����������У������Ѿ�������ҵ���߼�Ҫ��
			 *�����ǵ���һ������throws�׳��쳣��������ʱ
			 *������Ҫ�����Ǳ��봦��÷��������׳����쳣��������벻ͨ��
			 *�����������в��񣬻����ڵ�ǰ������ʹ��throws�������������쳣�׳� 
			 */
			p.setAge(1000);
		}catch(IllegalAgeException e){
			System.out.println("���䲻����");
		}
		System.out.println("�����ǣ�"+p.getAge());
		
	}

}
class Person{
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) throws IllegalAgeException{
		if(age<0||age>100){
		
			throw new IllegalAgeException("���䲻�Ϸ�");
			
		}
		this.age=age;
	}
	
}