package Recursion;
//here we are remove x from the String.like that we can remove any char
public class removeanychar {
	public static String removeX(String str) {
		if(str.length()==0) {
			return str;
		}
		String ans= "";
		if(str.charAt(0)!='x'&& str.charAt(0)!='X') {
			ans = ans+str.charAt(0);
		}
		String smallans= removeX(str.substring(1));
		return ans+smallans;
		
	}
	
	//replace the character with a to x
	
	public static String repalcechar(String str,char ch1,char ch2) {
		if(str.length()==0) {
			return str;
		}
		char ans;
		if(str.charAt(0)==ch1) {
			ans=ch2;
		}else {
			ans = str.charAt(0);
		}
		String smallans= repalcechar(str.substring(1),ch1,ch2);
		return ans+smallans;
	}
	/*
	 Remove Duplicates Recursively

Given a string S, remove consecutive duplicates from it recursively.
Input Format :
String S
Output Format :
Output string
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string
Sample Input 1 :
aabccba
Sample Output 1 :
abcba
Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz
	 */
	
	public static String removeDuplicate(String str) {
		if(str.length()<=1) {
			return str;
		}
		String ans ="";
		if(str.charAt(0)==str.charAt(1)) {
			ans+="";
		}else {
			ans+=str.charAt(0);
		}
		String smallans= removeDuplicate(str.substring(1));
		return ans+smallans;
	}
	
	public static String removeconcecutiveduplicatechar(String s) {
		if(s.length()<=1) {
			return s;
		}
		if(s.charAt(0)==s.charAt(1)) {
			return removeconcecutiveduplicatechar(s.substring(1));
		}else {
			String smallans = removeconcecutiveduplicatechar(s.substring(1));
			return s.charAt(0)+smallans;
		}
	}

	public static void main(String[] args) {
		String str= "XabxsweX";
		//This string for replace the character
		String str1 = "absdea";
		//this String is for remove concecutive duplicate
		String str3 = "aabbddea";
		System.out.println(removeconcecutiveduplicatechar(str3));
		//System.out.println(removeDuplicate(str3));
//		System.out.println(repalcechar(str1,'a','x'));
		//System.out.println(removeX(str));

	}

}
