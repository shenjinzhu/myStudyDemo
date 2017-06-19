package com.base.whiles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Map.Entry;

import org.junit.Test;

/**
 * 测试案例
 */
public class TestCase {
	//@Test//此方法必须是共有的无参数无返回值的方法
	public void helloTest(){
		System.out.println("Hello World");	
	}
	
	
	//@Test
	public void testAsList(){
		//将一个数组作为静态的List
		//此list的长度不能改变，不能add，不能remove，可以set
		//list 与数组共享存储空间
		String[]names={"Tom","Jerry","mary"};
		List<String> list=Arrays.asList(names);
		/**list 与数组共享存储空间*/
		names[1]="Lee";
		System.out.println(list);
		//此list不是ArrayList！！是一个静态List
		List<String> l=new ArrayList<String>();
		l.addAll(list);
		l.add("jack");
		l.add("com");
		l.remove(4); 
		l.add(4, "aiaiaia");
		System.out.println(l);
	}
	
	
	//@Test
	public void sortTest(){
		/**
		 * 测试List元素的自然排序
		 * 排序方法Collection.sort（List）
		 */
		List<Integer> list=new ArrayList<Integer>();
		list.add(93);//list.add(Integer.valueOf(93))------自动包装
		list.add(19);
		list.add(23);
		list.add(7);
		list.add(9);
		list.add(72);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		List<String> names=new ArrayList<String>();
		names.add("Tom");
		names.add("Jom");
		names.add("Kom");
		names.add("Lom");
		names.add("Yom");
		Collections.sort(names);
		System.out.println(names);	
	}
	
	
	//@Test
	public void CompareTest(){
		/**
		 * Java的自然排序是依据compareTo
		 * 方法进行比较和排序的.
		 */
		String s1="Jerry";
		String s2="Tom";
		//compareTo用于比较两个对象的大小，String 包含这个方法
		//Integer也包含这个方法
		int n=s1.compareTo(s2);//结果只关心正负，不关心数值
		System.out.println(n);
		//返回正数表示s1>s2,返回负数表示s1<s2，返回0表示s1等于s2
		//返回0结果与使用equals比较结果一致
		
		/**
		 * 自然排序结果取决于CompareTo
		 */
	}
	
