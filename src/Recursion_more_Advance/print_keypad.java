package Recursion_more_Advance;

import java.util.Scanner;

public class print_keypad {
	
	public static String singledigit(int n) { 
	    if (n == 2) return "abc";
	    if (n == 3) return "def";
	    if (n == 4) return "ghi";
	    if (n == 5) return "jkl";
	    if (n == 6) return "mno";
	    if (n == 7) return "pqrs";
	    if (n == 8) return "tuv";
	    if (n == 9) return "wxyz";
	    
	    return ""; 
	}
	public static void print_Keypad(int input,String output) {
		if(input==0) {
			System.out.println(output);
			return;
		}
//		int lastDigit = input%10;
//		int smallNumber = input/10;
//		String option =  singledigit(lastDigit);
//		for(int i = 0;i<option.length();i++) {
//			print_Keypad(smallNumber, option.charAt(i)+output);
//		}
		
		String singledigitout= singledigit(input%10);
		for(int i = 0;i<singledigitout.length();i++) {
			print_Keypad(input/10, singledigitout.charAt(i)+output);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		print_Keypad(n, "");

	}

}
