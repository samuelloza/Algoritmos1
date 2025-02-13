package week6;

import java.util.PriorityQueue;
import java.util.Scanner;

class Pacient0 implements Comparable<Pacient0> {
	private String name;
	private int priority;

	public Pacient0(final String name, final int priority) {
		this.name = name;
		this.priority = priority;
	}
	
	public String getName() {
		return this.name;
	}

	
	public int getPrioriry() {
		return this.priority;
	}
	@Override
	public int compareTo(Pacient0 nextPacient) {
		
		return this.name.compareTo(nextPacient.name);
		/*if (nextPacient.priority > this.priority) {
			return 1;
		}

		if (nextPacient.priority == this.priority) {
			return 0;			
		}
		return -1;*/
	}

}

public class PrioriryQueueHospital {

	public static void main(String[] args) {
		
		
		System.out.println("abc".compareTo("abc"));
		
		
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int priority;
		String name;
		
		PriorityQueue<Pacient0> pacientQueue = new PriorityQueue<Pacient0>();
		for (int i = 0; i < n; i++) {
			name = sc.next();
			priority = sc.nextInt();
			pacientQueue.add(new Pacient0(name, priority));
		}
		
		while(!pacientQueue.isEmpty()) {
			Pacient0 tmp = pacientQueue.poll();
			System.out.println(tmp.getName() + " " + tmp.getPrioriry());
		}
	}
}
