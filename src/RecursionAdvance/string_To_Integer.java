package RecursionAdvance;

public class string_To_Integer {
	public static int str_to_int(String str) {
		int ans;
		if(str.length()<=1) {
			return str.charAt(0)-'0';
		}
		int smallanS = str_to_int(str.substring(0,str.length()-1));
		int lastDigit = str.charAt(str.length()-1)-'0';
		return smallanS*10+lastDigit;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123456";
		System.out.println(str_to_int(str));

	}

}
