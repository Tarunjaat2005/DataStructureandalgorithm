package RecursionAdvance;

public class replace_characters_recurcsively {
	public static String replace_char(String str,char ch1,char ch2) {
		if(str.length()==0) {
			return str;
		}
		char ans ;
		String smallanS= replace_char(str.substring(1),ch1,ch2);
		if(str.charAt(0)==ch1) {
			ans = ch2;
		}else {
			ans=str.charAt(0);
		}
		return ans+smallanS;
		
	}

	public static void main(String[] args) {
		String str = "abstar";
//		char ch1 ='a';
//		char ch2 = 'x';
		System.out.println(replace_char(str, 'a', 'x'));

	}

}
