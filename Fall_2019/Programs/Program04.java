package Fall_2019.Programs;

import java.util.Scanner;

public class Program04
{ 
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);

    String pn;
    System.out.println();
    System.out.print("Please enter a pnone number (ddd)ddd-dddd : ");
    pn = stdIn.nextLine();
    System.out.println();

    boolean valid = false;
    if ( pn.length() == 13 )
    {
      if ( pn.charAt(0) == '(' && pn.charAt(4) == ')' && pn.charAt(8) == '-' )
      {
        if ( (pn.charAt(1) >= '0' && pn.charAt(1) <= '9') &&
             (pn.charAt(2) >= '0' && pn.charAt(2) <= '9') &&
             (pn.charAt(3) >= '0' && pn.charAt(3) <= '9') &&
            //
             (pn.charAt(5) >= '0' && pn.charAt(5) <= '9') &&
             (pn.charAt(6) >= '0' && pn.charAt(6) <= '9') &&
             (pn.charAt(7) >= '0' && pn.charAt(7) <= '9') && 
            //
             (pn.charAt(9) >= '0' && pn.charAt(9) <= '9') &&
             (pn.charAt(10) >= '0' && pn.charAt(10) <= '9') &&
             (pn.charAt(11) >= '0' && pn.charAt(11) <= '9') &&
             (pn.charAt(12) >= '0' && pn.charAt(12) <= '9') )
        {
          valid = true;
        }
      }
    }
    if ( valid )
      System.out.println(pn + " is a valid phone number!");
    else
      System.out.println(pn + " is not a valid phone number!");

    System.out.println();
    stdIn.close();
  }
}
