package com.base.string2;

public class StringDemo07 {
	public static void main(String[] args) {
		
	Card c=new Card(0,0);
	Card c1=new Card(0,0);
	//��"�߼�"��c��c1����ȵ�
	boolean b=c.equals(c1);//��д
	System.out.println(b);
	
	//Object�ṩ��equals��==�ȽϽ��һ��
	//�������ڱȽ϶���ҵ���߼���������
	//Java����������дequals��ʵ�ְ���"ҵ���߼�"����Ƚ϶����Ƿ���ȣ�����
	
	}
}
class Card{
	 int rank;//����
	 int suit;//��ɫ
	 //0����3,1����4
	 //��ɫ0�����飬1����÷��
	 public Card(int suit,int rank){
		 this.rank=rank;
		 this.suit=suit;
	 }
	public boolean equals(Card obj) {
		if(obj==null){
			return false;
		}
		if(this==obj){
			return true;
		}
		if(obj instanceof Card){
			Card other=(Card)obj;
			return this.rank==obj.rank&&this.suit==obj.suit;
		}
		return false;
	}
	 
}