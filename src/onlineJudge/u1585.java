package onlineJudge;

import java.util.Scanner;

public class u1585 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int emperor_count = 0;
		int littele_count = 0;
		int macaroni_count = 0;
		String penguin = "";

		for (int i = 0; i < n; i++) {
			penguin = sc.nextLine();

			if (penguin.equals("Emperor Penguin")) {
				emperor_count++;
			} else if (penguin.equals("Macaroni Penguin")) {
				macaroni_count++;
			} else {
				littele_count++;
			}
		}

		if (emperor_count > littele_count && emperor_count > macaroni_count) {
			System.out.println("Emperor Penguin");
		} else if (littele_count > emperor_count && littele_count > macaroni_count) {
			System.out.println("Little Penguin");
		} else {
			System.out.println("Macaroni Penguin");
		}
	}
}
