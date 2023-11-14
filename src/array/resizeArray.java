package array;

public class resizeArray {
	public void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i ++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();;
	}
	public int[] resize(int[] arr, int capacity) {
		int[] temp = new int[capacity];
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];	
		}
		arr=temp;
		return arr;
	}

	public static void main(String[] args) {
	    resizeArray arrUtil = new resizeArray(); // Note the corrected class name (resizeArray)
	    int[] original = new int[] {5, 1, 2, 9, 10};
	    System.out.println("the size of the original array - " + original.length);
	    original = arrUtil.resize(original, 10);
	    System.out.println("the size of the original array - " + original.length);
	}
	
}



