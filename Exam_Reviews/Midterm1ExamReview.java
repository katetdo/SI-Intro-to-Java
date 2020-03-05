package Exam_Reviews;
import java.util.Scanner;

public class Midterm1ExamReview {
	public static void main(String[] args) {
		/*  Set up of the exam
		 * 
		 *  1. Evaluate
		 *  		Arithmetic / Logic
		 *  2. Write Logic Expression
		 *  3. Run a full program
		 *  4. Write a full Program
		 * 
		 * 
		 ///////////////////////////////////////
		 * int a = 10; 
		 * int b = 5; 
		 * double c = 2;
		 *
		 * What is the output, and the type of the output 
		 * a * b = int 50
		 * b * a / c = double 25.0
		 * b * (a /c) = double 25.0 
		 * b + c * a = double 25.0
		 * double d = a / c double 5
		 * (d * a) + (b * c) = double 60
		 * d * (a + b) * c = double 150
		 *
		 //////////////////////////////////////////////////////////////////////////
		 * int x = 10; 
		 * int y = 5; 
		 * double z = 2.5; 
		 * boolean t = true; 
		 * String str = "haha classic oatmeal";
		 *  			 0123456789
		 * 
		 * NEED VALUE AND TYPE 
		 * EXAMPLE
		 * x >= y || t    boolean true
		 *
		 * str.length(); int 20
		 *
		 * !(!t && (z*y)>x) boolean true 
		 * 
		 * !(t && (z*y)>x) boolean false
		 *
		 * str.charAt(1)  char a 
		 *
		 * x+=y;  int 15
		 * x = x + y //x=15
		 * x + y //15
		 * 
		 * x*=2 int 30 //because x now stores 15
		 * x = x * 2
		 * 
		 *
		 * CHALLENGE
		 * (x>y && y>z && t && str.length() == 20 && str.length > x)
		 *
		 ///////////////////////////////////////////////////////////////////////////
		 *
		 * System.out.println("Write logic expressions that evaluate to true when: ");
		 * 
		 * System.out.println("The variable num is equal to 2 or greater than 10");
		 * 		if(num == 2 || num > 10)
		 * 
		 * System.out.println("The variable hello is greater than 0 but less than 100");
		 * 		if(hello>0 && hello<100)
		 * 
		 * System.out.println("The length of a string "name" is longer than 13 characters");
		 * 		if(name.length()>13)
		 * 
		 * System.out.println("The character in a string "name" at index 0 is equal to a");
		 * 		if(name.charAt(0)=='a')
		 * 
		 * System.out.println("The int variable age is < 18);
		 * 		age<18
		 * 
		 */
		int x = 10;
		int y = 5;
		double z = 2;

		System.out.println("The values of x, y, and z are: " + x + ", " + y + ", " + z + " respectively");

		if (x > y && x < z) {
			System.out.println("Case 1");
			x++;
		} else if (x > y && x > z) {
			System.out.println("Case 2");
			x *= y; //50
			if (x % z == 0) {
				System.out.println("Case 2.1");
			}
		} else {
			System.out.println("This one is correct");
		}
	
		y = 10; 
		x /= y; //x = 5
		z += x; //z = 7.0
 		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);

		if (!(x > y && x < z)) {
			System.out.println("Case 3");
		} else if (x < y || x > z) {
			System.out.println("Case 4");
		}

		
		/*
		 * x + y 
		 * x + = y
		 * x = x + y 
		 * String s = "Kate";
		 * String n = "Kate";
		 *  s.equals("kate");  boolean false CASE SENSITIVE
		 *  s.equals("Kate");  boolean true
		 *  s == n  would be wrong and throw a fit
		 *  s.equals(n); boolean true
		 *   
		 */
		////////////////////////////////////////////////////////////
		/*
		 * Write a program that takes in a person's name and age if they are under the
		 * age of 18 print out "Sorry <name>, too young" if they are between the ages of
		 * 18 (inclusive) and 21 (excluded)--> [18,21) print out
		 * "Hey <name> you're an adult! But can't drink yet..." if they are 21 or older
		 * print out "Look forward to paying bills until you die <name>"
		 * 
		 * SAMPLE RUN 
		 * ----------------------- 
		 * Please enter your age: 19 
		 * Please enter your name: Kate
		 * 
		 * Hey Kate you're an adult! But can't drink yet... 
		 * ------------------------
		 * Please enter your age: 10 
		 * Please enter your name: Amy
		 * 
		 * Sorry Amy, too young 
		 * ------------------------ 
		 * Please enter your age: 33
		 * Please enter your name: Josh
		 * 
		 * Look forward to paying bills until you die Josh
		 */

		
		// Personal Notes I've taken because of smaller more complicated questions
		/*System.out.println("If someone else asks about why we need to use .equals vs ==");

		String s = "Hello";
		String s1 = "Hello";

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String s2 = in.nextLine();

		if (s1 == "Hello") {
			System.out.println("Version 1");
		}
		if (s1.equals("Hello")) {
			System.out.println("Version 2");
		}

		if (s1 == s2) {
			System.out.println("Version 3");
			if (s1.equals(s)) {
				System.out.println("Version 4");
			}
		}

		if (s1.equals(s2)) {
			System.out.println("Version 5");
			if (s1 == s) {
				System.out.println("Version 6");
			}
		}
		// System.out.println("incrementing before and after logic");
				/*
				 * int x = 5; //x = 5 bc of initialization
				 * System.out.println("This is x initially: " + x);
				 * 
				 * //POST-increment it does x=5 * x=5 = 25
				 * System.out.println("This is x * x++ = " + x * x++);
				 * 
				 * //After previous line is completed THEN x increments x=6
				 * System.out.println("This is x after the previous line's increment: " + x);
				 * 
				 * //PRE-increment x=6 * (++x=7) = 42 System.out.println("This is x * ++x = " +
				 * x * ++x);
				 * 
				 * //End value of x =7 System.out.println("This is x at the very end: " + x);
				 * String w = "Hi"; char c= 'a'; System.out.print(w += c);
				 * 
				 * 
				 */
		
	}
}
