package Arrays;

import java.util.Scanner;

/**
 * Given an array and K, find the Kth Smallest Element in an array
 * Input : K = 4   Array = {10,9,8,7,6,5,4}
 * Output : 7
 * 
 * Work on Quick Sort before getting here
 * 
 * @author Madhu Avinash
 *
 */

public class KthSmallestElement {

	/**
	 *  
	 * @param array
	 * @param low is the starting index
	 * @param high is the ending index
	 * @return we return the exact position of a certain element, of whose all right
	 * side elements are greater and left are smaller but not in a ordered way
	 */
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
	
	
	/**
	 * Logic: Using the quick sort technique we don't work on every partition, we 
	 * work on only those for which k falls in the middle of that.
	 * @param array
	 * @param low
	 * @param high
	 * @param k
	 * @return
	 */
	public static int partition(int array[], int low, int high, int k) {
		if(low >= high || low > k)
			return 0;
		int pi = quickSort(array,low,high);
		if(pi == k)
			return array[pi];
		if(k > pi) {
			return partition(array,pi+1,high,k);
		}
		else {
			return partition(array,low,pi-1,k);
		}
	}
	
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int array[] = new int[size];
		
		for(int index=0; index < array.length; index++) {
			array[index] = input.nextInt();
		}
		
		int k = input.nextInt();
		System.out.println(partition(array,0,array.length-1,k-1));
	}
}
