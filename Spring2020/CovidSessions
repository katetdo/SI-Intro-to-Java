public static void main(String[] args) {
		/*
		 * Hello! PLEASE NOTE: I still need you guys to sign in on the sheet but because
		 * that's impossible I'm just going to ask that you leave your name and email in
		 * the chat so that I can do it manually later please and thank you! **please
		 * send it through private chat with me eve if you've shown up for a previous session
		 */

		Scanner std = new Scanner(System.in);

		// MONDAY
		// Math.random
		String s = "hello"; // length .charAt
		// s.length or s.charAt(0)

		char p = 'p';
		boolean answer = true;

		double rand = Math.random(); // output: some decimal number between 0-1
		double rand1 = Math.random() * 6; // output: some decimal number between 0-6

		int rand2 = (int) (Math.random() * 6); // output: some decimal between 0-6 and then
												// turned into a integer number
		int rand3 = (int) ((Math.random() * 6) + 1); // output: some int between 1-6
														// we add 1, to make it start at 1
														// we add 3, to make it start at 3
		/////////////////////////////////////////////////////////////////////////////////////

		int d1 = (int) (Math.random() * 6) + 1;
		int d2 = (int) (Math.random() * 6) + 1; 
		int d3 = (int) (Math.random() * 6) + 1; 
		int d4 = (int) (Math.random() * 6) + 1; 

		// Quad: All the numbers are the same 
		// Triple: 3 of the numbers are the same
		// Two Pairs: two dice have the same number and the other two are the same but
		// different
		// from the first two 2233
		// Junker: didn't qualify for any of the other winners
		///////////////////////////////////////////////////////////////////////////////////////

		// TUESDAY
		/*
		 * 1244 want to reroll? [0,2]: 2 //how many to reroll which die do you want to
		 * reroll: 1 //which die which die do you want to reroll: 2 //which 3444
		 * 
		 * 1244 want to reroll?[0,2]: 1 which die to reroll: 2 1344
		 * 
		 */
		/*
		 * A : 90-100 B : 80-90 C : 70-80 D : 60-70 F : <60
		 */

		double score = Math.random() * 100;
		String letGrade;

		if (score >= 90) {
			letGrade = "A";
		} else if (score >= 80 && score < 90) {
			letGrade = "B";
		} else if (score >= 70 && score < 80) {
			letGrade = "C";
		} else if (score >= 60 && score < 70) {
			letGrade = "D";
		} else {
			letGrade = "F";
		}
		System.out.println("Score is: " + score);
		System.out.println("Grade is: " + letGrade);

		/*
		 * Write a java loop that will add up all the odd numbers from 1-21 into an int
		 * variable named sum
		 */
		int sum = 0;
		for (int x = 1; x <= 21; x++) // can do x+=2
		{
			if (x % 2 != 0)
				sum += x;
			System.out.println("Sum: " + sum);
		}

		// Thursday

		// scanner std
		int times = 0;
		do {
			System.out.print("Enter a number between 100 and 100,000: ");
			times = std.nextInt();
		} while (!(times >= 100 && times <= 100000));

		int v1 = 0;
		int v2 = 0;
		int v3 = 0;
		int v4 = 0;

		int die;

		for (int i = 0; i <= times; ++i) {
			die = (int) ((Math.random()) * 4) + 1;

			/*
			 * if die == 1 then increment v1
			 */
			if (die == 1) {
				++v1;
			} else if (die == 2) {
				++v2;
			} else if (die == 3) {
				++v3;
			} else {
				++v4;
			}
		}

		System.out.println("v1= " + v1);
		System.out.println("v2= " + v2);
		System.out.println("v3= " + v3);
		System.out.println("v4= " + v4);

		// Quiz 6b

		int n = (int) Math.random() * 100;
		int m = (int) Math.random() * 100;

		int smallest = Math.min(n, m);
		System.out.println(smallest);
		// 012345 but the length is 6
		
		String str = "hellof";
		int occurence = str.indexOf("f");
		System.out.println(occurence);

		// method is the same thing as function

		String str2 = str.substring(str.length() / 2); // second half of str
		String str3 = str.substring(0, str.length() / 2 + 1); // first half of str
		// for substring the first number is inclusive, the second is exclusive
		System.out.println(str2);

		// indexOf vs charAt
		/*
		 * indexOf is taking in a character and then return the index of that character
		 * 
		 * charAt is taking in a number and then return the character at that index
		 * 
		 * String str = stdIn.nextLine();
		 * 
		 * indexOf: want to replace a letter in a string do index of and then get back
		 * the index then change the letter at the index
		 * 
		 * 
		 */

		String str1 = "Welcome";
		// print out the second half of a string
		String secondHalf = str1.substring(str1.length() / 2);
		// print out the first half of a string
		String firstHalf = str1.substring(0, str1.length() / 2);
		System.out.println(firstHalf);

		// using indexOf and substring together
		String sentence = "Kate Do";
		String first;
		String last;

		int space = sentence.indexOf(" ");
		first = sentence.substring(0, space);
		last = sentence.substring(space + 1);
		System.out.println(last + " " + first);

		
		//Friday
		/*
		 * keep track of
		 * 	- die
		 * these will be initialized to zero and outside of the loop / at the very top
		 * 	- wins = 0
		 * 	- losses = 0
		 *  - rounds = 0
		 *do{  
		 */
		int die1 = (int) (Math.random() * 6) + 1;
		int die2 = (int) (Math.random() * 6) + 1; 
		int die3 = (int) (Math.random() * 6) + 1; 
		int die4 = (int) (Math.random() * 6) + 1; 
		/*
		 * Outprint the die
		 * 
		 *  Types of wins
		 *  will be using if statements, will create a sense of hierarchy 
		 *  4 4 4 4 
		 *   - quad
		 *   - triple
		 *   - two Pair
		 *   - junker (last case)
		 */
		/*
		 *  1 2 3 3 
		 *  
		 *  1. reroll at most two die [0,2]: 0
		 *     -> don't reroll 
		 *     
		 *  2. reroll at most two die[0,2]: 1
		 *     -> select which die to reroll
		 *     -> through if statements figure out which die it is
		 *     
		 *  3. reroll at most two die[0,2]: 2
		 *     -> select which die to reroll [1,4]:
		 *     -> select which die to reroll:
		 *     -> through if statements figure out which die it is
		 * 
		 * print out type of win, add to wins or losses
		 *     -> reroll said die, outprint new set of die
		 *     -> then ask if they want to play again
		 *     		ask through 1 or 2
		 *     		ask through y or n
		 *     print("1:play again, 2 exit")
		 *     print("play again? y or n: ")
		 *     add to rounds
		 * } while(based off of if they want to play again);
		 * 
		 * Printing out all the stats
		 *  
		 */
			
	}
