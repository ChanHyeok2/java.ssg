package com.sbs.java.ssg; //������

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("==���α׷� ����==");

		Scanner sc = new Scanner(System.in);
		
		int lastArticleID = 0;

		while (true) {
			System.out.println("��ɾ�) ");
			String command = sc.nextLine(); // ���͸� ������ ���� ������ ���, next�� ���� �� ������ ���
			
			command = command.trim(); //�翷�� ���⸦ ����
			if (command.length()==0) {
				continue;
			}
			
			if (command.equals("system exit")) {
				break;
			}
			if (command.equals("article write")) {
				int id = lastArticleID +1;
				lastArticleID = id;
				
				System.out.println("���� : ");
				String title = sc.nextLine();
				
				System.out.println("���� : ");
				String body = sc.nextLine();
				
				System.out.printf("%d�� ���� �����Ǿ����ϴ�.\n", id);
			}
			else if ( command.equals("article list")) {
				System.out.println("�Խù��� �����ϴ�.");
			}
			else {
				System.out.printf("%s(��)�� �������� �ʴ� ��ɾ� �Դϴ�.\n", command);
			}
			
		}

		sc.close();

		System.out.println("==���α׷� ��==");
	}
}
