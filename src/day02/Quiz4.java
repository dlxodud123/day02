package day02;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year, born, age;
		System.out.print("올해의 년도를 4자리로 입력하세요? ");
		year = sc.nextInt();
		System.out.print("당신이 태어난 년도를 4자리로 입력하세요? ");
		born = sc.nextInt();
		age = year - born + 1;
		System.out.println("당신의 나이는 " + age + "살 입니다.");
	}
}
