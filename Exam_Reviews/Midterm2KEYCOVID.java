package Exam_Reviews;
import java.util.Scanner;

public class Midterm2KEYCOVID {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		/*
		 * Exam rn
		 *  NO RUNNING CODE ON THE EXAM
		 *  Mostly be short answer/small coding bits
		 *  maybe some technical questions?
		 *  
		 * 
		 */
		//////////////////////////////////////////////////////////////////////////
		 //Method calls

		  //Math and String

		 //Run Program (Program 4 and 5)

		  //String processing

		 //Run Code (Quiz 6 and 6b / Lab 8)

		  //Nested loops

		 //Write Program (Program 6 and 6b / Lab 8)

		  //Dice game
		
		 ////////////////////////////////////////////////////////////////////////

		 //Creating different loops

		 //What are the different loops?
		 // for, while, do while

		 //When do we use each loop?
		 /*
		  * do while: want to do something AT LEAST once
		  * for: within a set boundary to loop through
		  * while: universal, can do both do and for 
		  */

		 //What is the main structure of each loop: what do they all have in common
		 // for(variable; condition; incrementation/decrementation)
		 //      where we start, when do we end, how are we changing so that 
		 //											we get to the end
		
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
		 //Exit the loop only when the boolean entered is false

		 //Exit the loop only when the length of the string entered is larger than 5 characters
		 
		 String name;
		 do { 
			 System.out.println("enter the string:"); 
			 name = stdIn.nextLine(); 
		 } while (name.length() <=5); //if true loop back, if false exit
		 
		 
		 
		 
		 //Create a loop that prints out numbers 0-3 backwards i.e. 3210
		for (x = 3; x >= 0; x--) {
			System.out.println(x);
		}
		int num = 3;
		do {
			System.out.print(num);
			num--;
		} while (num >= 0 && num <= 3);
		 

		 //////////////////////////////////////////////////////////////////////////
		 
		 /////////////////////////////////////////////////////////////////////////
		 /*
		  * PLEASE NOTE: THIS SECTION IS FROM MY LAST MIDTERM REVIEW, DUE TO
		  * THE CHANGING OF SCHEDULE THE BELOW PART MIGHT BE CONFUSING
		  * YOU DON'T NEED TO STRESS OUT ABOUT IT TOO MUCH AS BOB WILL BE
		  * LENIENT ABOUT THIS INFORMATION 
		  * BUT DO BE SURE TO UNDERSTAND HOW TO USE THEM PROPERLY
		  * 
		  */

		 //Method Calls (Math, String)
			/*
			 * String methods also called function
			 * .length() .charAt()
			 * String name = "Kate";
			 * name.length(); // return 4
			 * int nameLength = name.length();
			 *   -nameLength=4
			 * name.charAt(0); //'K' 
			 */
		

		 //Library Classes (Math)
		 //Static vs non-static 

		 //ALL MATH METHODS ARE STATIC AND MUST USE THE CLASS TO CALL
		 // use Math. for math functions
		 // use String's <variable name>. for String functions
		
		 // format of what is below
		 //	what it's returning/what is the answer; function name ; (what it needs)
		 // int max(int x, int y)
		int a = 3;
		int b = 6;
		int min = Math.max(a, b);
		System.out.println(min);
		System.out.println("\n\n\n\n\n\n");
		
		 //public static int abs(int num)
		 //public static double abs(double num)
		 //public static double max(double x, double y)
		 //public static int min(int x, int y)
		 //public static double min(double x, double y)
		 //public static double pow(double num, double power)
		   //--> Math.pow (2, .5) for square roots
		 //public static double random()
			int number = (int)(Math.random());
		 //public static long round (double num)

		 //ALL STRING METHODS ARE NON-STATIC AND DON'T NEED THE CLASS TO CALL

		 //public int indexOf (int ch)
		 //public int indexOf (int ch, int fromIndex)
		 //public char charAt(int index)
		 //public String substring(int start)
		 //public String substring (int start, int end)
			String name1 = "Welcome"; //start at an index of 0 but length starts at 1
			char first = name1.charAt(0); //return 'W'
			int firstE = name1.indexOf("e"); //return 1
			int secondE = name1.indexOf("e", firstE +1);
			
		 
		 //if it's static, call it with the name of the class

		 //things that aren't static are like the String class

		 //Wrapper classes for int, char, and double if you want to use them on the exam

		   //nothing from double or integer
		   // Integer
		String binary = "100111";
		int binar = Integer.parseInt(binary, 2);

		System.out.println(binar);

		 //charAt, length, equals, equalsIgnoreCase,

		  //substring--> beginning index, beginning and end
			/*
			 * The way substring works
			 * String substring(int start) 
			 * 		//start at that index and then go to the end/goes to string.length-1
			 * String substring(int start, int end) 
			 * 		//start at that index, then goes to end index-1
			 */
				//   0123456789
		String s = "hello my name is";
		 System.out.println("hello, substring starting at index 3 is " + s.substring(3));

		 System.out.println("hello, substring between 0 and 3 is " + s.substring(0,16));

		 

		 //indexOf returns -1 when the search fails

		 //String s = "hello my name is";
		 System.out.println("The index of b is " + s.indexOf("b"));

		 System.out.println("The index of m starting at index 12 is " + s.indexOf("m", 12));

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
