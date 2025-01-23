package week3;

public class t_greedy_gastar_menor_numero_monedas {

	public static int select(int[] moneys, int capacity) {
		int index = -1;

		for (int i = moneys.length - 1; i >= 0; i--) {
			if (moneys[i] <= capacity) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static int[] greedy(int[] moneys, int capacity) {
		int[] solutions = new int[moneys.length];
		int remainingCapacity = capacity;

		while (remainingCapacity > 0) {
			int i = select(moneys, remainingCapacity);
			if (i == -1)
				break;

			int count = remainingCapacity / moneys[i];
			solutions[i] += count;
			remainingCapacity -= count * moneys[i];
		}

		return solutions;
	}

	public static void main(String[] args) {
		int[] m = { 1, 2, 5, 10, 18, 20 };
		int capacity = 36;

		int[] solution = greedy(m, capacity);
		int totalCoins = 0;
		for (int i = 0; i < solution.length; i++) {
			totalCoins += solution[i];
			System.out.println(solution[i] + " " + m[i]);
		}
		System.out.println(totalCoins);
	}
}
