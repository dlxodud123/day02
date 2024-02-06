package day02;

import java.util.Scanner;

public class Quiz6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double height, weight, result, result2;
		System.out.print("키를 입력하세요? ");
		height = sc.nextDouble();
		
		result = (height - 100) * 0.9;
		System.out.printf("표준 체중은 %.1f입니다.\n", result);
		
		System.out.print("키를 입력하세요? ");
		height = sc.nextDouble();
		System.out.print("현재 체중을 입력하세요? ");
		weight = sc.nextDouble();
		
		result2 = (weight / result) * 100;
		System.out.printf("표준 체중은 %.1f이고 비만도는 %.2f입니다.",result, result2);
		System.out.println();
	}
}
