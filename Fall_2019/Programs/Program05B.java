package Fall_2019.Programs;

import java.util.Scanner;

public class Program05B

{
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);
    
    String bitString = "";
    int resultSoFar= 0;
   
    String operator;
    char op;
    do
    {
      System.out.println();
      System.out.println("---------------------------------------------");
      System.out.println();
      System.out.println("           0 -> Shift Left, Add 0");
      System.out.println("           1 -> Shift Left, Add 1");
      System.out.println("           2 -> Exit, Evaluate");
      System.out.println();
      System.out.println("---------------------------------------------");
      System.out.println();
      do
      {
        System.out.print("Choose an operator from the menu above : ");
        operator = stdIn.next();
      } while ( !(operator.equals("0") || operator.equals("1") || 
                  operator.equals("2")) );
      
      op = operator.charAt(0);
      if (op != '2')
      {
        // operator
        if ( op == '0' )
        {
          bitString += "0";
          resultSoFar *= 2;
        }
        else if( op == '1' )
        {
          bitString += "1";
          resultSoFar = 2*resultSoFar + 1;
        }
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println();
      }
     
      if ( op != '2' )
        System.out.println(bitString);
      
    } while ( op != '2' );
    
    System.out.println();
    System.out.println("---------------------------------------------");
    System.out.println();
    System.out.println(bitString + " = " + resultSoFar);
    System.out.println();
    System.out.println("---------------------------------------------");
    
    stdIn.close();
  }
}