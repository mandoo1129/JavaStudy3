package com.iu.s1.student;

import java.util.Scanner;

public class StudentUtil {
	Scanner sc;
	
	public StudentUtil() {
		this.sc = new Scanner(System.in);
	}
	
	//학생 객체를 생성하고 정보를 입력 받는 곳
	public void initUtil() {
		this.sc = new Scanner(System.in);
	}
	
	public Student search(Student [] students) {
		//검색할 학생의 번호를 입력
		//입력 받은 번호와 일치하는 학생을 찾아서 리턴
		
		System.out.println("검색할 학생 번호 입력");
		int num = sc.nextInt();
		
		Student student = null;
		
		for(int i=0;i<students.length;i++) {
			if(students[i].num == num) {
				System.out.println("Find");
				student = students[i];
				break;
			}
		}
		
		return student;
		
	}
	
	
	public Student []  makeStudents() {
		
		//학생의 수를 입력 받음
		System.out.println("학생 수 입력");
		int count = this.sc.nextInt();
		Student [] students = new Student[count];
		
		for(int i=0;i<students.length;i++) {
			Student student = new Student();
			//키보드로 부터 이름, 번호, 국어 영어 수학 입력
			System.out.println("이름 입력");
			student.name = sc.next();
			System.out.println("번호 입력");
			student.num = sc.nextInt();
			System.out.println("국어 입력");
			student.kor = sc.nextInt();
			System.out.println("영어 입력");
			student.eng = sc.nextInt();
			System.out.println("수학 입력");
			student.math = sc.nextInt();
			student.makeTotal();
			students[i]=student;
		}
		
		//학생들의 정보를 리턴
		return students;
	}
	
	public Student makeStudent() {
		//키보드로 부터 이름, 번호, 국어 영어 수학 입력 리턴
		
		System.out.println("이름 입력");
		String name = this.sc.next();
		System.out.println("번호 입력");
		int num = sc.nextInt();
		System.out.println("국어 입력");
		int kor = sc.nextInt();
		System.out.println("영어 입력");
		int eng = sc.nextInt();
		System.out.println("수학 입력");
		int math = sc.nextInt();
		//1. 배열 - 같은 데이터타입(X)
		//2. class
		Student student = new Student();
		student.name=name;
		student.num = num;
		student.kor = kor;
		student.eng = eng;
		student.math = math;
		student.makeTotal();
		return student;
	}

}
