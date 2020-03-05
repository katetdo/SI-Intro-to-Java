package Fall_2019.Programs;

import java.util.Scanner;

public class Program05S
{ 
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);

    String str;
    System.out.println();
    System.out.print("Please enter a string (ddd)(ddd)...(ddd) : ");
    str = stdIn.nextLine();
    System.out.println();
//------------------------------------------------------------------
    int len = str.length();
    boolean valid = ( len % 5 == 0 );
    for ( int i = 0; valid && i < len; ++i )
      if ( i % 5 == 0 )
        valid = ( str.charAt(i) == '(' );
      else if ( i % 5 == 4 )
        valid = ( str.charAt(i) == ')' );
      else
        valid = ( str.charAt(i) >= '0' && str.charAt(i) <= '9' );
//------------------------------------------------------------------  
    if ( valid )
      System.out.println(str + " is valid");
    else
      System.out.println(str + " is not valid!");

    stdIn.close();
  }
}
