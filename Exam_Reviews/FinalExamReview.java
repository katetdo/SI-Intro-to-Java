package Exam_Reviews;

public class FinalExamReview {
	
	
	/* Small notes: 
	 * Lab 9--> 11 
	 * Quiz 9--> 10 
	 * Programs 8--> 10 
	 * Practive Problems 7-10
	 * Demos methods up
	 * 
	 * Vocabulary 
	 * -------------- 
	 * Parameter vs Argument 
	 * - Parameter: What is taken into the method, type and name 
	 * - Argument: The thing you are sending to the method, just the name
	 * 
	 * Heading vs Definition
	 * - Heading: First line, public static <return type> <method name> (<parameters>)
	 * - Definition means whole thing, heading included and the inside 
	 * 
	 * 1. Write method headings 
	 * 2. Run Code (Search/Sort/**Array**) 
	 * 3. Run Program (Multiple simple methods) 
	 * 4. Write Method Definition ( Array manipulation) 
	 * 5. Write Program (Dice/Card Games)
	 * 
	 * FOCUS ON PRACTICE PROBLEMS AND PREVIOUS HOMEWORKS
	 */

	/* Writing method Headings
	 * 
	 * DO NOT WRITE THE METHOD, JUST THE HEADINGS
	 * 
	 * for a method named average that takes in any two numbers as input and returns
	 * their average
	 * 
	 * for a method named reverse that takes in a string input and returns a new
	 * string that is the input String in reverse order
	 * 
	 * for a method named sort that takes in a double array, and eSize then sorts the array 
	 * from largest to smallest number then returns nothing
	 */

	// Tracing a program

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		int z = function1(y, x);
		boolean answer = function2(x);
		print(z, answer);
		main();
	}

	public static int function1(int a, int b) {
		for (int i = 0; i < b; i++) {
			++a;
		}
		for (int i = 0; i < a; i++) {
			b += i;
		}
		if (a > b) {
			return a;
		}
		return b;
	}

	public static boolean function2(int c) {
		if (c > 10) {
			return true;
		}
		return false;
	}

	public static void print(int c, boolean answer) {
		if (answer) {
			System.out.println("You did it!");
		}
		System.out.println("Good Job :)");
	}

	// Array Focused

	/*
	 * Write a method that takes in an int array and effective size (eSize) and
	 * returns the total sum of the the array
	 */
	
	 //Tracing code with array usage
	 
	public static void main() {
		String[] names = { "Molly", "Bellatrix", "Hermione", "Dobby" };
		int eSize = 3;
		printNames(names, eSize);
		sortNames(names, eSize);
		names = reverseNames(names, eSize);
		System.out.println();
		printNames(names, eSize);
	}
	public static void printNames(String[] names, int eSize) {
		for (int i = 0; i < eSize; i++) {
			System.out.print(names[i] + ", ");
		}
	}
	public static String[] reverseNames(String[] names, int eSize) {
		String[] reversed = new String[eSize];
		int k = 0;
		for (int i = eSize; i > 0; i--) {
			reversed[k] = names[i];
			k++;
		}
		return reversed;
	}
	public static void sortNames(String[] names, int eSize) {
		for (int i = 0; i < eSize; i++) {
			int minLoc = i;
			for (int k = i; k < eSize; k++) {
				if (names[minLoc].charAt(0) < names[k].charAt(0)) {
					minLoc = k;

				}
			}
			String temp = names[i];
			names[i] = names[minLoc];
			names[minLoc] = temp;
		}
	}

	/*
	 * Write a program that takes in any 5 integer 
	 *     values from the users and stores them into an array
	 * 
	 * Then in a method take in the array and return the sum
	 * 
	 * Then in another method take in the array and sum and 
	 *     return the average
	 * 
	 * In the last method take in the array, sum, and average
	 *     and print them out, no return
	 */

}
