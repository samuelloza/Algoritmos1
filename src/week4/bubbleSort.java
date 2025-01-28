package week4;

public class bubbleSort {
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped;

		// Últimos i elementos ya están en su lugar
		for (int i = n; i >= 1; i--) {
			swapped = false; // Inicializamos swapped en cada iteración

			// Recorre todos los elementos del arreglo
			for (int j = 0; j < i - 1; j++) {
				// Intercambia si el elemento encontrado es mayor que el siguiente
				if (arr[j] < arr[j + 1]) {
					// Intercambiamos
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			// Si no hubo intercambios en esta iteración, el arreglo ya está ordenado
			if (!swapped)
				break;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 64, 34, 25, 12, 22, 11, 90, 1, 0, 10, 6 };
		System.out.println("Arreglo original:");
		printArray(arr);

		bubbleSort(arr);

		System.out.println("\nArreglo ordenado:");
		printArray(arr);
	}

}
