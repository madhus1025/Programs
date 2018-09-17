package Arrays;

import java.util.*;

/**
 * 
 * @author KH1998
 *
 */
public class SmallestPositive {


	/**
	 * This function returns the smallest number for which, using the given array elements we cannot construct a sum.
	 * @param array
	 * @return
	 */
	public static int getNumber(int array[]) {
		
		int result = 1;
		
		for (int i = 0; i < array.length && array[i] <= result; i++) {
            result = result + array[i];
		}
		return result;
	}
	
	public static void main(String args[]) {
	
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int array[] = new int[size];
		
		for(int index=0; index<size; index++) {
			array[index] = input.nextInt();
		}
		System.out.println(getNumber(array));
	}
}
