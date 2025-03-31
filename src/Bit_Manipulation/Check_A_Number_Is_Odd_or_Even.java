package Bit_Manipulation;

public class Check_A_Number_Is_Odd_or_Even {
	public static void oddOrEven(int n) {
		if((n&1)==0) {
			System.out.print("Even");
		}else {
			System.out.print("odd");
		}
	}

	public static void main(String[] args) {
		//int n = 5;
		oddOrEven(4);

	}

}
