package Arrays;

import java.util.ArrayList;

/**
 * Given an array of integers ranging from 1 to n, figure out the duplicate numbers
 */

import java.util.Scanner;

public class DuplicateNumber {

	/**
	 * Logic:
	 * We traverse through the array, mark that numbers corresponding index to negative,
	 * if we encounter a negative value while traversing that is a duplicate number
	 *  
	 * @param array is the input array
	 * @return list of duplicate numbers
	 */
	public static ArrayList<Integer> findDuplicates(int array[]) {
		
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		
		for(int index=0; index < array.length; index++) {
			if(array[index] < 0) {
				resultList.add(array[index]);
			}
			else {
				array[array[index]] *= -1;
			}
		}
		return resultList;
	}
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int array[] = new int[size];
		
		for(int index=0; index < size; index++) {
			array[index] = input.nextInt();
		}
		
		ArrayList<Integer> duplicates = findDuplicates(array);
		
		for(int index=0; index < duplicates.size(); index++) {
			System.out.println(duplicates.get(index));
		}
		
		input.close();
	}
	
}
