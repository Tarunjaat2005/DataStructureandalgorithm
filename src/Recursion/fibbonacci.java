package Recursion;

public class fibbonacci {
	public static int fib(int n) {
		if(n==0||n==1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
		
	}

	public static void main(String[] args) {
		int n =7;
		System.out.print(fib(n));
		

	}

}
