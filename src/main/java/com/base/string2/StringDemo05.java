package com.base.string2;

public class StringDemo05 {
	public static void main(String[] args) {
		String regex="(wqnmlgb|sb|gld|nc|djb|" +
				"cnm|tmd|213|mdzz|cmd)";
		String message="wqnmlgb!�������sb!����ô��ônc!cnm!";
		message=message.replaceAll(regex, "***");
		System.out.println(message);
	}
}
