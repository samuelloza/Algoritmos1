package week3;

import java.util.Scanner;

public class c886A {

	public static boolean isPossible(int vec[], int sum) {
		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 5; j++) {
				for (int k = j + 1; k < 6; k++) {
					int tmp = vec[i] + vec[j] + vec[k];
					if (tmp == sum / 2) {
						return true;
					}
				}
			}
		}
		return false;
	}
	//1 3 2 1 2 1
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vec[] = new  int[6];
		int sum= 0;
		for (int i = 0; i < vec.length; i++) {
			vec[i] = sc.nextInt();
			sum += vec[i];
		}
		
		// Es impar
		if (sum % 2 != 0) {
			System.out.println("NO");
		} else if (isPossible(vec, sum)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		/*System.out.println(sum);
		for (int i = 0; i < vec.length; i++) {
			System.out.print(vec[i] + " ");
		}*/
	}

}
