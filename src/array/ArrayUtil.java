package array;

public class ArrayUtil {
	public void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
	public void arrayDemo() {
		int[] myArray = new int[5]; //declaring and initializing the array
		printArray(myArray);
		
	}
	public static void main (String[] args) {
		ArrayUtil arrUtil = new ArrayUtil();
		arrUtil.arrayDemo();      //calling the array demo method
	}

}
