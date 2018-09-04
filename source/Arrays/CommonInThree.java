package Arrays;
/**
 * Given 3 arrays find the common elements in all the arrays
 * Input {1,2,3}
 * 		 {1,3,5}
 * 		 {1,2,4}
 * 
 * Output : {1}	
 */

import java.util.*;

public class CommonInThree {
	 
	
	private static int currentIndex=0;
	
	/**
	 * Logic: Here we maintain a static variable called currentIndex which starts
	 * with 0, since all 3 arrays are sorted if in call 1 we get x and in call 2
	 * we get y, y > x all the time, so from the place where we stopped searching
	 * for previous element we can begin from there
	 * @param element is the common element in first 2 arrays, which we need to 
	 * check here
	 * @param array this is the third array
	 * @return whether the element exists or not
	 */
	public static boolean isArrayContainsElement(int element, int array[]) {
		
		for(int index=currentIndex; index < array.length; index++) {
			if(array[index] ==  element) {
				currentIndex = index;
				return true;
			}
			if(array[index] > element){
				return false;
			}
		}
		currentIndex=-1;
		return false;
	}
	
	/**
	 * This method is explained in the Intesections class, refer that for more
	 * details, Here we call the intersection method with 3 arrays but operate
	 * ont 2 only, once we find the common element between 2 arrays, we search
	 * the same in the third array, if it exists we make it common else go to
	 * next
	 * @param array1
	 * @param array2
	 * @return Common elements between the given two arrays.
	 */
	public static ArrayList<Integer> findIntersection(int array1[], int array2[],int array3[]) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int array1Index=0;
		int array2Index=0;
		
		while(array1Index < array1.length && array2Index < array2.length) {
			if(currentIndex==-1) {
				break;
			}
			if(array1[array1Index] == array2[array2Index]) {
				if(isArrayContainsElement(array1[array1Index],array3))
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
	
	/**
	 * This is a util function to read three arrays
	 * @param size size of the array
	 * @param input scanner object
	 * @return it returns the newly created array
	 */
	public static int[] readArray(int size, Scanner input) {
		int array[] = new int[size];
		for(int index=0; index < size; index++) {
			array[index] = input.nextInt();
		}
		return array;
	}
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		int array1Size = input.nextInt();
		int array1[] = readArray(array1Size,input);	
		int array2[]  = readArray(input.nextInt(),input);
		int array3[] = readArray(input.nextInt(),input);
		
		ArrayList<Integer> list = findIntersection(array1,array2,array3);
		
		for(int index=0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
	}
}
