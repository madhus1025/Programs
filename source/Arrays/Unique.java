package Arrays;

import java.util.Scanner;

/**
 * 
 * @author Madhu Avinash
 * Given an array, Every element is repeated twice except one, find that one
 * Input : 1 2 2 3 3 4 1
 * Output : 4
 *
 */
public class Unique {

	/**
	 * Logic : XOR of 2 same elements will result in 0, any element XOR with 0 will
	 * 		   be the same number, after XOR of all the numbers in array we will
	 * 		   get the unique element.
	 * 
	 * @param array self explanatory
	 * @param size self explanatory
	 * @return  self explanatory
	 */
	public static int findTheUniqueNumber(int array[]) {
		
		int result=0;
		
		for(int index=0; index < array.length; index++) {
			result ^= array[index];
		}
		return result;
	}
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int array[] = new int[size];
		
		for(int index=0; index < size; index++) {
			array[index] = input.nextInt();
		}
		
		System.out.println(findTheUniqueNumber(array));
		input.close();
	}
	
}
