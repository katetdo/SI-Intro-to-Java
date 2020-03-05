package Fall_2018;

/*************************************************************************** 
Program03.java * CS 201 * 
Computes a baseball pitcher's ERA given earned runs and innings pitched. 
****************************************************************************/

import java.util.Scanner;

public class Program03
{  
  public static void main(String[] args) 
  {    
    Scanner stdIn = new Scanner(System.in);

    System.out.print("Pitcher's first name: ");
    String firstName = stdIn.next();
    System.out.print("Pitcher's last name: ");
    String lastName = stdIn.next();
    System.out.print("Number of earned runs: ");
    int numEarnedRuns = stdIn.nextInt();
    System.out.print("Number of innings pitched: ");
    int numInningsPitched = stdIn.nextInt();
    System.out.println(firstName + " " + lastName + " has an ERA of " +
                       numEarnedRuns * 9.0 / numInningsPitched);
   
    stdIn.close();
  }
}
