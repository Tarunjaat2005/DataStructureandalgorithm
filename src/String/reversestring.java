package String;

import java.util.Scanner;

public class reversestring {
	public static String reverseString(String str) {
		String revString = "";
//		for(int i = str.length()-1;i>=0;i--) {
//			System.out.print(str.charAt(i));
//		}
		for(int i = 0;i<str.length();i++) {
			revString = str.charAt(i)+ revString;
			
		}
		return revString;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(reverseString(str));

	}

}
