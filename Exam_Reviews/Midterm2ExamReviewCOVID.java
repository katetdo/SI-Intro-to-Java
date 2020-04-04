package Exam_Reviews;
import java.util.Scanner;

public class Midterm2ExamReviewCOVID {
	
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		//////////////////////////////////////////////////////////////////////////
		 //Method calls

		  //Math and String

		 //Run Program (Program 4 and 5)

		  //String processing

		 //Run Code (Quiz 6 and 7 / Lab 8)

		  //Nested loops

		 //Write Program (Program 6 and 7 / Lab 8)

		  //Dice game
		
		 ////////////////////////////////////////////////////////////////////////

		 //Creating different loops

		 //What are the different loops?

		 //When do we use each loop?

		 //What is the main structure of each loop: what do they all have in common
		
		//////////////////////////////////////////////////////////////////////////
		
		
		
		/////////////////////////////////////////////////////////////////////////

		 //Creating conditions loops DO WHILE

		 //EXAMPLE

		 //Exit the loop only when the user enters a 1 or 2

		 System.out.println("User Validation");

		 int x;

		 do {

		  System.out.print("Please enter 1 or 2: ");

		  x= stdIn.nextInt();

		 } while (!(x==1 || x==2));

		 System.out.println();

		 //Exit the loop only when the user enters a 0, 1, 2, or 3

		 //Exit the loop only when the String entered is larger than 5 characters

		 //Exit the loop only when the boolean entered is false
		 
		//Create a loop that prints out number 0-3 backwards i.e. 3210

		 //////////////////////////////////////////////////////////////////////////
		 
		 /////////////////////////////////////////////////////////////////////////
		 /*
		  * PLEASE NOTE: THIS SECTION IS FROM MY LAST MIDTERM REVIEW, DUE TO
		  * THE CHANGING OF SCHEDULE THE BELOW PART MIGHT BE CONFUSING
		  * YOU DON'T NEED TO STRESS OUT ABOUT IT TOO MUCH AS BOB WILL BE
		  * LENIENT ABOUT THIS INFORMATION AND MIGHT NOT EVEN PUT IT ON THE TEST
		  * I'M KEEPING IT ON THIS REVIEW DOCUMENT BECAUSE YOU MIGHT WANT TO 
		  * PURSUE UNDERSTANDING IT ON YOUR OWN TIME AND WILL ONLY GO OVER IT
		  * BRIEFLY DURING THE ACTUAL LIVE REVIEW TIME
		  * 
		  */

		 //Method Calls (Math, String)

		 //Library Classes (Math)

		 //Static vs non-static 

		 //DON'T NEED TO MEMORIZE, WILL BE GIVEN MUST USE THESE FOR FIRST QUESTION

		 //ALL MATH METHODS ARE STATIC AND MUST USE THE CLASS TO CALL

		 //public static int abs(int num)
		 //public static double abs(double num)
		 //public static int max(int x, int y)
		 //public static double max(double x, double y)
		 //public static int min(int x, int y)
		 //public static double min(double x, double y)
		 //public static double pow(double num, double power)
		   //--> Math.pow (2, .5) for square roots
		 //public static double random()
		 //public static long round (double num)

		 //ALL STRING METHODS ARE NON-STATIC AND DON'T NEED THE CLASS TO CALL

		 //public int indexOf (int ch)

		 //public int indexOf (int ch, int fromIndex)

		 //public int indexOf (String str)

		 //public int indexOf (String str, int fromIndex)


		 //if it's static, call it with the name of the class

		 //things that aren't static are like the String class

		 //Wrapper classes for int, char, and double if you want to use them on the exam

		   //nothing from double or integer

		 //charAt, length, equals, equalsIgnoreCase,

		  //substring--> beginning index, beginning and end

		 String s = "hello my name is";

		 System.out.println("hello, substring starting at index 3 is " + s.substring(3));

		 System.out.println("hello, substring between 0 and 3 is " + s.substring(2,6));

		 

		 //indexOf returns -1 when the search fails

		 System.out.println("The index of b is " + s.indexOf("b"));

		 System.out.println("The index of l starting at index 2 is " + s.indexOf("l", 2));  

		 

		 //EVERYTHING WILL BE DOABLE IN ONE CALL
		
		/*
		 * Create 3 variable named d1, d2, and d3
		 * d1 will be a random integer number between 0-10
		 * d2 will be a random integer number between 5-9
		 * d3 will be a random double number between 1-5
		 */
		
		//Write a java loop that will add up all the even numbers from 0-20 
		//into a int variable named sum
		//Do this in a for
		//Do this in a while
		//Do this in a do while
		
		
		//Create this figure
		/*
		 * 3
		 * 32
		 * 321
		 */
		
		/*
		 * Guess my number game!
		 * Create a variable named answer that randomly chooses a number 1-100
		 * 
		 * Using a do while (think about what your exit condition should be after the steps below)
		 * Ask the user to "guess" the answer: Take in the user's number 
		 * Compare the user input and answer
		 * Create statements that will print out "too high" "too low" and "just right" 
		 * 		as appropriate
		 * 
		 */
		
		/* CHALLENGING
		 * 1. Create 3 variables named n1, n2, and n3 that generate random numbers 1-6
		 * 2. Place those in a while loop
		 * 3. If any of those variables = 6, print out the which variable it is
		 * 4. Add the numbers up into a variable named sum
		 * 5. Stop the while loop once you've printed out 6, five times or sum is over 30
		 */
		
	}
}
