package com.base.file;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapDemo01 {
/**
 * Map的三种遍历模式
 * 	1.遍历所有的key
 * 	2.遍历所有的键值对(Entry)
 * 	3.遍历所有的value（相对不常用）
 * @param args
 */
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String, Integer>();
		map.put("语文", 99);
		map.put("英语", 49);
		map.put("数学", 79);
		map.put("体育", 89);
		map.put("政治", 39);
		/**
		 * 获取当前Map中所有的key
		 * Set keySet()
		 * 该方法会将当前Map中所有的key存入
		 * 到一个Set集合后返回
		 * 所以遍历这个Set集合就相当于遍历了所有的key
		 */
		Set<String> setkey=map.keySet();
		for(String key:setkey){
			System.out.println(key);
		}
		/**
		 * 遍历每一组键值对
		 * Set entrySet()
		 * java.util.Map.Entry
		 * Entry是Map的内部类，其每一个实例用于表示Map中的一组键值对
		 * Entry提供了获取其表示的键值对中的key与value
		 * 方法分别是getKey，getValue
		 */
		Set<Entry<String,Integer>> entrySet=map.entrySet();
		for(Entry<String, Integer> e:entrySet){
			String key=e.getKey();
			Integer value=e.getValue();
			System.out.println(key+":"+value);
		}
		
		/*
		 *遍历所有的Value
		 *Collection values()
		 *该方法会将当前Map中所有的value存入到一个集合后返回 
		 */
		Collection<Integer> values=map.values();
		for(Integer value:values){
			System.out.println("value:"+value);
		}
	}
}
