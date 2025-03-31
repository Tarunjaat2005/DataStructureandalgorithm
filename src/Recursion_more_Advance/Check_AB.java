package Recursion_more_Advance;

public class Check_AB {
	
	public static boolean check_ABB(String str) {
		if(str.length()==0) {
			return true;
		}
		//// If the string starts with 'A'
		if(str.charAt(0)=='A') {
			/// If 'A' is followed by "BB", check the remaining substring after "BB"
			if(str.length()>2&&str.substring(1,3).equals("BB")) {
				return check_ABB(str.substring(3));
				// otherwise 
			}
			
		}
		return false;
		
	}

	public static void main(String[] args) {
		String string = "ABB";
		System.out.println(check_ABB(string));

	}

}
