package RecursionAdvance;

public class remove_X {
		public static String Remove_x(String str) {
			if(str.length()==0) {
				return str;
			}
			String ans = "";
			String smallans= Remove_x(str.substring(1));
//			//for this i am using also another also
//			if(str.charAt(0)=='x') {
//				ans= ""+smallans.substring(0);
//			}else {
//				ans = str.charAt(0)+smallans;
//			}
			
			//some small calculation not to large
			if(str.charAt(0)!='x') {// both are doing fine but upper is to big
				ans = ans +str.charAt(0);
			}
			return ans+smallans;
		}
	public static void main(String[] args) {
		String str = "xystsxyr";
		System.out.println(Remove_x(str));
	}

}
