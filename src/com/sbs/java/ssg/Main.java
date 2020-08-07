package com.sbs.java.ssg; //������

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("==���α׷� ����==");

		Scanner sc = new Scanner(System.in);

		int lastArticleID = 0;
		List<Article> articles = new ArrayList<>();

		while (true) {
			System.out.println("��ɾ�) ");
			String command = sc.nextLine(); // ���͸� ������ ���� ������ ���, next�� ���� �� ������ ���

			command = command.trim(); // �翷�� ���⸦ ����
			if (command.length() == 0) {
				continue;
			}

			if (command.equals("system exit")) {
				break;
			}
			if (command.equals("article write")) {
				int id = lastArticleID + 1;
				lastArticleID = id;

				System.out.println("���� : ");
				String title = sc.nextLine();

				System.out.println("���� : ");
				String body = sc.nextLine();

				Article article = new Article(id, title, body);
				articles.add(article);

				System.out.printf("%d�� ���� �����Ǿ����ϴ�.\n", id);
			} else if (command.equals("article list")) {
				if (articles.size() == 0) {
					System.out.println("�Խù��� �����ϴ�.");
					continue;
				}
				System.out.println("��ȣ | ����");
				for (int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);

					System.out.printf("%d  | %s\n", article.id, article.title);
				}
			} else if (command.startsWith("article detail")) {
				String[] commandBits = command.split(" ");
				// commandBits[0] = article, commandBits[1] = detail, commandBits[2] = ����
				int id = Integer.parseInt(commandBits[2]); // String�� int������ �ٲ���

				boolean found = false;
				Article foundArticle = null;

				for (int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);

					if (article.id == id) {
						found = true;
						foundArticle = article;
						break;
					}

				}

				if (found == false) {
					System.out.printf("%d�� �Խù��� �������� �ʽ��ϴ�.\n", id);
					continue;
				}

				System.out.printf("��ȣ : %d\n", foundArticle.id);
				System.out.printf("��¥ : 2020-08-07\n");
				System.out.printf("���� : %s\n", foundArticle.title);
				System.out.printf("���� : %s\n", foundArticle.body);

			} else {
				System.out.printf("%s(��)�� �������� �ʴ� ��ɾ� �Դϴ�.\n", command);
			}

		}

		sc.close();

		System.out.println("==���α׷� ��==");
	}
}

class Article {
	int id;
	String title;
	String body;

	public Article(int id, String title, String body) { // Article ������
		this.id = id;
		this.title = title;
		this.body = body;
	}
}