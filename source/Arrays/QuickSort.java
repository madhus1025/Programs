package Arrays;

import java.util.Scanner;

/**
 * Given an array , arrange the elements in ascending order (Sorting)
 * @author Madhu Avinash
 *
 */

public class QuickSort {
	
	public static int quickSort(int array[], int low, int high) {
		
		int pivot = low;
		
		while(low < high) {
			while(array[low] > array[pivot] && low < high) {
				low++;
			}
			while(array[high] > array[pivot] && low < high) {
				high--;
			}
			if(low < high) {
				int temp = array[high];
				array[high]=array[low];
				array[low] = temp;
			}
		}
		int temp = array[high];
		array[high] = array[pivot];
		array[pivot] = temp;
		return high;
	}
	
	public static void partition(int array[], int low, int high) {
		if(low >= high)
			return;
		int pi = quickSort(array,low,high);
		partition(array,low,pi-1);
		partition(array,pi+1, high);
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int array[] = new int[size];
		
		for(int index=0; index < array.length; index++) {
			array[index] = input.nextInt();
		}
		
		partition(array,0,array.length-1);
		
		for(int index=0; index < array.length; index++) {
			System.out.println(array[index]);
		}
		input.close();
	}
}
