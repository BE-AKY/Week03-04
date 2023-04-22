package methodsA;

public class Question7_8 {

	public static void main(String[] args) {

//Question 7: Write a method that takes a String, word, and an int, n, as arguments and 
//	returns the word concatenated to itself n number of times. 
			String threeGreet = multiplyString("Yo", 3);
			System.out.println(threeGreet);		
				
				
//Question 8: Write a method that takes two Strings, firstName and lastName, and 
//	returns a full name (the full name should be the first and 
//	the last name as a String separated by a space).
			String firstName = "Harry";
			String lastName = "Potter";
				System.out.println(fullName (firstName, lastName));
	}

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
}
