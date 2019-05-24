package com;

public class Ex2 {

	public static void main(String[] args) {

		String s = "abcdefgha";

		System.out.println(s.charAt(0));
		System.out.println(s.indexOf('b'));
		System.out.println(s.indexOf("de"));
		System.out.println(s.indexOf('a', 3));
		System.out.println(s.lastIndexOf('a'));

		System.out.println(s.startsWith("a"));
		System.out.println(s.endsWith("ha"));
		System.out.println(s.contains("def"));

		System.out.println(s.substring(4));
		System.out.println(s.substring(4, 6));

		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

		String s1 = "Abc";
		String s2 = "abc";

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		System.out.println(s1.compareTo(s2));

		String s3 = "   hello    ";
		System.out.println(s3);
		System.out.println(s3.trim());

		String mobileString = "123456890";
		String regex = "\\d{10}";
		System.out.println(mobileString.matches(regex));

		String fridayMenu = "biryani1,biryani2,biryani3";
		String[] fridayMenuItems = fridayMenu.split(",");
		for (String item : fridayMenuItems) {
			System.out.println(item);
		}

		System.out.println(s.length());
		System.out.println(s.isEmpty());

		String out = String.format("then sume is %05d", 124);
		System.out.println(out);

		String s5 = "abc";
		System.out.println(s5.replace('a', 'A'));

		int n = 123;
		System.out.println(n);
		
		
		System.out.println(Character.isDigit('2'));
		

	}

}
