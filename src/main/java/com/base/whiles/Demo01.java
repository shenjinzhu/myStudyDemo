package com.base.whiles;

public class Demo01 {
	int x;
	int y;
	int n;
	Demo01(int x,int y,int n){
		this.x=x;
		this.y=y;
		this.n=n;
	}
	public boolean equals(Object obj){
		if(obj==null){
			return false;
		}
		if(this==obj){
			return true;
		}
		if(obj instanceof Demo01){
			Demo01 de=(Demo01)obj;
			return de.x==x&&de.y==y;
		}
		return false;
	}
	public int hashCode(){
		
		return n;
		
	}
	public String toString(){
		return "["+x+","+y+"]";
		
	}
}
