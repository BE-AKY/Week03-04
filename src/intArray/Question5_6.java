package intArray;

public class Question5_6 {

	public static void main(String[] args) {

//FROM: Question 2
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};


//Question 5: Create a new array of int called nameLengths. 
//	Write a loop to iterate over the previously created names array and 
//	add the length of each name to the nameLengths array.
	
	int[] namesLength = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			namesLength[i] += names[i].length();
		} 
		
		
		for (int nameLength : namesLength) {
			System.out.print(nameLength + " ");
		}
		System.out.println();
		
//Question 6: Write a loop to iterate over the nameLengths array and 
//	calculate the sum of all the elements in the array. Print the result to the console.
		
	int sumOfLetters = 0;
		for (int name : namesLength) {
			sumOfLetters += name;
		}
			System.out.println(sumOfLetters);
		

	}
}
