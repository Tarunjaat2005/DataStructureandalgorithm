package Recursion_more_Advance;

public class print_SubSequence_2 {
	
	public static void printSubSequence(String str,String outputSoFar) {
		if(str.length()==0) {
			System.out.println(outputSoFar+"  printed");
			return;
		}
		// this is for when we are not including first character
		printSubSequence(str.substring(1), outputSoFar);
		// this is for when we are  including first character
		printSubSequence(str.substring(1), outputSoFar+str.charAt(0));
	}
	public static void printSubSequence(String str) {
		printSubSequence(str, "");
		
	}

	public static void main(String[] args) {
		printSubSequence("xyz");

	}

}
