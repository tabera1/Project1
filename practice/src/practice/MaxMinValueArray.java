package practice;

public class MaxMinValueArray {

	public static void main(String[] args) {
		int largeArray[] = {8,11,25,54,62,85,99,61,12,17,14,26,35,42};
		
		int smallest = largeArray[0];
		int largest = largeArray[0];
		
		for(int i=0; i<=13; i++) {
			if(largeArray[i] < smallest) smallest = largeArray[i];
			if(largeArray[i] > largest) largest = largeArray[i];	
		}
		System.out.println("The smallest numbrer is: " + smallest);
		System.out.println("The largest numbrer is: " + largest);
	}

}
