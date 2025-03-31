package Recursion;

public class CalculatePower {
	public static int power(int x,int n){
	    if(x==0&&n==0){
	        return 1;
	    }
	    if(x==0) {
	    	return 0;
	    }
	    if(n==0) {
	    	return 1;
	    }
	    int smallans = power(x,n/2);
	    if(n%2==0){
	        return smallans*smallans;
	    }else{
	        return x*smallans*smallans;
	    }
	    
	}
	public static int power1(int base,int exponent) {
		if(exponent ==0) {
			return 1;
		}
		return base*power1(base, exponent-1);
	}
	public static int fastExponentiation(int a,int n) {
		int ans =1;
		while(n>0) {
		if((n&1)!=0) {
			ans = ans*a; 
		}
		a = a*a;
		n=n>>1;
	}
		return ans;
}

	public static void main(String[] args) {
		int x = 3 , n = 2;
		System.out.print(power(x,n));	
//		System.out.println(power1(x, n));
//		System.out.println(fastExponentiation(x, n));

	}

}
