package Arrays;

import java.util.Scanner;

/**
 * 
 * @author Madhu Avinash
 * Given 2 arrays, find the 2 highest numbers in the array.
 * Input : {1,2,3}
 * Output : {3,2}
 *
 */
public class TwoMaximums {

	
	public static int[] getTwoMaximums(int array[]) {
		
		int result[] = new int[2];
		int max, max2;
		
		if(array.length <= 2)
			return array;
		
		max=array[0];
		max2=array[1];
		
		if(array[0] < array[1]) {
			max=array[1];
			max2=array[0];
		}
		
		for(int index=2; index < array.length; index++) {
			
			if(array[index] > max){
				max2=max;
				max=array[index];
			}
			else if(array[index] > max2) {
				max2=array[index];
			}
		}
		result[0] = max;
		result[1] = max2;
		return result;
	}
 	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int array[] = new int[size];
		
		for(int index=0; index < size; index++) {
			array[index] = input.nextInt();
		}
		
		array = getTwoMaximums(array);
		for(int index=0; index < 2; index++) {
			System.out.println(array[index]);
		}
	}
	
}
