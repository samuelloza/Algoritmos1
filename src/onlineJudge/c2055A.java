package onlineJudge;

import java.util.Scanner;

public class c2055A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n, a, b;
		for (int i = 0; i < t; i++) {
			n = sc.nextInt();
			a = sc.nextInt();
			b = sc.nextInt();
			
			if (Math.abs(a - b) % 2 == 1 && n % 2 == 0) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
	}

}
