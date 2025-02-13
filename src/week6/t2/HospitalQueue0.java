package week6.t2;

import java.util.PriorityQueue;
import java.util.Scanner;

class Pacient implements Comparable<Pacient> {

	public String name;
	public int priority;

	public Pacient(final String name, final int priority) {
		this.name = name;
		this.priority = priority;
	}

	@Override
	public int compareTo(Pacient o) {
		// < 0 El objeto actual es menor que el comparado.
		// 0 Los objetos son iguales.
		// > 0 El objeto actual es mayor que el comparado.

		if (o.priority > this.priority) {
			return 1;
		} else if (o.priority == this.priority) {
			return 0;
		}
		return -1;
	}
}

public class HospitalQueue0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String name;
		int priority;
		PriorityQueue<Pacient> queue = new PriorityQueue<Pacient>();
		for (int i = 0; i < n; i++) {
			name = sc.next();
			priority = sc.nextInt();
			queue.add(new Pacient(name, priority));
		}

		while (!queue.isEmpty()) {
			Pacient pacient = queue.poll();
			System.out.println(pacient.name);
			
		}

	}

}
