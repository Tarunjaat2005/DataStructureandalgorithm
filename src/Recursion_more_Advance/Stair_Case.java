//package Recursion_more_Advance;
//
//public class Stair_Case {
//	
//	//CSPW stands for climb_Stairs_possivle_ways
//	public static int CSPW(int n) {
//		if(n<0) {
//			return 0;
//		}
//		if(n==0) {
//			return 1;
//			
//		}
//		return CSPW(n-1)+CSPW(n-2)+CSPW(n-3);
//	}
//
//	public static void main(String[] args) {
//		int n = 4;
//		System.out.println(CSPW(n));
//
//	}
//
//}


package Recursion_more_Advance;

import java.util.ArrayList;

public class Stair_Case {

    public static void CSPW(int n, String path) {
        if (n < 0) {
            return;
        }
        if (n == 0) {
            System.out.println(path);
            return;
        }
        
        CSPW(n - 1, path + "1 ");  // Taking 1 step
        CSPW(n - 2, path + "2 ");  // Taking 2 steps
        CSPW(n - 3, path + "3 ");  // Taking 3 steps
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("All possible ways to climb " + n + " stairs:");
        CSPW(n, "");
    }
}
