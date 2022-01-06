package com.iu.s1.student;

import java.util.Scanner;

public class StudentController {
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		StudentUtil studentUtil = new StudentUtil();
		//studentUtil.initUtil();
		StudentView studentView = new StudentView();
		Student [] students = null;
		while(check) {
			System.out.println("1. 학생들의 정보 입력");
			System.out.println("2. 학생들의 정보 출력");
			System.out.println("3. 학생정보 검색 출력");
			System.out.println("4. 프 로 그 램  종료");
			int select = sc.nextInt();
			
			switch (select) {
			case 1 :
				students = studentUtil.makeStudents();
				break;
			case 2 :
				if(students != null) {
					studentView.view(students);
				}else {
					studentView.view("학생정보를 먼저 입력하세요");
				}
				break;
			case 3:
				if(students == null) {
					studentView.view("학생 정보가 없습니다");
					continue;
				}
				Student student = studentUtil.search(students);
				if(student != null) {
					studentView.view(student);
				}else {
					studentView.view("검색 결과가 없습니다");
				}
				break;
			default :
				//check = !check;
				check=false;
				break;
			}
			
		//switch case
		}//while 끝
	}//Main 끝

}// class 끝
