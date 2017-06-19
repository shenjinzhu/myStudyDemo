package com.base.whiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayDemo10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("Tom");
		list.add("Jerry");
		list.add("唐三藏");
		list.add("孙悟空");
//		//将集合中的元素复制到Object类型，但元素是String类型
//		Object[]ary=list.toArray();
//		System.out.println(Arrays.toString(ary));
		String [] ary=new String[7];    
		ary=list.toArray(ary);
		System.out.println(Arrays.toString(ary));
		//若创建数组ary与list长度相同，则对应位置引用相应数据
		//若创建数组ary短于list长度，则舍弃创建数组，创建新数组ary，长度与list相同
		//若创建数组ary长于list长度，则在末尾添加空字符
		//建议！：长度可以选list.length
	}

}
