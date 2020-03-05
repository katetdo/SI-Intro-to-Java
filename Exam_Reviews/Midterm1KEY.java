package Exam_Reviews;
import java.util.Scanner;
public class Midterm1KEY {
	public static void main (String [] args) {
		/*  Set up of the exam
		 * 
		 *  1. Evaluate
		 *  		Arithmetic / Logic
		 *  2. Write Logic Expression
		 *  3. Run a full program
		 *  4. Write a full Program
		 * 
		 ///////////////////////////////////////
		 * int a = 10;
		 * int b = 5;
		 * double c = 2;
		 *
		 * What is the output, and the type of the output
		 *   a * b	= int 50
		 *   b * a / c = double 25.0
		 *   b * ((a + 6) / c) = double 40.0
		 *   b - c * a = double -15.0
		 *   double d = a / c = double 5.0
		 *   (d * a) + (b * c) = 50.0 + 10.0 = double 60
		 *   d * (a + b) * c = 5.0 * 15 * 2.0 = double 150
		 * NOTE:
		 *   Java reads top to bottom, left to right. It's actually fairly similar to the way we read,
		 *   and processes logic closely to the way we think as well
		 *   Arithmetic in Java in basically the same type of arithmetic we'd do in algebra 
		 *   the only thing we'd need to focus on is what the type is, and made sure it's attached 
		 *   to the variable with how it's used
		 *   
		 *   EXAMPLE:
		 *   a * b + c 
		 *   multiply a and b which makes int 50, then add c, which is a double, which makes the
		 *   whole answer a double, turning the answer into double 55
		 *   
		 *   
		 *
		 //////////////////////////////////////////////////////////////////////////
		 * int x = 10; 
		 * int y = 5; 
		 * double z = 2.5; 
		 * boolean t = true; 
		 * String str = "haha classic oatmeal";
		 * 
		 * NEED VALUE AND TYPE 
		 * EXAMPLE
		 * x >= y || t   boolean true
		 * 		10 >= 5 = true
		 *      true || true = true
		 *
		 * str.length();  int 20  
		 * 		Remember to include spaces in your count
		 *
		 * !(!t && (z*y)>x)  boolean true
		 * 		FIRST: z*y=11   11>10= TRUE 
		 * 		SECOND: !t = false
		 * 		THIRD: false && true = false
		 *  	FOURTH: !(false) = true
		 * 		
		 *
		 * str.charAt(1)  char 'a'
		 * 		Indicies start at 0, the length of the string is still 20 but 
		 * 		when looking at the string as individual cells, the first letter
		 * 		starts at zero and counts up as normal, meaning the last index 
		 * 		will be the length of the string - 1
		 *
		 * x+=y;  int 15
		 * 		x=x+y
		 *		x now equals 15
		 * 
		 * x*=2  int 30
		 * 		 x=x*2
		 * 		 x now equals 30
		 *
		 *CHALLENGE
		 * (x>y && y>z && t && str.length() == 20 && str.length < x) 
		 *    false, break it apart into its individual components and check what's true vs false
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
		//CODE YOU CAN PHYSICALLY RUN YOURSELF AND MESS WITH TO SEE THE ANSWERS
		int x = 10;
		int y = 5;
		double z = 2;

		System.out.println("The values of x, y, and z are: " + x + ", " + y + ", " + z + " respectively");

		if (x > y && x < z) {
			System.out.println("Case 1");
			x++;
		} else if (x > y && x > z) {
			System.out.println("Case 2");
			x *= y;
			if (x % z == 0) {
				System.out.println("Case 2.1");
			}
		} else {
			System.out.println("This one is correct");
		}

		y = 10;
		x /= y;
		z += x;
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
		
		Scanner stdIn = new Scanner (System.in);
		
		System.out.print("Please enter your age: ");
		int age = stdIn.nextInt();
		System.out.print("Please enter your name: ");
		String name = stdIn.nextLine();
		
		if (age<18) {
			System.out.println("Sorry " + name + ", too young");
		} else if (age>=18 && age<21) {
			System.out.println("Hey " + name + " you're an adult! But can't drink yet...");
		} else {
			System.out.println("Look forward to paying bills until you die " + name);
		} 

		//You could also use an else if statement instead of the else at the end
	
	}

}