	//@Test
	public void sortTest2(){
		/**
		 * 自定义排序
		 * 	-排序方法Collections.sort(list,Comperator)
		 * 	Comparator:自定义比较规则
		 * sort方法根据Comparator 的比较规则进行排序
		 */
		//案例1：整数由大到小进行排序
		Integer i1=5;
		Integer i2=60;
		Integer i3=50;
		Integer i4=24;
		//测试  默认比较规则
		System.out.println(i1.compareTo(i4));
		Comparator<Integer> rule=new Comparator<Integer>(){
			public int compare(Integer o1, Integer o2) {//自定义比较规则
				//模仿默认规则
				
				return -(o1-o2);
			}
			
		};
		List<Integer> list=new ArrayList<Integer>();
		list.add(22);
		list.add(244);
		list.add(212);
		Collections.sort(list,rule);
		System.out.println(list);
	}
	
	
	//@Test
	public void sortTest3(){
		List<String> list=new ArrayList<String>();
		list.add("Tom");
		list.add("Ton");
		list.add("Toh");
		list.add("Tok");
		//1.编写自定义排序规则
		Comparator<String> rule=new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		};
		//2.调用排序方法
		Collections.sort(list,rule);
		System.out.println(list);
	}
	
	@Test
	public void queueTest(){
		/**
		 * 队列方法使用
		 * 
		 */
		Queue<String> queue=new LinkedList<String>();
		queue.offer("Tom");
		queue.offer("Bob");
		queue.offer("Jerry");
		queue.offer("Kucky");
		//进入顺序：Tom   Bob   Jerry  Lucky
		System.out.println(queue);
		//测试出队方法
		String name=queue.peek();
		//peek()检查列队头部元素，不取出（相当于get方法）
		System.out.println(name);
		System.out.println(queue);
		String name1=queue.poll();
		//poll()检查并取出列队头部元素，相当于remove() 
		System.out.println(name1);
		System.out.println(queue);
	}
	
	//@Test
	public void stackTest(){
		/**
		 * 测试将Deque作为Stack使用
		 */
		Deque<String> stack=new LinkedList<String>();
		//作为“栈”使用，只在一段操作列队
		//向栈中“压入”数据，push()
		stack.push("西天取经");
		stack.push("孙悟空");
		stack.push("Lucky");
		stack.push("jack");
		//从栈中弹出数据   pop()
		System.out.println(stack);
		String name=stack.pop();
		System.out.println(name);
		System.out.println(stack);
	}
	
	//@Test//散列表
	public void mapTest(){//根据key找value
		/**
		 * 比较顺序查找和散列查找的性能差别
		 */
		List<String> list=new ArrayList<String>();//创建线性表对象
		Map<String,Integer> map=new HashMap<String,Integer>();//创建散列表对象
			//向集合中添加数据	
		for(int i=0;i<620000;i++){
			String s="s"+i;
			list.add(s);
			map.put(s, i);
			//将key,value成对加入到map
		}
		long now;
		long next;
		
		String key="s"+599999;
		//线性表查找
		now=System.nanoTime();
		int i=list.indexOf(key);
		next=System.nanoTime();
		System.out.println(i);
		System.out.println(next-now);
		System.out.println("___________");
		
		//散列表查找
		now=System.nanoTime();
		int n=map.get(key);
		next=System.nanoTime();
		System.out.println(n);
		System.out.println(next-now);
		System.out.println("___________");
	}
	
	//@Test
	public void putTest(){
		/**
		 * Map.put 方法的功能
		 */
		//     key     value
		Map<Character,String> map=new HashMap<Character,String>();
		//加入新数据
		map.put('L', "李刚");
		map.put('F', "范传奇");
		map.put('S', "孙某某");
		map.put('M', "马某某");
		System.out.println(map);
		map.put('F', "伐木类");//若新加入的key等于原有的key，则替换原有的value
		System.out.println(map);
		String name=map.get('M');
		//如果找不到key对应的value，则返回null
		System.out.println(name);
		name=map.get('G');
		System.out.println(name);
		
		//测试containsKey方法
		boolean b=map.containsKey('M');
		System.out.println(b);//true
		b=map.containsKey('A');//false
		System.out.println(b);
	}
	
	//@Test
	public void testHashCode(){
		/**
		 * 测试字符串的hashCode（散列值）
		 * String 重写了HashCode
		 * 字符串一样hashCode相同
		 * 字符串不一样hashCode大多相同
		 */
		System.out.println("Ton".hashCode());
		System.out.println("Masang".hashCode());
		System.out.println("范传奇".hashCode()); 
		
	}
	
	//@Test         
	public void testHashMap(){
		//测试hashCode equals和HashMap的关系

		Demo01 f1=new Demo01(2,3,4);
		Demo01 f2=new Demo01(3,3,9);
		Demo01 f3=new Demo01(3,3,4);
		Demo01 f4=new Demo01(4,4,4);
		Demo01 f5=new Demo01(5,4,4);
		Demo01 f6=new Demo01(6,5,4);
		System.out.println(f1.hashCode());
		System.out.println(f2.hashCode());
		System.out.println(f3.hashCode());
		System.out.println(f1.equals(f2));
		System.out.println(f2.equals(f3));
		//如上不合理：两个对象相等的时候hashCode不同
		Map<Demo01,String> map=new HashMap<Demo01,String>();
		map.put(f1, "f1");
		map.put(f2, "f2");
		map.put(f3, "f3");
		f1.n=10;//hashCode值不稳定导致查找失败
		//直接导致的问题是重复添加
		System.out.println(map.get(f1));
	}
	
	
	
	
	
	
	
}
