package day02;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		String result, result2, result3;
		System.out.print("수 입력 : ");
		a = sc.nextInt();
		result = (a % 2 == 0) ? "짝수" : "홀수";
		System.out.println(a + " = " + result);
		
		result2 = (a % 3 == 0) ? "3의 배수가 맞다" : "3의 배수가 아니다";
		System.out.println(a + " = " + result2);
		
		System.out.print("두 수 입력 : ");
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println("num1 : " + b + ", num2 : " + c);
		
		result3 = (c>b) ? "num2가 num1보다 크다" : "num1이 num2보다 크다";
		System.out.println(result3);

	}
}
