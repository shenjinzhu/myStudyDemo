package com.base.string2;

public class DoubleDemo11 {
	public static void main(String[] args) {
		Double d=new Double(3.14);
		Double d1=new Double("3.14");
		//��������һ���ģ������Խ�3.14��װΪDouble����3.14����
		
		//���صĹ�����ʹ�ø��ӷ���
		System.out.println(d.equals(d1));
		String s="13123.345423";
		double d2=Double.parseDouble(s);
		d2*=10;
		System.out.println(d2);
		//�ڹ������������10���Ƹ������ַ�����Ҫת��Ϊdouble��������
		//�Ϳ���ʹ��parseDouble����
		
		//Integer Integer.parseInt()
		//Double	Double.parseDouble()
		//Long	Long.parseLong()
		//Float		Float.parseFloat()
		//Boolean Boolean.parseBoolean()
	}
	
}
