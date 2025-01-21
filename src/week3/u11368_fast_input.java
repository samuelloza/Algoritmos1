package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class u11368_fast_input {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
		int t = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < t; i++) {
//			int n = sc.nextInt();
			int n = Integer.parseInt(br.readLine().trim());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int vec[] = new int[n];
			for (int j = 0; j < n; j++) {
				vec[j] = Integer.parseInt(st.nextToken());
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