package week3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class u11369_scanner {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int vec[] = new int[n];
			for (int j = 0; j < n; j++) {
				vec[j] = sc.nextInt();
			}
			
			Arrays.sort(vec);
			int descuento = 0;

			for (int j = n - 3; j >=0; j = j - 3) {
				descuento += vec[j];
			}
			
			System.out.println(descuento);
			/*System.out.println("+++++++++++++++");
			for (int j = 0; j < vec.length; j++) {
				System.out.print(vec[j] + " ");
			}*/
		}
	}

}


/*

5
6
400 100 200 350 300 250
9
400 350 300 250 100 50 40 10 9
6
400 100 200 350 300 250
2
100 50
3
100 50 10


*/