package Recursion;

public class factorial {
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int smallFactorial = fact(n-1);
		return n*smallFactorial;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.print(fact(n));

	}

}
