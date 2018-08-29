package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {

	public static ArrayList<Integer> removeDuplicates(int array[]){
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		
		
		return result;
	}
	
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int array[] = new int[size];
		
		for(int index=0; index < size; index++) {
			array[index] = input.nextInt();
		}
		
		ArrayList<Integer> duplicates = removeDuplicates(array);
		
		for(int index=0; index < duplicates.size(); index++) {
			System.out.println(duplicates.get(index));
		}
		
		input.close();
	}
}
