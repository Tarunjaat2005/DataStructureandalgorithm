package String;

import java.util.Scanner;

public class palindrome_Of_String {
	public static boolean palindromeString(String str) {
		int i = 0;
		int j = str.length()-1;
		while(i<j) {
			if(str.charAt(i) !=str.charAt(j)) {
				return false;
			}else {
				i++;
				j--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(palindromeString(str));

	}

}
