package String;

import java.util.Scanner;

public class print_all_charac_of_a_String {
	public static void printChar(String str) {
		
		for(int i = 0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printChar(str);
		
	}

}
