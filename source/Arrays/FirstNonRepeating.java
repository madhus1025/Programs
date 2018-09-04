package Arrays;

import java.util.*;

/**
 * Given an array, find the first repeating element
 * Input : {1,2,3,3}
 * Output : {1}
 * 
 * @author Madhu Avinash
 *
 */
public class FirstNonRepeating {

	/**
	 * Insert all the elements into hash set, if any element already exists in the
	 * set, remove that element. At the end of the iteration return the first element in the hash set
	 * @param array
	 * @return First non repeating element, returns -1 incase all elements are repeated
	 */
	public static int findFirstNonRepeatingElement(int array[]) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int index=0; index < array.length; index++) {
			if(set.contains(array[index])) {
				set.remove(array[index]);
			}
			else {
				set.add(array[index]);
			}
		}
		if(set.size() == 0)
			return -1;
		else
			return set.iterator().next();
	}
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int array[] = new int[size];
		for(int index=0; index < size; index++) {
			array[index] = input.nextInt();
		}
		System.out.println(findFirstNonRepeatingElement(array));
	}
}
