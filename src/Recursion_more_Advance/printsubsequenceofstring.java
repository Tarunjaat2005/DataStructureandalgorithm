package Recursion_more_Advance;

public class printsubsequenceofstring {
	public static String[] print_SubSequence(String str) {
		if(str.length()==0) {
			String ans[] = {""};
			return ans; 
		}
		String smallans[] = print_SubSequence(str.substring(1));
		String ans[] = new String [2*smallans.length];
		//if we donot want to make it leanthy 
		//we can put k on the place of i;
		int k = 0;
		for(int i = 0;i<smallans.length;i++) {
			// here we can write ans[i];
			ans[k]= smallans[i];
			k++;
		}
		for(int i = 0;i<smallans.length;i++) {
			//and here we can write ans[i+smallans.length] 
			ans[k] = str.charAt(0)+smallans[i];
			k++;
		}
		return ans;
		
	}

	public static void main(String[] args) {
		String str = "xyz";
		String ans[] =  print_SubSequence(str);
		for(int i = 0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
