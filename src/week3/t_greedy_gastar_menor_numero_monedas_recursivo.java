package week3;

public class t_greedy_gastar_menor_numero_monedas_recursivo {

    public static int monedasRecursivo(int[] coins, int capacity, int index) {
        if (capacity == 0) {
            return 0;
        }
        if (index >= coins.length) {
            return -1;
        }

        int count = capacity / coins[index];
        int currentSolution = capacity % coins[index];

        return count + monedasRecursivo(coins, currentSolution, index + 1);
    }

    public static void main(String[] args) {
        int[] m = {20, 10, 5, 2, 1};
        int capacity = 36;
        int solution = monedasRecursivo(m, capacity, 0);
        System.out.println("Total = " + solution + " monedas");
    }
}
