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
 * ���԰���
 */
public class TestCase {
	//@Test//�˷��������ǹ��е��޲����޷���ֵ�ķ���
	public void helloTest(){
		System.out.println("Hello World");	
	}
	
	
	//@Test
	public void testAsList(){
		//��һ��������Ϊ��̬��List
		//��list�ĳ��Ȳ��ܸı䣬����add������remove������set
		//list �����鹲��洢�ռ�
		String[]names={"Tom","Jerry","mary"};
		List<String> list=Arrays.asList(names);
		/**list �����鹲��洢�ռ�*/
		names[1]="Lee";
		System.out.println(list);
		//��list����ArrayList������һ����̬List
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
		 * ����ListԪ�ص���Ȼ����
		 * ���򷽷�Collection.sort��List��
		 */
		List<Integer> list=new ArrayList<Integer>();
		list.add(93);//list.add(Integer.valueOf(93))------�Զ���װ
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
		 * Java����Ȼ����������compareTo
		 * �������бȽϺ������.
		 */
		String s1="Jerry";
		String s2="Tom";
		//compareTo���ڱȽ���������Ĵ�С��String �����������
		//IntegerҲ�����������
		int n=s1.compareTo(s2);//���ֻ������������������ֵ
		System.out.println(n);
		//����������ʾs1>s2,���ظ�����ʾs1<s2������0��ʾs1����s2
		//����0�����ʹ��equals�ȽϽ��һ��
		
		/**
		 * ��Ȼ������ȡ����CompareTo
		 */
	}
	
	//@Test
	public void sortTest2(){
		/**
		 * �Զ�������
		 * 	-���򷽷�Collections.sort(list,Comperator)
		 * 	Comparator:�Զ���ȽϹ���
		 * sort��������Comparator �ıȽϹ����������
		 */
		//����1�������ɴ�С��������
		Integer i1=5;
		Integer i2=60;
		Integer i3=50;
		Integer i4=24;
		//����  Ĭ�ϱȽϹ���
		System.out.println(i1.compareTo(i4));
		Comparator<Integer> rule=new Comparator<Integer>(){
			public int compare(Integer o1, Integer o2) {//�Զ���ȽϹ���
				//ģ��Ĭ�Ϲ���
				
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
		//1.��д�Զ����������
		Comparator<String> rule=new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		};
		//2.�������򷽷�
		Collections.sort(list,rule);
		System.out.println(list);
	}
	
	@Test
	public void queueTest(){
		/**
		 * ���з���ʹ��
		 * 
		 */
		Queue<String> queue=new LinkedList<String>();
		queue.offer("Tom");
		queue.offer("Bob");
		queue.offer("Jerry");
		queue.offer("Kucky");
		//����˳��Tom   Bob   Jerry  Lucky
		System.out.println(queue);
		//���Գ��ӷ���
		String name=queue.peek();
		//peek()����ж�ͷ��Ԫ�أ���ȡ�����൱��get������
		System.out.println(name);
		System.out.println(queue);
		String name1=queue.poll();
		//poll()��鲢ȡ���ж�ͷ��Ԫ�أ��൱��remove() 
		System.out.println(name1);
		System.out.println(queue);
	}
	
	//@Test
	public void stackTest(){
		/**
		 * ���Խ�Deque��ΪStackʹ��
		 */
		Deque<String> stack=new LinkedList<String>();
		//��Ϊ��ջ��ʹ�ã�ֻ��һ�β����ж�
		//��ջ�С�ѹ�롱���ݣ�push()
		stack.push("����ȡ��");
		stack.push("�����");
		stack.push("Lucky");
		stack.push("jack");
		//��ջ�е�������   pop()
		System.out.println(stack);
		String name=stack.pop();
		System.out.println(name);
		System.out.println(stack);
	}
	
	//@Test//ɢ�б�
	public void mapTest(){//����key��value
		/**
		 * �Ƚ�˳����Һ�ɢ�в��ҵ����ܲ��
		 */
		List<String> list=new ArrayList<String>();//�������Ա����
		Map<String,Integer> map=new HashMap<String,Integer>();//����ɢ�б����
			//�򼯺����������	
		for(int i=0;i<620000;i++){
			String s="s"+i;
			list.add(s);
			map.put(s, i);
			//��key,value�ɶԼ��뵽map
		}
		long now;
		long next;
		
		String key="s"+599999;
		//���Ա����
		now=System.nanoTime();
		int i=list.indexOf(key);
		next=System.nanoTime();
		System.out.println(i);
		System.out.println(next-now);
		System.out.println("___________");
		
		//ɢ�б����
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
		 * Map.put �����Ĺ���
		 */
		//     key     value
		Map<Character,String> map=new HashMap<Character,String>();
		//����������
		map.put('L', "���");
		map.put('F', "������");
		map.put('S', "��ĳĳ");
		map.put('M', "��ĳĳ");
		System.out.println(map);
		map.put('F', "��ľ��");//���¼����key����ԭ�е�key�����滻ԭ�е�value
		System.out.println(map);
		String name=map.get('M');
		//����Ҳ���key��Ӧ��value���򷵻�null
		System.out.println(name);
		name=map.get('G');
		System.out.println(name);
		
		//����containsKey����
		boolean b=map.containsKey('M');
		System.out.println(b);//true
		b=map.containsKey('A');//false
		System.out.println(b);
	}
	
	//@Test
	public void testHashCode(){
		/**
		 * �����ַ�����hashCode��ɢ��ֵ��
		 * String ��д��HashCode
		 * �ַ���һ��hashCode��ͬ
		 * �ַ�����һ��hashCode�����ͬ
		 */
		System.out.println("Ton".hashCode());
		System.out.println("Masang".hashCode());
		System.out.println("������".hashCode()); 
		
	}
	
	//@Test         
	public void testHashMap(){
		//����hashCode equals��HashMap�Ĺ�ϵ

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
		//���ϲ���������������ȵ�ʱ��hashCode��ͬ
		Map<Demo01,String> map=new HashMap<Demo01,String>();
		map.put(f1, "f1");
		map.put(f2, "f2");
		map.put(f3, "f3");
		f1.n=10;//hashCodeֵ���ȶ����²���ʧ��
		//ֱ�ӵ��µ��������ظ����
		System.out.println(map.get(f1));
	}
	
	
	
	
	
	
	
}
