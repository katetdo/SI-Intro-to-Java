package Fall_2019.Programs;

import java.util.Scanner;

public class Program05
{ 
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);

    String str;
    System.out.println();
    System.out.print("Please enter a string (ddd)(ddd)...(ddd) : ");
    str = stdIn.nextLine();
    System.out.println();

    int len = str.length();
    boolean valid = true;
    if ( len % 5 != 0 )
      valid = false;

    int i = 0;
    while ( valid && i < len )
    {
      if ( i % 5 == 0 )
      {
        if ( str.charAt(i) != '(' )
          valid = false;
      }
      else if ( i % 5 == 4 )
      {
        if ( str.charAt(i) != ')' )
          valid = false;
      }
      else
      {
        if ( !(str.charAt(i) >= '0' && str.charAt(i) <= '9') )
          valid = false;
      }

      ++i;
    }


    if ( valid )
      System.out.println(str + " is valid");
    else
      System.out.println(str + " is not valid!");

    System.out.println();
    stdIn.close();
  }
}
