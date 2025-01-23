package week3;

public class t_greedy_gastar_menor_numero_monedas {

	public static int select(int[] coins, int capacity) {
		int index = -1;

		for (int i = 0; i < coins.length; i++) {
			if (coins[i] <= capacity) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static int[] monedas(int[] coins, int capacity) {
		int[] solutions = new int[coins.length];
		int currentSolution = capacity;

		while (currentSolution > 0) {
			int index = select(coins, currentSolution);
			if (index == -1)
				break;
			
			int count = currentSolution / coins[index];
			solutions[index] += count;
			currentSolution -= (coins[index] * count);
		}

		return solutions;
	}

	public static void main(String[] args) {
		int[] m = { 20, 10, 5, 2, 1};
		int capacity = 36;

		int[] solution = monedas(m, capacity);
		int totalCoins = 0;
		for (int i = 0; i < solution.length; i++) {
			totalCoins += solution[i];
			System.out.println("Se uso " + solution[i] + " monedas de " + m[i] + " pesos");
		}
		System.out.println("Total  = " + totalCoins + " monedas");
	}
}
