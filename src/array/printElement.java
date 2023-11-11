package array;

public class printElement {
	public void printArray(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printElement printArr = new printElement();
		printArr.printArray(new int[] {5, 1, 2, 3, 5});

	}

}
