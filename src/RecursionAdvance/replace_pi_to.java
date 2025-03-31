package RecursionAdvance;

public class replace_pi_to {
	public static String pi_to_value(String str){
		if(str.length()==0) {
			return str;
		}
		String anS;
		String smallans= pi_to_value(str.substring(1));
		if(str.charAt(0)=='p'&&smallans.charAt(0)=='i') {
			anS = "3.14"+smallans.substring(1);
		}else {
			anS = str.charAt(0)+smallans;
		}
		return anS;
	}
	public static void main(String[] args) {
		String str = "pxrtpi";
		System.out.println(pi_to_value(str));
		
	}

}
