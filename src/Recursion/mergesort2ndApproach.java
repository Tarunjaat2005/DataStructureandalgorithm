package Recursion;


public class mergesort2ndApproach {
	public static void mergesort(int[] input,int si,int ei) {
		if(si>=ei) {
			return;
		}
		int mid = (si+ei)/2;
		mergesort(input, si, mid);
		mergesort(input, mid+1, ei);
		merge(input, si, ei);
	}
	public static void merge(int[] input,int si,int ei) {
		int size = ei-si+1;
		int mid = (si+ei)/2;
		int[] out=new int [size];
		int i=si,j=mid+1,k=0;
		while(i<=mid&&j<=ei) {
			if(input[i]<input[j]) {
				out[k]=input[i];
				i++;
				k++;
			}else {
				out[k]=input[j];
				j++;
				k++;
			}
		}
		while(i<=mid) {
			out[k]=input[i];
			i++;
			k++;
		}
		while(j<=ei) {
			out[k]=input[j];
			j++;
			k++;
		}
		// for copy element in original array 
		int m = 0;
		for(int t =si;t<=ei;t++) {
			input[t] = out[m];
			m++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {6,4,5,3,2,1};
		mergesort(input, 0, input.length-1);
		for(int i = 0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();

	}

}
