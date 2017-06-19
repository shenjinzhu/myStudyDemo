package com.base.string2;

public class StringDemo05 {
	public static void main(String[] args) {
		String regex="(wqnmlgb|sb|gld|nc|djb|" +
				"cnm|tmd|213|mdzz|cmd)";
		String message="wqnmlgb!你这个大sb!你怎么这么nc!cnm!";
		message=message.replaceAll(regex, "***");
		System.out.println(message);
	}
}
