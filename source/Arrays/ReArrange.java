package Arrays;

import java.util.Scanner;
/**
 * 
 * @author S Madhu Avinash
 * Given an array, rearrange the numbers in alternating positive and negative items
 * Array : 1 2 3 -4 -5 -6
 * Output : 1 -4 2 -5 3 6
 *
 */
public class ReArrange {

	public static void arrangeAlternate(int array[]) {
		
		int flag= array[0] > 0?1:-1;
		for(int index=1; index < array.length; index++) {
			
			if(flag * array[index] > 0) {			
				int index1=index+1;
				boolean change=false;
				while(index1 < array.length) {
					if(flag * array[index1] < 0) {
						int temp = array[index];
						array[index] = array[index1];
						array[index1] = temp;
						change=true;
						break;
					}
					index1++;
				}
				if(!change)
					break;					
			}
			flag*=-1;
		}
		for(int index=0; index < array.length; index++) {
			System.out.println(array[index]);
		}
	}
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		
		int array[] = new int[size];
		
		for(int index=0; index < size; index++) {
			array[index] = input.nextInt();
		}
		
		arrangeAlternate(array);
	}

}
