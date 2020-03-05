package Fall_2018;
import java.util.Scanner;

public class Program04
{
  public static void main(String[] args) 
  {
    Scanner stdIn = new Scanner(System.in);

    String str;
    System.out.print("Please enter a valid turn dial lock combination : ");
    str = stdIn.nextLine();

    int len = str.length();
    int segs = 0;
    int loc = 0;
    if ( len >= 6 && len <= 9 ) // rule out all the easy ones
    {
      // check the first R group
      if ( str.charAt(loc) == 'R' )
      {
        ++loc;

        // must contain one digit
        if ( str.charAt(loc) >= '0' && str.charAt(loc) <= '9' )
        {
          ++loc;
          ++segs;

          // may contain a second digit
          if ( str.charAt(loc) >= '0' && str.charAt(loc) <= '9' )
            ++loc;
        }
      }
      // check the L group
      if ( str.charAt(loc) == 'L' )
      {
        ++loc;

        // must contain one digit
        if ( str.charAt(loc) >= '0' && str.charAt(loc) <= '9' )
        {
          ++loc;
          ++segs;

          // may contain a second digit
          if ( str.charAt(loc) >= '0' && str.charAt(loc) <= '9' )
            ++loc;
        }
      }
      // check the second R group
      if ( loc < len && str.charAt(loc) == 'R' )
      {
        ++loc;

        // must contain one digit
        if ( loc < len && str.charAt(loc) >= '0' && str.charAt(loc) <= '9' )
        {
          ++loc;
          ++segs;

          // may contain a second digit
          if ( loc < len && str.charAt(loc) >= '0' && str.charAt(loc) <= '9' )
            ++loc;
        }
      }  
    }

    // Valid iff every character contributed to the count and three segments
    if ( loc == len && segs == 3 )
    {
      System.out.println("\n" + str + " is a valid turn dial lock combination\n\n");
    }
    else
    {
      System.out.println("\n" + str + " is not a valid turn dial lock combination\n\n");
    }

    stdIn.close();
  }
}