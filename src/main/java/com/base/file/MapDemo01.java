package com.base.file;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapDemo01 {
/**
 * Map�����ֱ���ģʽ
 * 	1.�������е�key
 * 	2.�������еļ�ֵ��(Entry)
 * 	3.�������е�value����Բ����ã�
 * @param args
 */
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String, Integer>();
		map.put("����", 99);
		map.put("Ӣ��", 49);
		map.put("��ѧ", 79);
		map.put("����", 89);
		map.put("����", 39);
		/**
		 * ��ȡ��ǰMap�����е�key
		 * Set keySet()
		 * �÷����Ὣ��ǰMap�����е�key����
		 * ��һ��Set���Ϻ󷵻�
		 * ���Ա������Set���Ͼ��൱�ڱ��������е�key
		 */
		Set<String> setkey=map.keySet();
		for(String key:setkey){
			System.out.println(key);
		}
		/**
		 * ����ÿһ���ֵ��
		 * Set entrySet()
		 * java.util.Map.Entry
		 * Entry��Map���ڲ��࣬��ÿһ��ʵ�����ڱ�ʾMap�е�һ���ֵ��
		 * Entry�ṩ�˻�ȡ���ʾ�ļ�ֵ���е�key��value
		 * �����ֱ���getKey��getValue
		 */
		Set<Entry<String,Integer>> entrySet=map.entrySet();
		for(Entry<String, Integer> e:entrySet){
			String key=e.getKey();
			Integer value=e.getValue();
			System.out.println(key+":"+value);
		}
		
		/*
		 *�������е�Value
		 *Collection values()
		 *�÷����Ὣ��ǰMap�����е�value���뵽һ�����Ϻ󷵻� 
		 */
		Collection<Integer> values=map.values();
		for(Integer value:values){
			System.out.println("value:"+value);
		}
	}
}
