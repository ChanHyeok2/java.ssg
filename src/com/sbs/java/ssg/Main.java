package com.sbs.java.ssg; //������

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("==���α׷� ����==");
		
		Scanner sc = new Scanner(System.in);
		String command = sc.nextLine(); //���͸� ������ ���� ������ ���, next�� ���� �� ������ ���
		System.out.println("�Էµ� ��ɾ�� : " + command);
		
		sc.close();
		
		System.out.println("==���α׷� ��==");
	}
}
