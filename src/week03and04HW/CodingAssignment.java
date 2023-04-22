package week03and04HW;

public class CodingAssignment {

	public static void main(String[] args) {

		//Question 1: Create an array of int called ages
//		that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93
			
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
	//Question 1-A: Programmatically subtract the value of the first element 
//		in the array from the value in the last element of the array 	
//		(i.e. do not use ages[7] in your code). Print the result to the console.  
			
		int result = ages[0] - ages[ages.length - 1];
			System.out.println(result);
		
	//Question 1-B: Add a new age to your array and repeat the step above to 
//		ensure it is dynamic (works for arrays of different lengths).
				//	ADD NEW NUMBER TO ORIGINAL ARRAY & RERUN CODE
		
	//Question 1-C: Use a loop to iterate through the array and calculate 
//		the average age. Print the result to the console.
		double sum = 0;
		
		for (int age : ages) {
			sum += age;
		}
		double average = sum / ages.length;
			System.out.println(average);
	 
	//Question 2: Create an array of String called names that contains the 
//		following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
			String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};


	//Question 2-A: Use a loop to iterate through the array and calculate the average 
//		number of letters per name. Print the result to the console.
		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		double average1 = sumOfLetters / names.length;
		System.out.println(average1);
				
	//Question 2-B: Use a loop to iterate through the array again and concatenate all 
//		the names together, separated by spaces, and print the result to the console.
		for (String name : names) {
			System.out.print(name + " ");
		}

	//Question 3: How do you access the last element of any array?	
		//	System.out.println(names.length - 1);	

		
	//Question 4: How do you access the first element of any array? 
		//	System.out.println(names[0]);


	//Question 5: Create a new array of int called nameLengths. 
//		Write a loop to iterate over the previously created names array and 
//		add the length of each name to the nameLengths array.
		
		int[] namesLength = new int[names.length];
			for (int i = 0; i < names.length; i++) {
				namesLength[i] += names[i].length();
			} 
					
			for (int nameLength : namesLength) {
				System.out.print(nameLength + " ");
			}
			System.out.println();
			
	//Question 6: Write a loop to iterate over the nameLengths array and 
//		calculate the sum of all the elements in the array. Print the result to the console.
			
		int sumOfLetters1 = 0;
			for (int name : namesLength) {
				sumOfLetters1 += name;
			}
				System.out.println(sumOfLetters1);

	//Question 7: Write a method that takes a String, word, and an int, n, as arguments and 
//		returns the word concatenated to itself n number of times. 
				String threeGreet = multiplyString("Yo", 3);
				System.out.println(threeGreet);		
					
					
	//Question 8: Write a method that takes two Strings, firstName and lastName, and 
//		returns a full name (the full name should be the first and 
//		the last name as a String separated by a space).
				String firstName = "Harry";
				String lastName = "Potter";
					System.out.println(fullName (firstName, lastName));
	 
	 
	//Question 9: Write a method that takes an array of int and 
//		returns true if the sum of all the ints in the array is greater than 100.
		
			int[] digits = {10, 20, 30, 40, 50};
			System.out.println(greater100(digits));
			
	//Question 10: Write a method that takes an array of double
//		and returns the average of all the elements in the array.
		
			double[] doubles = { 25.50, 30.75, 75.25 };
			System.out.println(calculateAverage(doubles));
		
	//Question 11: Write a method that takes two arrays of double and 
//		returns true if the average of the elements in the first array is 
//		greater than the average of the elements in the second array.
			
			double[] firstArray = {5, 10, 15, 20};
			double[] secondArray = {2, 4, 6, 8};
	    
			System.out.println(secondLess(firstArray, secondArray));

	/* Question 12: Write a method called willBuyDrink that takes a boolean isHotOutside, and 
	 * a double moneyInPocket, and returns true if it is hot outside and 
	 * if moneyInPocket is greater than 10.50.
	*/	
			
		System.out.println(willBuyDrink(true, 20.00));
		System.out.println(willBuyDrink(true, 5.00));
		

	//Question 13: Create a method of your own that solves a problem. 
//		In comments, write what the method does and why you created it.
	// Created a method that prints out name of espresso shots depending on value.

			int numShots = 10;
		System.out.println(shotsEspresso(numShots));
		
	}

	//METHODS:

	//Method for Question 7
				public static String multiplyString(String str, int num) {
					String result = "";
					for (int i = 0; i < num; i++) {
						result += str;
						}
					return result;
		}
				
	      
	 //Method for Question 8	
					public static String fullName(String firstName, String lastName) {
						return (firstName + " " + lastName);
	  }
	 
	 
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
	  
	  
	//Question 12
		
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
		if (isHotOutside && moneyInPocket > 10.50) {
				return true;
		} else {
				return false;
		}
	 } 
	  
	  
	//Question 13
	public static String shotsEspresso(int numShots) {
		String shots;
		
		switch (numShots) {
			case 1 : shots = "Single-shot";
				break;
			case 2 : shots = "Doppio, or double-shot";
				break;
			case 3 : shots = "Triplo";
				break;
			case 4 : shots = "Quad";
				break;
			case 5 : shots = "Five shots of espresso; you might want to ease up...";
				break;
			case 6 : shots = "Six shots of espresso; FDA recommended limit";
				break;
			default : shots = "You are either under-caffeinated or over-caffeinated.";
		}
			return shots;  
	  }
	
	}


