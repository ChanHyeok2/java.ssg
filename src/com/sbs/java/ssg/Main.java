package com.sbs.java.ssg; //폴더명

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");

		Scanner sc = new Scanner(System.in);

		int lastArticleID = 0;
		List<Article> articles = new ArrayList<>();

		while (true) {
			System.out.println("명령어) ");
			String command = sc.nextLine(); // 엔터를 제외한 라인 끝까지 출력, next는 띄어쓰기 전 까지만 출력

			command = command.trim(); // 양옆의 띄어쓰기를 없앰
			if (command.length() == 0) {
				continue;
			}

			if (command.equals("system exit")) {
				break;
			}
			if (command.equals("article write")) {
				int id = lastArticleID + 1;
				lastArticleID = id;

				System.out.println("제목 : ");
				String title = sc.nextLine();

				System.out.println("내용 : ");
				String body = sc.nextLine();

				Article article = new Article(id, title, body);
				articles.add(article);

				System.out.printf("%d번 글이 생성되었습니다.\n", id);
			} else if (command.equals("article list")) {
				if (articles.size() == 0) {
					System.out.println("게시물이 없습니다.");
					continue;
				}
				System.out.println("번호 | 제목");
				for (int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);

					System.out.printf("%d  | %s\n", article.id, article.title);
				}
			} else if (command.startsWith("article detail")) {
				String[] commandBits = command.split(" ");
				// commandBits[0] = article, commandBits[1] = detail, commandBits[2] = 숫자
				int id = Integer.parseInt(commandBits[2]); // String을 int형으로 바꿔줌

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
					System.out.printf("%d번 게시물은 존재하지 않습니다.\n", id);
					continue;
				}

				System.out.printf("번호 : %d\n", foundArticle.id);
				System.out.printf("날짜 : 2020-08-07\n");
				System.out.printf("제목 : %s\n", foundArticle.title);
				System.out.printf("내용 : %s\n", foundArticle.body);

			} else {
				System.out.printf("%s(은)는 존재하지 않는 명령어 입니다.\n", command);
			}

		}

		sc.close();

		System.out.println("==프로그램 끝==");
	}
}

class Article {
	int id;
	String title;
	String body;

	public Article(int id, String title, String body) { // Article 생성자
		this.id = id;
		this.title = title;
		this.body = body;
	}
}