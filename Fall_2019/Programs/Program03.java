package Fall_2019.Programs;

/*************************************************************************** 
Program03.java * CS 250 * 
Computes a baseball pitcher's ERA given earned runs and innings pitched. 
****************************************************************************/

import java.util.Scanner;

public class Program03
{  
  public static void main(String[] args) 
  {    
    Scanner stdIn = new Scanner(System.in);

    String firstName;
    System.out.print("Pitcher's first name: ");
    firstName = stdIn.next();
    
    String lastName;
    System.out.print("Pitcher's last name: ");
    lastName = stdIn.next();
    
    int numEarnedRuns;
    System.out.print("Number of earned runs: ");
    numEarnedRuns = stdIn.nextInt();
    
    int numInningsPitched;
    System.out.print("Number of innings pitched: ");
    numInningsPitched = stdIn.nextInt();
    
    double ERA = numEarnedRuns * 9.0 / numInningsPitched;
    System.out.println(firstName + " " + lastName + 
                       " has an ERA of " + ERA);
   
    stdIn.close();
  }
}
