package vankrimpen.dustin;

public class MagicIndex {
	
	/*
	 * Given a sorted array A of distinct integers, write a method to find a magic index, if one exists, in array A
	 */
	
	// initial call to magicIndex
	private static int magicIndex(int[] arr) {
		return magicIndex(arr, 0, arr.length-1);
		
	}
	// recursively search array for magic index 
	private static int magicIndex(int[] arr, int start, int end) {
		// return -1 if no magic index is found 
		if(start > end) {
			return -1;
		}
		int mid = (start+end) /2;
		
		// return magic index if found
		if(mid == arr[mid]) {
			return mid;
		}
		// search the right half if the mid point is greater than its index
		else if(mid > arr[mid]) {
			return magicIndex(arr,mid+1,end); 
		}
		// search the left half if the mid point is less than its index
		else {
			return magicIndex(arr,start,mid-1);
		}
		
		
	}
	
	// print results given an index returned from magicIndex()  
	private static void printResults(int index) {
		if(index >= 0) {
			System.out.println("Magic index found at:");
			System.out.println(index);
			System.out.println("");
		}
		else {
			System.out.println("No magic index found.");
		}
	}
	// print array 
	private static void printArray(int[] a) {
		System.out.print("Array:\n{");
		for(int i : a) {
			System.out.print(i);
			System.out.print(",");
		}
		System.out.print("}\n");
	}

	public static void main(String[] args) {
		int[] a = {-9,-5,-3,-1,0,2,3,4,5,9,13,60,101};
		int[] b = {-9000,-500,-30,-11,-4,0,2,3,4,5,9,13,60,101,1000,12039,1029102};
		
		printArray(a);
		int index = magicIndex(a);
		printResults(index);
		
		printArray(b);
		index = magicIndex(b);
		printResults(index);		

	}

}
