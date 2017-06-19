package com.base.string2;

public class DoubleDemo11 {
	public static void main(String[] args) {
		Double d=new Double(3.14);
		Double d1=new Double("3.14");
		//如果结果是一样的，都可以将3.14包装为Double类型3.14对象
		
		//重载的构造器使用更加方便
		System.out.println(d.equals(d1));
		String s="13123.345423";
		double d2=Double.parseDouble(s);
		d2*=10;
		System.out.println(d2);
		//在工作中如果遇到10进制浮点数字符串需要转换为double类型数据
		//就可以使用parseDouble方法
		
		//Integer Integer.parseInt()
		//Double	Double.parseDouble()
		//Long	Long.parseLong()
		//Float		Float.parseFloat()
		//Boolean Boolean.parseBoolean()
	}
	
}
