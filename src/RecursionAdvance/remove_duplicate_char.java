package RecursionAdvance;

public class remove_duplicate_char {
	public static String removeduplicate(String str) {
		if(str.length()==1) {
			return str;
		}
		String smallans= removeduplicate(str.substring(1));
		if(str.charAt(0)==str.charAt(1)) {
			return removeduplicate(str.substring(1));
		}
		else {
			return str.charAt(0)+smallans;
		}
	}
	

	public static void main(String[] args) {
		String str = "xxyzzxx";
		System.out.print(removeduplicate(str));
	}

}
