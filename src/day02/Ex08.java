package day02;

public class Ex08 {
	public static void main(String[] args) {
		int n1 = 9, n2 = 2;
		System.out.println(n1 / n2);
		System.out.println(n1 / (double)n2);
		System.out.println(n1 % n2);
		
		System.out.println("==================");
		n1 = n2 = 5;
		n1 += 1;
		System.out.println(n1);
		n1 -= 1;
		System.out.println(n1);
		n1 *= n2;
		System.out.println(n1);
		n1 /= n2;
		System.out.println(n1);
		n1 %= n2;
		System.out.println(n1);

		System.out.println("==================");
		n1 = 5;
		n2 = 2;
		System.out.println(n1 > n2);
		System.out.println(n1 <= n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		
		boolean bool;
		bool = n1 > n2;
		System.out.println(bool);
		bool = n1 < n2;
		System.out.println(bool);
		
		System.out.println("==================");
		int n3 = 10;
		n1 = 5; n2 = 7; 
		System.out.println(n1 > n2 && n1 > n3);
		System.out.println(n2 > n1 && n2 > n3);
		System.out.println(n3 > n2 && n3 > n1);
		
		System.out.println("==================");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("==================");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("==================");
		System.out.println(!false);
		System.out.println(!true);
		System.out.println(!(10>5));
		
		System.out.println("==================");
		n1 = 10; n2 = 5;
		bool = n1 > n2 && n1 % 2 == 0;
		System.out.println(bool);
		
		System.out.println("==================");
		n1 = 5;
		++n1;
		System.out.println(n1);
		
		n2 = 5;
		n2++;
		System.out.println(n2);
		
		System.out.println("==================");
		n1 = 10;
		n2 = ++n1;
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		
		n1 = 10;
		n2 = n1++;
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		
		System.out.println("==================");
		int a = 5, b = 6, c = 10, d;
		d = ++a * b--;
		System.out.println(a + "," + b + "," + d);
		
		d = a++ + ++c - b--;
		System.out.println(a + "," + b + "," + c + "," + d);
		// 6 5 36
		// 7 4 11 12
		
		System.out.println("==================");
		n1 = 20;
		n2 = 10;
		String result;
		result = (n1>n2) ? "창인경우" : "거짓인경우";
		System.out.println(result);
	}
}










