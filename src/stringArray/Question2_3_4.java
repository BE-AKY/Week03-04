package stringArray;

public class Question2_3_4 {

	public static void main(String[] args) {

//Question 2: Create an array of String called names that contains the 
//	following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
	
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};


//Question 2-A: Use a loop to iterate through the array and calculate the average 
//	number of letters per name. Print the result to the console.
	int sumOfLetters = 0;
	for (String name : names) {
		sumOfLetters += name.length();
	}
	double average = sumOfLetters / names.length;
	System.out.println(average);
			
//Question 2-B: Use a loop to iterate through the array again and concatenate all 
//	the names together, separated by spaces, and print the result to the console.
	for (String name : names) {
		System.out.print(name + " ");
	}

//Question 3: How do you access the last element of any array?	
	//	System.out.println(names.length - 1);	

	
//Question 4: How do you access the first element of any array? 
	//	System.out.println(names[0]);
	
	}
	
}	
