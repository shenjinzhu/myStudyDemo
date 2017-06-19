package com.base.string2;

public class StringDemo07 {
	public static void main(String[] args) {
		
	Card c=new Card(0,0);
	Card c1=new Card(0,0);
	//在"逻辑"上c和c1是相等的
	boolean b=c.equals(c1);//重写
	System.out.println(b);
	
	//Object提供的equals与==比较结果一致
	//不能用于比较对象业务逻辑规则的相等
	//Java建议子类重写equals，实现按照"业务逻辑"规则比较对象是否相等！！！
	
	}
}
class Card{
	 int rank;//点数
	 int suit;//花色
	 //0代表3,1代表4
	 //花色0代表方块，1代表梅花
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