package Exam_Reviews;
import java.util.Scanner;

public class Midterm2ExamReview {
	

	public static void main (String [] args){

	 Scanner stdIn = new Scanner (System.in);

	 

	 ////////////////////////////////////////////////////////////////////////

	 //Creating different loops

	 //What are the different loops?

	 //When do we use each loop?

	 //What is the main structure of each loop: what do they all have in common

	 

	 ////////////////////////////////////////////////////////////////////////

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


	 //////////////////////////////////////////////////////////////////////////

	 //Creating conditional loops FOR

	 //EXAMPLE

	 //Create a loop that prints out numbers 0-3

	 System.out.println();

	 System.out.println("Print out numbers 0-3");

	 for (int i = 0; i<4; i++){

	  System.out.print(i);

	 }

	 System.out.println();

	 

	 //Create a loop that sums up the numbers from 5 - 10

	 

	 //Create a loop that sums up the odd numbers from 0-10

	 

	 //Create a loop that prints out number 0-3 backwards i.e. 3210

	 

	 //////////////////////////////////////////////////////////////////////////

	 //Creating nested loops

	 //EXAMPLE

	 //Print this pattern for any n

	 /*

	  * 1

	  * 12

	  * 123

	  */

	 System.out.println();

	 System.out.println("\nNested Loop: Please enter a number");

	 int n = stdIn.nextInt();

	 for (int i = 1; i <= n; i++){

	  for (int j = 1; j<=i; j++){

	   System.out.print(j);

	  }

	  System.out.println();

	 }

	 

	 // DICE

	 System.out.println();

	 int d1 = (int)(Math.random()*4)+1;

	 System.out.println("Printing out a random number 0-4: " + d1);

	 System.out.println();

	 /////////////////////////////////////////////////////////////////////////

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

	 

	 //Method calls

	  //Math and String

	 //Run Program (Program 4 and 5)

	  //String processing

	 //Run Code (Quiz 6 and 7 / Lab 8)

	  //Nested loops

	 //Write Program (Program 6 and 7 / Lab 8)

	  //Dice game


	  d1 = (int)(Math.random()*4) + 1;

	  int d2 = (int)(Math.random()*4) + 1;

	  int d3 = (int)(Math.random()*4) + 1;

	  int big = Math.max(Math.max(d1, d2), d3);

	  int small = Math.min(Math.min(d1, d2), d3);

	  int m = (d1+d2+d3) - (big+small);

	  ///////////////////////////////////////////////////////////////////////

	  //Running a Program

	  System.out.println("Running a program with nested loops");

	  int a = 0;
	  int b = 2;
	  int c = 5;
	  
	  for(int i=0; i< b; i++){
	   a++;
	  }
	  for (int i=0; i<c; i++){
		  for (int j = i ; j<b; j++){
			  System.out.print(j);
			  b++;
		  }
	   System.out.println();
	  }

	  ///////////////////////////////////////////////////////////////////////////

	  System.out.println("Running a program with String Processing ");

	  String str = "Hello World";

	  System.out.println(str.substring(4));

	  System.out.println(str.substring(1, 6));

	  System.out.println(str.indexOf("d"));

	}
}
