package com.base.string;


/**
 * trim();
 * ¶ÁÈ¡×Ö·û£¬È¥µôÁ½±ß¿Õ°×
 * @author nbtarena
 *
 */
public class StringDemo6 {
	public static void main(String[] args) {
		String str=" hello"+"          ";
		System.out.println(str);
		String trim=str.trim();
		System.out.println(trim);
	}
}
