package Recursion;

public class Arraywithrecursion {
	public static int sum(int input[],int startIndex) {
		if(startIndex==input.length) {
			return 0;
		}
		return input[startIndex]+sum(input,startIndex+1);
	}
	public static int sum(int input[]) {
		return sum(input,0);
	}
	public static int multiple(int n,int m) {
		if(m==0) {
			return 0;
		}
		return n+multiple(n, m-1);
	}

	public static void main(String[] args) {
		int[] arr = {1,3,2,4,6};
		System.out.println(sum(arr));
//		System.out.println(multiple(2, 5));

	}

}
