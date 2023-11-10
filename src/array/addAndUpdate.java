package array;

public class addAndUpdate {
	public void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
	public void arrayDemo() {
		int[] myArray = new int[5]; //declaring and initializing the array
		// printArray(myArray);
		myArray[0] = 5; //adding values to ARRAY
		myArray[1] = 1;
		myArray[2] = 8;
		myArray[3] = 52;
		myArray[4] = 21;
		myArray[2] = 10000;  //UPDATING VALUE
		//myArray[5] = 52;     //index out of bound 
		printArray(myArray); 
		System.out.println(myArray.length); //ARRAY LENGTH
		System.out.println(myArray[myArray.length-1]); //LAST INDEX VALUE
		
		int[] arr = {5,1,8};
		printArray(arr);
		
	}
	public static void main (String[] args) {
		addAndUpdate arrUtil = new addAndUpdate();
		arrUtil.arrayDemo();      //calling the array demo method
	}

}
