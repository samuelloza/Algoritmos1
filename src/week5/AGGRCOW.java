package week5;
//https://www.spoj.com/problems/AGGRCOW/cstart=100

import java.util.Arrays;
import java.util.Scanner;

public class AGGRCOW {

	public static boolean is_valid(int array[], int dist, int cows) {
		int count = 1;
		int pos = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] - pos >= dist) {
				pos = array[i];
				count++;
			}

			if (count == cows) {
				return true;
			}
		}
		return false;
	}

	public static int binarySearch(int[] array, int cows) {
		int low = 1;
		int high = array[array.length - 1] - array[0] ;

		int max = 0;
		while (low <= high) {
			//distancia
			int mid = (low + high) / 2;

			if (is_valid(array, mid, cows)) {
				low = mid + 1;
				max = Math.max(max, mid);
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
		
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextLine();
			int n = sc.nextInt();
			int c = sc.nextInt();

			for (int i = 0; i < t; i++) {
				int vec[] = new int[n];
				for (int j = 0; j < vec.length; j++) {
					vec[j] = sc.nextInt();
				}
				Arrays.sort(vec);
				binarySearch(vec, c);
			}
		}
	}
	