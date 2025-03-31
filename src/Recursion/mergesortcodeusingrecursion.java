
package Recursion;
import java.util.Arrays; 
import java.util.Scanner;
public class mergesortcodeusingrecursion {
	public static void mergeSort(int[] input) {
		if(input.length<=1) {
			return;
		}
		int mid = input.length/2;
		int part1[] = new int[mid];
		int part2[] = new int[input.length-mid];
		for(int i = 0;i<mid;i++) {
			part1[i]=input[i];
		}
		int k = 0;
		for(int i=mid;i<input.length;i++) {
			part2[k]= input[i];
			k++;
		}
		mergeSort(part1);
		mergeSort(part2);
		merge(part1,part2,input);
		 System.out.println(Arrays.toString(input));
	}
	public static void merge(int[] part1,int[] part2,int[] output) {
		int i = 0,j=0,k=0;
		while(i<part1.length&&j<part2.length) {
			if(part1[i]<part2[j]) {
				output[k] = part1[i];
				i++;
				k++;
			}else {
				output[k]= part2[j];
				j++;
				k++;
			}
		}
			while(i<part1.length) {
				output[k] = part1[i];
				k++;
				i++;
			}
			while(j<part2.length) {
				output[k] = part2[j];
				j++;
				k++;
			
		}
	}
	
	public static void mergeSort2(int input[], int left, int right) {
        if (left >= right) { // Fixed base case
            return;
        }

        int mid = left + (right - left) / 2; // Fixed mid calculation

        mergeSort2(input, left, mid);      // Left part
        mergeSort2(input, mid + 1, right); // Right part

        merge2(input, left, mid, right);   // Merge the sorted parts
       // System.out.println(Arrays.toString(input));
    }

    public static void merge2(int[] input, int left, int mid, int right) {
        int leftsubarray = mid - left + 1; // Length of left subarray
        int rightsubarray = right - mid;   // Length of right subarray

        int[] leftarr = new int[leftsubarray];
        int[] rightarr = new int[rightsubarray];

        // Copy data to left and right subarrays
        for (int i = 0; i < leftsubarray; i++) {
            leftarr[i] = input[left + i];
        }
        for (int j = 0; j < rightsubarray; j++) {
            rightarr[j] = input[mid + 1 + j];
        }

        // Merge the two subarrays
        int i = 0, j = 0, k = left;
        while (i < leftsubarray && j < rightsubarray) {
            if (leftarr[i] <= rightarr[j]) {
                input[k] = leftarr[i];
                i++;
            } else {
                input[k] = rightarr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left array
        while (i < leftsubarray) {
            input[k++] = leftarr[i++];
        }

        // Copy remaining elements of right array
        while (j < rightsubarray) {
            input[k++] = rightarr[j++];
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {8,3,5,2,8,6,9,1};
		mergeSort2(input, 0, input.length-1);
//		mergeSort(input);
        System.out.println(Arrays.toString(input));

	}

}
