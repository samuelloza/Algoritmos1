package week4;

public class binarySearch {

	public static int binarySearch(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (array[mid] == target) {
				return mid;
			} else if (target > array[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = { 1, 4, 6, 8, 10, 11, 14, 16, 20 };
		int target = 10;
		int result = binarySearch(array, target);

		if (result != -1) {
			System.out.println("Elemento encontrado en el índice: " + result);
		} else {
			System.out.println("Elemento no encontrado en el array.");
		}
	}
}
