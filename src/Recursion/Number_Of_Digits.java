package Recursion;

public class Number_Of_Digits {
	public static int count(int n) {
		if(n==0) {
			return 0;
		}
		int Smallans = count(n/10);
		return Smallans+1;
	}

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		int n = 564;
		System.out.print(count(n));
	}

}
