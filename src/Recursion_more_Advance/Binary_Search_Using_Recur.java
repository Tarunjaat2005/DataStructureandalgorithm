package Recursion_more_Advance;

public class Binary_Search_Using_Recur {
	
	public static int binary_Search(int[] arr,int si,int ei,int element) {
		if(si>ei) {
			return -1;
		}
		int mid = (si+ei)/2;
		if(arr[mid]==element) {
			return mid;
		}
		else if(arr[mid]>element) {
			return binary_Search(arr, si, mid-1, element);
		}else {
			return binary_Search(arr, mid+1, ei, element);
		}
	}	
	
	public static int binarySearch(int arr[],int element) {
		return binary_Search(arr, 0, arr.length-1, element);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr []= {2,4,3,12,43,54,6,3,76,6};
		System.out.println(binarySearch(arr, 12));
	}

}
