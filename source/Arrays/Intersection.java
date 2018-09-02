package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Madhu Avinash
 * Given two sorted arrays, find the intersection of them
 * Input: [1 2 3] [2 4 6]
 * Output [2]
 */
public class Intersection {
	
	/**
	 * Logic: Traverse through both the arrays at the same time, if we encounter
	 * 		  the same value insert into the result list
	 * 		  If array 1 current value is greater than array2 current value, we
	 * 		  can infer that the array1 current value could exist at a later point
	 * 		  in array2 and the vice versa(since the arrays are sorted)
	 * 
	 * @param array1 self explanatory
	 * @param array2 self explanatory
	 * @return list of intersected integers between array1 and array2
	 */
	public static ArrayList<Integer> findIntersection(int array1[], int array2[]) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int array1Index=0;
		int array2Index=0;
		
		while(array1Index < array1.length && array2Index < array2.length) {
			if(array1[array1Index] == array2[array2Index]) {
				list.add(array1[array1Index]);
				array2Index++;
				array1Index++;
			}
			else if(array1[array1Index] > array2[array2Index]){
				array2Index++;
			}
			else {
				array1Index++;
			}
		}	
		
		return list;
	}

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int array1Size = input.nextInt();
		int array1[] = new int[array1Size];
		
		for(int index=0; index < array1Size; index++) {
			array1[index] = input.nextInt();
		}
		
		int array2Size =input.nextInt();
		int array2[] = new int[array2Size];
		for(int index=0; index < array2Size; index++) {
			array2[index] = input.nextInt();
		}
		
		ArrayList<Integer> list = findIntersection(array1, array2);
		
		for(int index=0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
		input.close();
	}
	
	
}
