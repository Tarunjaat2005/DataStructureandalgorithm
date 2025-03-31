package Recursion;

public class SumofAnNaturalNumbersusingPMI {
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}
		int ans = sum(n-1);
		return n+ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		System.out.print(sum(n));

	}

}
