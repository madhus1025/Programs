package Arrays;

/*
 * Remove duplicates from a given array
 * Input : 1 2 2 3
 * Output : 1 2 3
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import java.util.Iterator;

public class RemoveDuplicates {

	/**
	 * Insert all the elements into hashset, since hashset will not encourage duplicates, at the end we will be left with unique elements
	 * @param array is the input array
	 * @return
	 */
	public static int[] removeDuplicates(int array[]){
		
		HashSet<Integer> resultSet = new HashSet<Integer>();
		
		for(int index=0; index < array.length; index++) {
			resultSet.add(array[index]);
		}
		
		Iterator<Integer> iterator = resultSet.iterator();
		int index=0;
		array = new int[resultSet.size()];
		while(iterator.hasNext()) {
			array[index] = iterator.next();
			index++;
		}
		
		return array;
	}
	
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int array[] = new int[size];
		
		for(int index=0; index < size; index++) {
			array[index] = input.nextInt();
		}
		
		int duplicates[] = removeDuplicates(array);
		
		for(int index=0; index < duplicates.length; index++) {
			System.out.println(duplicates[index]);
		}
		
		input.close();
	}
}
