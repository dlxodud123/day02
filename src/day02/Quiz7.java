package day02;

import java.util.Scanner;

public class Quiz7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, sum;
		double avg;
		System.out.println("<결과>\n");
		System.out.print("학생 이름 : ");
		name = sc.next();
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		avg = (kor + eng + mat) / (double)3;
		System.out.println("=============학생정보==============================");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("------------------------------------------------");
		System.out.printf(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+sum+"\t"+"%.2f\n",avg);
	}
}
