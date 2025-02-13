package week6;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for (int i = 0; i < n; i++) {
			queue.add(sc.nextInt());
		}
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}
