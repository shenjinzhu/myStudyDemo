package com.base.file;

import java.io.File;

public class FileDemo06 {

	/**
	 * 目录删除
	 * 方法与删文件一致
	 * 注意事项：必须是空目录！！！
	 * 否则不能删除
	 */
	public static void main(String[] args) {
		File dir=new File("demo");
		if(dir.exists()){
			dir.delete();
			System.out.println("删除成功");
		}else{
			System.out.println("没有该文件");
		}
	}

}
 