package Recursion_more_Advance;

import java.util.Scanner;

public class Return_KeyPad_2 {
	
	public static String singledigit(int n) {
	    if (n < 2 || n > 9) {
	        System.exit(0);
	    }
	    
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
 public static int keypad(int input,String output[]) {
	 if(input==0) {
		 output[0]="";
		 return 1;
	 }
	 // Extract the last digit
	 int lastDigit = input%10;
	 //: Remove the last digit (reduce the number)
	 int smallNumber = input/10;
	 //Recursively solve for smallNumber
	 int smalloutputSize = keypad(smallNumber, output);
	 //Get corresponding letters for lastDigit return 3 >> def
	 String options = singledigit(lastDigit);
	 
	 for(int i = 0;i<options.length()-1;i++) {
		 for(int j = 0;j<smalloutputSize;j++) {
			 output[j+(i+1) * smalloutputSize] = output[j];
		 }
	 }
	 
	 int k = 0;
	 for(int i = 0;i<options.length();i++) {
		 for(int j = 0;j<smalloutputSize;j++) {
			 output[k] +=options.charAt(i);
			 k++;
		 }
	 }
	 return smalloutputSize*options.length();
	 
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n =scanner.nextInt();
		String output[]=new String[1000];
		int count = keypad(n, output);
		for(int i=0;i< count;i++) {
			System.out.println(output[i]);
		}
		

	}

}
