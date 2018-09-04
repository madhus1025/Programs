package Arrays;

import java.util.*;

/**
 * Given an array, find the first repeating element
 * Input : {1,2,3,1,3,2}
 * Output : {1}
 * 
 * @author Madhu Avinash
 *
 */
public class FirstRepeating {

	/**
	 * Insert all the elements into hash set, if any element already exists in the
	 * array, return that element since that is the first non repeating element
	 * @param array
	 * @return First repeating element
	 */
	public static int findFirstRepeatingElement(int array[]) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int index=0; index < array.length; index++) {
			if(set.contains(array[index])) {
				return array[index];
			}
			set.add(array[index]);
		}
		return -1;
		
	}
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int array[] = new int[size];
		for(int index=0; index < size; index++) {
			array[index] = input.nextInt();
		}
		System.out.println(findFirstRepeatingElement(array));
	}
}
