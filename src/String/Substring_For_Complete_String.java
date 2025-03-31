package String;

public class Substring_For_Complete_String {
	/*
	 how to substring function work logic of this function si = StartIndex , ei = end index
	 public static String SubString(String str,int si,int ei){
	 String subStr = "";
	 for(int i = si;i<ei;i++){
	 subStr += str.charAt(i);
	 }
	 return subStr;
	}
}
	 
	 
	 */
	
	
	public static void printSubString(String str) {
		// using this we are using three for loop means that time complexity is not good
//		for(int start = 0;start<str.length();++start) {
//			for(int end = start ;end<str.length();++end) {
//				for(int k = start;k<=end;++k) {
//				System.out.print(str.charAt(k));
//			}
//				System.out.println();
//		}
//		}
		
		
		
	// in this we are using two loops and we use substring function in this
		for(int i = 0;i<str.length();i++) {
			for(int j = i;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
				
			}
		}
		// in  this we print by using length first print length 1 charac and then move for length 2 and move forward
//		for(int  len = 1;len<=str.length();len++) {
//			for(int start = 0;start <= str.length()-len;start++) {
//				int end = start +len-1;
//				System.out.println(str.substring(start,end+1));
//			}
//		}
//		 int n = str.length();
//	        for (int i = 0; i < n; i++) {
//	            String temp = "";
//	            for (int j = i; j < n; j++) {
//	                temp += str.charAt(j);
//	                System.out.println(temp);
//	            }
//	        }
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		printSubString(str);

	}

}
