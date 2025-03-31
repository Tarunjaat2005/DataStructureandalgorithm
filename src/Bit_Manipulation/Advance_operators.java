package Bit_Manipulation;

import java.net.DatagramSocket;
import java.security.PKCS12Attribute;

public class Advance_operators {
	public static int getIthBit(int n,int i) {
		int bitmask = 1<<i;
		if((n&bitmask)==0) {
			return 0;
		}else {
			return 1;
		}
	}
	
	public static int setIthBit(int n,int i) {
		  int bitMask = 1 <<i;
		  return n|bitMask;
	}
	
	public static int clearIthBit(int n,int i) {
		int bitMask = ~(1<<i) ;
		return n&bitMask;
	}
	
	
	public static int updateIthbit(int n,int i,int newBit) {
//		 if(newBit==0) {
//			 return  clearIthBit(n, i);
//		 }else {
//			 return setIthBit(n, i);
//		 }
		n= clearIthBit(n, i);
		int bitMask = newBit<<i;
		return n|bitMask;  
	}
	
	public static int clearlastIthbit(int n,int i) {
		int bitMask = (~0)<<i;
		return n&bitMask;
	}
	
	public static int clearijbitsinrange(int n,int i,int j) {
		int a = ((~0)<<(j+1));
		int b = (1<<i)-1;
		int bitMask = a|b;
		return n&bitMask;
	}
	
	public static boolean checkpoweroftwo(int n) {
		return ((n&(n-1))==0);
	}
	
	
	public static int countsetBits(int n) {
		int count  = 0;
		while(n>0) {
			if((n&1)!=0) {
				count++;
			}
			n=n>>1;
		}
		return count;
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
		//System.out.print(getIthBit(10,2));
		// System.out.print(setIthBit(10, 2));
		//System.out.print(clearIthBit(10, 1));
		//System.out.print(updateIthbit(10, 2, 1));
		//System.out.print(clearlastIthbit(15, 2));
		//System.out.println(clearijbitsinrange(10, 2, 4));
		//System.out.print(checkpoweroftwo(15));
		
		//System.out.println(countsetBits(20));
		
		System.out.println(fastExponentiation(3, 5));
	}

}
