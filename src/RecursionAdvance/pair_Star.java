package RecursionAdvance;

public class pair_Star {
	
	public static String found_pair_replace_star(String str) {
		if(str.length()==1) {
			return str;
		}
		String smallanS = found_pair_replace_star(str.substring(1));
		//by using this we use anything else and this is wrong according to the question
//		if(str.charAt(0)==smallanS.charAt(0)) {
//			return str.charAt(0)+"*"+smallanS.substring(1);
//		}else {
//			return str.charAt(0)+smallanS;
//		}
		
		//new one
		if(str.charAt(0)==str.charAt(1)) {
			return str.charAt(0)+"*"+str.charAt(1)+smallanS.substring(1);
		}else {
			return str.charAt(0)+smallanS;
		}
		
	}

	public static void main(String[] args) {
		String str = "aabbaa";
		System.out.println(found_pair_replace_star(str));

	}

}
