package week3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class c724B {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("/home/sam/JalaU/laberinto/laberinto/src/week3/sample.in"));
		int n, m;
		n = sc.nextInt();
		m = sc.nextInt();

		int[][] mat = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		if (is_possible_sort(mat, n, m)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public static boolean is_possible_sort(int[][] mat, int n, int m) {
		int min = 1;
		boolean[] is_use;
		for (int i = 0; i < n; i++) {
			is_use = new boolean[m];
			min = 1;
			for (int j2 = 0; j2 < m; j2++) {
				System.out.print(mat[i][j2]);
			}
			System.out.println(",,,,,,,,,,,,,");
			for (int j = 0; j < m; j++) {
				System.out.println(mat[i][j] + " min =" + min);
				if (mat[i][j] == min) {
					min++;
					continue;
				}
				int swap = search_min(mat[i], j, min);
				if (swap == -1) {
					return false;
				} else if (is_use[swap] == false) {
					int aux = mat[i][j];
					mat[i][j] = mat[i][swap];
					mat[i][swap] = aux;
					//is_use[swap] = true;
					//is_use[j] = true;
					for (int j2 = 0; j2 < m; j2++) {
						System.out.print(mat[i][j2]);
					}
					System.out.println();
					for (int j2 = 0; j2 < m; j2++) {
						System.out.print(is_use[j2] + " ");
					}
					System.out.println();
				} else {
					return false;
				}

				min++;
			}
			System.out.println("_______________-");
		}
		return true;
	}

	public static int search_min(int[] mat, int current_pos, int current_min) {
		for (int i = current_pos; i < mat.length; i++) {
			if (mat[i] == current_min) {
				return i;
			}
		}
		return -1;
	}
}
