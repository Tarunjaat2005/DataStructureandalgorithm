package Recursion;

public class printAllNumbers {
	public static void Prints(int n) {
		if(n==1) {
			System.out.print(n+" ");
			return;
		}
		Prints(n-1);
		System.out.print(n+" ");
	}

	public static void main(String[] args) {
		int n = 6;
		Prints(n);

	}

}
