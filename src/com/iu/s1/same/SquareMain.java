package com.iu.s1.same;

public class SquareMain {

	public static void main(String[] args) {
		Square s1 = new Square();
		s1.garo=4;
		s1.sero=5;
		
		Square s2 = new Square();
		s2.garo=4;
		s2.sero=5;
		
		boolean check = s1 == s2;
		System.out.println(check);
		
		check = s1.same(s2);
		System.out.println(check);
		check = s2.same(s1);
		System.out.println(check);
	}

}

