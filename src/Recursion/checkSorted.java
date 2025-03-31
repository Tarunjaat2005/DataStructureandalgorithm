package Recursion;

public class checkSorted {
	//InThis section we are checking that 0th elemnt is sorted aur smaller than 1 element
	public static boolean checkSorted_1(int arr[]) {
		if(arr.length<=1) {
			return true;
		}
		int smallInput[] = new int[arr.length-1];
		for(int i = 1;i<arr.length;i++) {
			smallInput[i-1]=arr[i];
		}
		boolean smallans = checkSorted_1(smallInput);
		if(arr[0]>arr[1]) {
			return false;
		}else {
			return true;
		}
	}
	// In This section we first checking that 0th index element is greater than 1th index or not if it is bigger than that return false;
	static boolean checkSorted_2(int arr[]) {
		if(arr.length<=1) {
			return true;
		}
		if(arr[0]>arr[1]) {
			return false;
		}
		int smallInput[] = new int[arr.length-1];
		for(int i = 1;i<arr.length;i++) {
			smallInput[i-1]=arr[i];
		}
		boolean smallans = checkSorted_2(smallInput);
		return smallans;
		
	}
	
	public static boolean checkSortedBetter(int input[],int startIndex) {
		if(startIndex == input.length-1) {
			return true;
		}
		if(input[startIndex]>input[startIndex+1]) {
			return false;
		}
		return checkSortedBetter(input, startIndex+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,2,3,4,5};
		//System.out.print(checkSorted_2(arr));
		System.out.print(checkSortedBetter(arr, 0));

	}

}
