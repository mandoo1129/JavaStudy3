package com.iu.s1.student;

public class StudentMain {

	public static void main(String[] args) {
		// makeStudent 호출
		// 이름, 번호, 국어, 영어, 수학 출력
		StudentUtil studentUtil = new StudentUtil();
		//Student student  = studentUtil.makeStudent();
		Student [] students = studentUtil.makeStudents();
		
		for(int i=0;i<students.length;i++) {
			Student student = students[i];
			System.out.println("이름 : "+student.name);
			System.out.println("번호 : "+student.num);
			System.out.println("국어 : "+student.kor);
			System.out.println("영어 : "+student.eng);
			System.out.println("수학 : "+student.math);
		}
		

	}

}