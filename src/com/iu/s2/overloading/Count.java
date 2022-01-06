package com.iu.s2.overloading;

public class Count {
	public void hap() {
	
	}
	
	public int hap(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public void hap(int num1, int num2, int num3) {
		
	}
	
	public void hap(int num1, double num2) {
		double sum = num1 + num2;
		System.out.println(sum);
	}
	
	public void hap(float num1, double num2) {
		double sum = num1 + num2;
		System.out.println(sum);
	}
	
	
}
