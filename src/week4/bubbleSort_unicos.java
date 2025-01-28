package week4;

public class bubbleSort_unicos {
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped;

		for (int i = n; i >= 1; i--) {
			swapped = false;

			for (int j = 0; j < i - 1; j++) {
				if (arr[j] == arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			if (!swapped)
				break;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1,4,5,6,7,7,8,9,7,2,1,3,4,6 };
		System.out.println("Arreglo original:");
		printArray(arr);

		bubbleSort(arr);

		System.out.println("\nArreglo ordenado:");
		printArray(arr);
	}

}
