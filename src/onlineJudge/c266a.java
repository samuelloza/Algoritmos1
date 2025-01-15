package onlineJudge;

import java.util.Scanner;

public class c266a {

	public static int busca_iguales(String s, int index) {
		if (index >= s.length() || index + 1 >= s.length()) {
			return 0;
		}

		if (s.charAt(index) == s.charAt(index + 1)) {
			return busca_iguales(s, index + 1) + 1;
		}
		return busca_iguales(s, index + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		System.out.println(busca_iguales(s, 0));
	}
}
