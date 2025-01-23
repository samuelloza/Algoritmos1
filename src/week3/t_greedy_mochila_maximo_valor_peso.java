package week3;

public class t_greedy_mochila_maximo_valor_peso {

	public static int select(int[] values, int[] weights, double[] solutions, boolean[] visited) {
		int index = -1;
		double maxi = Integer.MIN_VALUE;

		for (int i = 0; i < values.length; i++) {
			double tmp = (double) values[i] / weights[i];

			if (tmp > maxi && visited[i] == false) {
				maxi = tmp;
				index = i;
			}
		}
		return index;
	}

	public static double[] greedy(int[] weights, int[] values, int capacity) {
		double[] solutions = new double[weights.length];
		boolean[] visited = new boolean[weights.length];

		double currentWeight = 0;

		while (currentWeight < capacity) {
			int i = select(values, weights, solutions, visited); // Escoge la mejor solución
			if (i == -1) {
				break;
			}

			visited[i] = true;
			if (currentWeight + weights[i] <= capacity) {
				solutions[i] = 1;
				currentWeight += weights[i];
			} else {
				solutions[i] = (capacity - currentWeight) / (double) weights[i];
				break;
			}
		}

		return solutions;
	}

	public static void main(String[] args) {
		int[] w = { 10, 20, 30, 40, 50 };
		int[] v = { 20, 30, 66, 40, 60 };
		int capacity = 100;
		double[] solution = greedy(w, v, capacity);
		double total = 0;
		for (int i = 0; i < v.length; i++) {
			System.out.println(solution[i]);
			total += solution[i] * v[i];
		}
		System.out.println(total);
	}

}
