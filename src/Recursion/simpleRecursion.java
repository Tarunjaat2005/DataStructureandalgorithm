package Recursion;
public class simpleRecursion {
	public static int multiple(int m,int n) {
		if(m==0||n==0) {
			return 0;
		}
		return m+multiple(m, n-1);
	}
	public static int sum(int m) {
		if(m==1) {
			return 1;
		}
		//int smallcalc = 
		return m+sum(m-1);
	}
	
	public static long countZerosrec(long input) {
		if(input<10) {
		if(input ==0) {
			return 1;
		}else {
			return 0;
		}
	}
		if(input%10==0) {
			return countZerosrec(input/10)+1;
		}else {
			return countZerosrec(input/10);
		}
	}
	
	public static double geometric_sum(int k) {
		if(k==0) {
			return 1;
		}
		return  (geometric_sum(k-1)+1/Math.pow(2, k));
	}
	//function for reverse a String
	public static boolean solve(String str,int start,int end) {
		if(start>=end) {
			return true;
		}
		if(str.charAt(start)!=str.charAt(end)) {
			return false;
		}
		return solve(str, start+1, end-1);
	}
	public static boolean checkPalindrome(String str) {
		return solve(str, 0, str.length()-1);
	}
	
	////sum of digits
	public static int sumofDigits(int input) {
		int sum;
		if(input<10) {
			return input;
		}
		sum = (input%10)+sumofDigits(input/10);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(multiple(3, 2));
//		System.out.println(sum(5));
		//System.out.println(geometric_sum(1));
		//System.out.println(countZerosrec(1007030570));
		//System.out.println(checkPalindrome("racecar"));
		System.out.println(sumofDigits(12345));
	}

}
