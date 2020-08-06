package com.sbs.java.ssg; //폴더명

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");
		
		Scanner sc = new Scanner(System.in);
		String command = sc.nextLine(); //엔터를 제외한 라인 끝까지 출력, next는 띄어쓰기 전 까지만 출력
		System.out.println("입력된 명령어는 : " + command);
		
		sc.close();
		
		System.out.println("==프로그램 끝==");
	}
}
