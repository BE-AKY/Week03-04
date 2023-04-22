package methodsB;

public class Question9_10_11 {

	public static void main(String[] args) {
//Question 9: Write a method that takes an array of int and 
//	returns true if the sum of all the ints in the array is greater than 100.
	
		int[] digits = {10, 20, 30, 40, 50};
		System.out.println(greater100(digits));
		
//Question 10: Write a method that takes an array of double
//	and returns the average of all the elements in the array.
	
		double[] doubles = { 25.50, 30.75, 75.25 };
		System.out.println(calculateAverage(doubles));
	
//Question 11: Write a method that takes two arrays of double and 
//	returns true if the average of the elements in the first array is 
//	greater than the average of the elements in the second array.
		
		double[] firstArray = {5, 10, 15, 20};
		double[] secondArray = {2, 4, 6, 8};
		System.out.println(secondLess(firstArray, secondArray));
	}	

//Methods:
	
//Question 9

	public static boolean greater100(int[] digits) {
		int sum = 0;
		for(int i : digits) {
			sum += i;
		}
		if (sum > 100)
			return true;
	
			return false;
	}
		
//Question 10
	public static double calculateAverage(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		return sum / array.length;
	}
		
//Question 11
	public static boolean secondLess(double [] firstArray, double[] secondArray) {
		double sum1 = 0;
		double sum2 = 0;
	for (int i = 0; i < firstArray.length; i++) {
			sum1 += firstArray[i];
		}	
	double avg1 = sum1 / firstArray.length;
	
	for (int j = 0; j < firstArray.length; j++) {
		sum2 += secondArray[j];
	}
	double avg2 = sum2 / secondArray.length;
	
	if (avg1 > avg2) {
		return true;
	} else {
		return false;
		}
	}
}
