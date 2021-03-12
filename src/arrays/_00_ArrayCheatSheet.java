package arrays;

import java.util.*;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] array = {"Who","What","Where","When","Why"};
		//2. print the third element in the array
		System.out.println(array[3]);
		//3. set the third element to a different value
		array[3] = "How";
		//4. print the third element again
		System.out.println(array[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
		}
		//6. make an array of 50 integers
		int [] number = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i = 0; i < number.length; i++) {
			Random ran = new Random();
			number [i] = ran.nextInt();
		}
		//8. without printing the entire array, print only the smallest number in the array
		int small = number[0];
		for(int i = 0; i < number.length; i++) {
			if(number [i] < small) {
				small = number [i];

			}
			
			
		}
		System.out.println(small);
		//9 print the entire array to see if step 8 was correct
		for(int i = 0; i < number.length; i++) {
		System.out.println(number[i]);
		}
		int big = number[0];
		//10. print the largest number in the array.
		for(int i = 0; i < number.length; i++) {
			if(number[i] < big) {
				big = number[i];
			}
		}
		System.out.println(big);
	}
}
