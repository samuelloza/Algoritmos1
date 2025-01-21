package week3;

import java.io.IOException;
import java.util.Scanner;

public class c546A {

	public static void main(String[] args) throws IOException {
	
		Scanner sc = new Scanner(System.in);
		/*BufferedReader br = new BufferedReader
		          (new InputStreamReader(System.in));
		
        StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		long n = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
*/	
		int k = sc.nextInt();
		long n = sc.nextInt();
		int w = sc.nextInt();
		/*int sum = 0;
		for (int i = 1; i <= w; i++) {
			sum += (i*k);
		}*/
		
		int sum = k * ((w*(w+1)) / 2);
		long result = sum - n;
		if (result > 0) {
			System.out.println(result);
		} else {
			System.out.println(0);
		}
	}

}
