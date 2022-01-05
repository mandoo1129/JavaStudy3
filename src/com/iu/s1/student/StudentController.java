package com.iu.s1.student;

import java.util.Scanner;

public class StudentController {

	public void start() {
		System.out.println("Start Method");
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		StudentUtil studentUtil = new StudentUtil();
		
		while(check) {
			System.out.println("1. 학생들의 정보 입력");
			System.out.println("2. 학생들의 정보 출력");
			System.out.println("3. 프로그램 종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				
				Student [] students = studentUtil.makeStudent();
				

				break;
			case 2:
				System.out.println("출력");
				break;
			default:
				//check = !check;
				check=false;
				break;
			}
		}

	}
}
