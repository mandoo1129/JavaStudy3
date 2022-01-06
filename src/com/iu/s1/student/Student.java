package com.iu.s1.student;

public class Student {
	
	//Data 저장 용도
	
	String name;
	int num;
	int kor;
	int eng;
	int math;
	
	int total;
	double avg;
	
	public void makeTotal() {
		int total=0;
		System.out.println("참조변수 this");
		System.out.println("참조변수 this : "+this);
		this.total = kor + eng + math;
		this.avg = this.total/3.0;
		//평균계산
		
	}
	
	public void hello() {
		
		System.out.println("안녕하세요");
		
	}

}
