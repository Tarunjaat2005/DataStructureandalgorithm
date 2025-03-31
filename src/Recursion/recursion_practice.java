package Recursion;

public class recursion_practice {
	//merge sort using recursion
	public static void merge_Sort(int[] arr,int si,int ei) {
		if(si>=ei) {
			return;
		}
		
		int mid = (si+ei)/2;
		merge_Sort(arr, si, mid);
		merge_Sort(arr, mid+1, ei);
		merge(arr,si,ei);
	}
//	public static void merge_Sort(int[] arr) {
//		merge_Sort(arr,0,arr.length-1);
//	}
	public static void merge(int []arr,int si,int ei) {
		int size = ei-si+1;
		int mid = (ei+si)/2;
		int output[] = new int[size];
		int i = si,j=mid+1,k=0;
		while(i<=mid&&j<=ei) {
			if(arr[i]<arr[j]) {
				output[k] = arr[i];
				i++;
				k++;
			}else {
				output[k] = arr[j];
				j++;
				k++;
			}
		}
		while(i<=mid) {
			output[k] = arr[i];
			i++;
			k++;
		}
		while(j<=ei) {
			output[k] = arr[j];
			j++;
			k++;
		}
		int m = 0;
		for(int t=si;t<=ei;t++) {
			arr[t] = output[m];
			m++;
		}
	}

	public static void quick_Sort(int[] arr,int si,int ei) {
		if(si>=ei) {
			return;
		}
		int pivotposition = partition(arr,si,ei);
		quick_Sort(arr, si, pivotposition-1);
		quick_Sort(arr, pivotposition+1, ei);
	}
	public static int partition(int[] arr,int si,int ei) {
		int pivot = arr[si];
		int countSmaller = 0;
		for(int i = si+1;i<=ei;i++) {
			if(arr[i]<pivot) {
				countSmaller++;
			}
		}
		int pivotIndex = si+countSmaller;
		 arr[si] = arr[pivotIndex];
		 arr[pivotIndex] = pivot;
		 int i=si,j=ei;
		 while(i<pivotIndex&&j>pivotIndex) {
			 if(arr[i]<pivot) {
				 i++;
			 }else if(arr[j]>pivot) {
				 j--;
			 }else {
				 int temp = arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
				 i++;   
				 j--;
			 }
		}
		 return pivotIndex;
	}
	
	
	public static String returnpi(String input) {
		if(input.length()<=1) {
			return input;
		}
		String output ;
		String smallans = returnpi(input.substring(1));
		if(input.charAt(0) == 'p'&&smallans.charAt(0)=='i') {
			output = "3.14"+smallans.substring(1);
		}else {
			output = input.charAt(0)+smallans;
		}
		return output;
	}
	
	
	
	public static String removex(String str) {
		if(str.length()<=1) {
			return str;
		}
		if(str.charAt(0)=='x') {
			return removex(str.substring(1));
		}
		return str.charAt(0)+removex(str.substring(1));
	}
	
	
	public static int convertStringtoint(String str) {
		if(str.length()==1) {
			return str.charAt(0)-'0';
		}
		int smallans = convertStringtoint(str.substring(0, str.length()-1));
		int lastdigit = str.charAt(str.length()-1)-'0';
		return smallans*10+lastdigit;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {8,4,6,5,3,1,2};
//		quick_Sort(arr, 0,arr.length-1);
//		//merge_Sort(arr,0,arr.length-1);
//		for(int i = 0;i<=arr.length-1;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		//
//		
//		String str = "pixpi";
//		System.out.println(returnpi(str));
		
//		String str = "xpixxab";
//		System.out.print(removex(str));
		
		
		String str = "1234";
		System.out.print(convertStringtoint(str));
	}

}
