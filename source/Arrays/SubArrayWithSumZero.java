package Arrays;

import java.util.*;
/**
 * Given an array figoure out there exists a subset with sum zero
 * Input: 4 2 -3 1 6
 * Output: true
 * @author Madhu Avinash 
 *
 */
public class SubArrayWithSumZero {

	/**
	 * This function iterates over the array and calculates the sum, if at any point the sum is zero or the prefix sum is equal to
	 * a sum at a previous index then there exists a subset with sum zero
	 * @param array
	 */
	public static void isThereAnySubsetWithSumZero(int array[]) {
		
		int prefixSum=0;
		HashSet<Integer> list = new HashSet<Integer>();
		for(int index=0; index < array.length; index++) {
			prefixSum += array[index];
			if(prefixSum==0 || list.contains(prefixSum)) {
				System.out.println(true);
				return;
			}
			list.add(prefixSum);
		}
		System.out.println(false);
	}
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int array[] = new int[size];
		
		for(int index=0; index < size; index++) {
			array[index] = input.nextInt();
		}
		isThereAnySubsetWithSumZero(array);
	}
	
}
