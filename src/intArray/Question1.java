package intArray;

public class Question1 {

	
	public static void main(String[] args) {
	
//Question 1: Create an array of int called ages
//	that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93
		
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 50};
	
//Question 1-A: Programmatically subtract the value of the first element 
//	in the array from the value in the last element of the array 	
//	(i.e. do not use ages[7] in your code). Print the result to the console.  
		
	int result = ages[0] - ages[ages.length - 1];
		System.out.println(result);
	
//Question 1-B: Add a new age to your array and repeat the step above to 
//	ensure it is dynamic (works for arrays of different lengths).
			//	ADD NEW NUMBER TO ORIGINAL ARRAY & RERUN CODE
	
//Question 1-C: Use a loop to iterate through the array and calculate 
//	the average age. Print the result to the console.
	double sum = 0;
	
	for (int age : ages) {
		sum += age;
	}
	double average = sum / ages.length;
		System.out.println(average);
}
}