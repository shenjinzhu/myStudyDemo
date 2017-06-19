package com.base.string2;

public class IntegerDemo10 {
	public static void main(String[] args) {
		//Java通过parseInt方法，实现了将10进制字符串转换成2进制数据
		//也就是说通过parseInt方法支持了10进制
		String s="120122";
		int n=Integer.parseInt(s);
		System.out.println(n);
		s="-1";
		n=Integer.parseInt(s);
		System.out.println(Integer.toBinaryString(n));
		//在开发中，如果需要将10进制字符串转换成int数据进行计算
		//就可以调用这个方法
		//案例：获取身份证号码中年份的数值
		String id="330121199411013831";
		String y=id.substring(6,14);
		int year=Integer.parseInt(y);
		System.out.println("year:"+year/10000+"\nmonth:"+(year-year/10000*10000)/100);
		
	}
}
