package array;

public class reverseArray {
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] numbers = {2, 11, 5, 10, 7, 8};
		printArray(numbers);

	}

}
