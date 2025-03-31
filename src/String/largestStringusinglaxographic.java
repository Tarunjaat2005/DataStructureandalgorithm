package String;

public class largestStringusinglaxographic {

	public static void main(String[] args) {
		String fruits[]= {"apple","mango","banana","papaya"};
		String largest = fruits[0];
		for(int i = 1;i<fruits.length;i++) {
			// we use compareToIgnoreCase to ignore the capital and small latter and for treating different we use compareTO 
			if(largest.compareToIgnoreCase(fruits[i])<0) {
				largest = fruits[i];
			}
		}
		System.out.print(largest);

	}

}
