package day02;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double fir, sec, result;
		System.out.print("첫 번째 물건의 무게를 입력하시오? ");
		fir = sc.nextDouble();
		System.out.print("두 번째 물건의 무게를 입력하시오? ");
		sec = sc.nextDouble();
		
		result = 600 - fir - sec;
		System.out.println("현재 엘리베이터에 허용 무게는 "+result+"kg입니다.");
		
	}
}
