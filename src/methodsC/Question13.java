package methodsC;

public class Question13 {

	public static void main(String[] args) {
//Question 13: Create a method of your own that solves a problem. 
//	In comments, write what the method does and why you created it.

	int numShots = 10;
	
	System.out.println(shotsEspresso(numShots));
	
	}
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