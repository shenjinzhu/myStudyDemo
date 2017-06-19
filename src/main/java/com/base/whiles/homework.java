package com.base.whiles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class homework {
//
//	{System.out.println("构造块");}
//	static{
//		System.out.println("静态代码块");
//	}
	public static void main(String[] args) {
//		new F();
		//第一题
//		Person person=new Person("Tom",24,5000);
//		Person person1=new Person("Jm",20,5000);
//		Person person2=new Person("Lom",30,8000);
//		List<Person> list=new ArrayList<Person>();
//		list.add(person);
//		list.add(person1);
//		list.add(person2);
//		Comparator<Person> rule=new Comparator<Person>() {
//			public int compare(Person o1, Person o2) {
//				return o1.age-o2.age;
//			}
//		};
//		Collections.sort(list,rule);
//		for(Person p:list){
//			System.out.println("["+p.name+","+p.age+","+p.salar+"]");
//		}
		
		//第二题
		
		
		
		
	}
}
class Person{
	String name;
	int age;
	int salar;
	public Person(String name,int age,int salar){
		this.name=name;
		this.age=age;
		this.salar=salar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalar() {
		return salar;
	}
	public void setSalar(int salar) {
		this.salar = salar;
	}
	public String toSring(){
		return "["+name+","+age+","+salar+"]";
	}
}
//class F{
//	{System.out.println("F构造快s");}
//	static{
//		System.out.println("F静态代码块");
//	}
//	public F(){
//		System.out.println("构造方法");
//	}
//}