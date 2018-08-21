package Arrays;

/**
 * Given an array of integers ranging from 1 to n of size n-1, figure out the missing number
 */

import java.util.Scanner;

public class MissingNumber {
	
	/**
	 * The logic of this function is 
	 * 
	 * Since the numbers range from 1 to N the sum of all those numbers should be (N*(N+1))/2
	 * If we differentiate expected sum vs actual sum we will get the missing number
	 * 
	 * Time Complexity O(N)
	 * Space Complexity O(1)
	 * 
	 * @param array is the input array
	 * @return the missing number in the array
	 */
	public static long findMissingNumber(int array[]) {
		
		long actualSum=0;
		long expectedSum = (array.length * (array.length+1))/2;
		for(int index=0; index < array.length; index++) {
			actualSum+=array[index];
		}
		return expectedSum-actualSum;
	}

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int array[] = new int[size];
		
		for(int index=0; index < size; index++) {
			array[index] = input.nextInt();
		}
		
		System.out.println(findMissingNumber(array));
		
		input.close();
	}
	
	
}
