package Arrays;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Madhu Avinash
 * Given array of integers, find total number of pairs whose sum is equal to a given number
 */
public class EqualPairSum {
	
	/**
	 * Logic:
	 * Insert all the elements into hashmap, since searching takes O(1) time.
	 * Num1 + Num2 = RequiredSum => Num1 = RequiredSum-Num2
	 * Iterate through the array with Num2, Search for Num1, if it is found increase count by 1
	 * @param array is the list of elements
	 * @param sum This is the required sum
	 * @return count of total number of pairs with sum equal to the given sum
	 */
	public static int numberOfPairsWithGivenSum(int array[], int sum) {
		
		int count=0;
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int index=0; index < array.length; index++) {
			set.add(array[index]);
		}
		
		for(int index=0; index < array.length; index++) {
			int requiredNum = sum - array[index];
			if(set.contains(requiredNum)) {
				count++;
			}
		}
		return count/2;
	}
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int array[] = new int[size];
		
		for(int index=0; index < size; index++) {
			array[index] = input.nextInt();
		}
		
		int requiredSum = input.nextInt();
		
		System.out.println(numberOfPairsWithGivenSum(array,requiredSum));
		
		input.close();
	}

}
