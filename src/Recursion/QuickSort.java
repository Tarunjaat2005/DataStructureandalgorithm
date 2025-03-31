package Recursion;


public class QuickSort {
	
	public static void Quicksort(int[] arr,int si,int ei) {
		if(si>=ei) {
			return;
		}
		int pivotpos = partition(arr,si,ei);
		Quicksort(arr, si, pivotpos-1);
		Quicksort(arr, pivotpos+1, ei);
	}
	public static void Quicksort(int[] arr) {
		Quicksort(arr, 0, arr.length-1);
	}
	
	
	public static int partition(int[] input,int si, int ei) {
		int pivot = input[si];
		int count = 0;
		for(int i = si+1;i<=ei;i++) {
			if(input[i]<pivot) {
				count++;
			}
		}
		int pivotIndex = si+count;
		input[si] = input[pivotIndex];
		input[pivotIndex] = pivot;
		int i = si,j=ei;
		while(i<j) {
			while(i<=ei&&input[i]<=pivot) {
				i++;
			}
			while(input[j]>pivot) {
				j--;
			}
			if(i<=j) {
				int temp = input[i];
				input[i]=input[j];
				input[j]=temp;
				i++;
				j--;
			}
		}
		return pivotIndex;
	}
	
	public static int partiotion1(int[] arr,int si,int ei) {
		int pivot = arr[si];
		int countSmaller = 0;
		for(int i = si;i<=ei;i++) {
			if(arr[i]<pivot) {
				countSmaller++;
			}
		}
			int pivotIndex = si+countSmaller;
			arr[si] = arr[pivotIndex];
			arr[pivotIndex] = pivot;
			int i = si,j=ei;
			while(i<pivotIndex && j>pivotIndex) {
				if(arr[i]<pivot) {
					i++;
				}else if(arr[j]>pivot) {
					j--;
				}else {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i++;
					j--;
				}
			}
		return pivotIndex;
	}
	public static void Quick_sort1(int []arr,int si,int ei) {
		if(si>=ei) {
			return;
		}
		int pivotpostion = partiotion1(arr, si, ei);
		Quick_sort1(arr, si, pivotpostion-1);
		Quick_sort1(arr, pivotpostion+1, ei);
		
	}

	public static void main(String[] args) {
		int[] arr = {2,6,8,5,4,3};
//		Quicksort(arr);
		Quick_sort1(arr, 0, arr.length-1);
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
                                             
}
