package Recursion_more_Advance;
public class Return_keypad {
	public static String[] singledigit (int n) {
		if(n<=1||n>9) {
			System.exit(0);
		}
		
		if(n==2) {
			String output[]= {"a","b","c"};
			return output;
		}else if(n==3) {
			String output[]= {"d","e","f"};
			return output;
		}else if(n==4) {
			String output[]= {"g","h","i"};
			return output;
		}else if(n==5) {
			String output[]= {"j","k","l"};
			return output;
		}else if(n==6) {
			String output[]= {"m","n","o"};
			return output;
		}else if(n==7) {
			String output[]= {"p","q","r","s"};
			return output;
		}else if(n==8) {
			String output[]= {"t","u","v"};
			return output;
		}else if(n==9) {
			String output[]= {"w","x","y","z"};
			return output;
			}else {
				String output[]= {""};
				return output;
			}
		}
	
	
	public static String[] keypad(int n) {
		if(n==0) {
			String output[] = {""};
			return output;
		}
		String smallNumberarray[] = keypad(n/10);
		String singledigitOutput[] = singledigit(n%10);
		String output[] = new String[singledigitOutput.length*smallNumberarray.length];
		int k = 0;
		for(int i = 0;i<singledigitOutput.length;i++) {
			for(int j = 0;j<smallNumberarray.length;j++) {
				output[k] = smallNumberarray[j]+singledigitOutput[i];
				k++;
			}
		}
		return output;
	}
	
	
	

	public static void main(String[] args) {
		int n = 23;
		String output[] = keypad(n);
        for (String str : output) {
            System.out.println(str);
        }
	}

}
