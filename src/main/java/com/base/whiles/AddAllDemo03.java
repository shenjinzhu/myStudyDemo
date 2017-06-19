package com.base.whiles;

import java.util.ArrayList;
import java.util.Collection;

public class AddAllDemo03 {

	public static void main(String[] args) {
		//泛型：在集合中的作用，用来约束集合中元素的类型
		//保证元素类型一致，避免因不同元素造成的运行错误
		
		//约束集合中只能存储String类型的数据
		//如果违反了将出现编译错误！！！
		Collection<String> col=new ArrayList<String>();
		col.add("铁桶僵尸");
		//col.add(12);编译错误，违反了泛型的约定
		col.add("巨人僵尸");
		col.add("跳高僵尸");
		System.out.println(col);
		//创建第二个集合
		Collection<String> col2=new ArrayList<String>();
		col2.add("铁桶僵尸");
		col2.add("跳高僵尸");
		col2.add("潜水僵尸");
		System.out.println(col2);
		
		//测试 将col2中全部元素合并到col 中
		col.addAll(col2);
		System.out.println(col);
		//检查col中是否包含全部col2中的元素，全部包含返回true，否则返回false
		System.out.println(col.containsAll(col2));
		System.out.println(col2.containsAll(col));
		
	}

}
