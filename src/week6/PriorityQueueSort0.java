package week6;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueSort0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			queue.add(sc.nextInt());
		}

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
	}
}
