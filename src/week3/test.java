package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test {

	public static void main(String[] args) throws IOException {
	
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader
		          (new InputStreamReader(System.in));
		
        StringTokenizer st = new StringTokenizer(br.readLine());
        
		int k = Integer.parseInt(st.nextToken());
		long n = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
	
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
