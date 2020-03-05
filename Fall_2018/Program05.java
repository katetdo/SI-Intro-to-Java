package Fall_2018;

import java.util.Scanner;

public class Program05

{
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);
    
    String expression = "0";
    int resultSoFar = 0;
   
    String operator;
    char op;
    System.out.println(expression);
    do
    {
      System.out.println();
      System.out.println("---------------------------------------------");
      System.out.println();
      System.out.println("           1 -> Add 1");
      System.out.println("           2 -> Add 2");      
      System.out.println("           3 -> Multiply by 3");
      System.out.println("           4 -> Exit");
      System.out.println();
      System.out.println("---------------------------------------------");
      System.out.println();
      do
      {
        System.out.print("Choose an operator from the menu above : ");
        operator = stdIn.next();
      } while (operator.length() != 1 || 
               ((op = operator.charAt(0)) < '1' || op > '4')); 
      
      if (op != '4')
      {
        // operator
        if ( op == '1' )
        {
          expression = "(" + expression + "+1)";
          ++resultSoFar;
        }
        else if( op == '2' )
        {
          expression = "(" + expression + "+2)";
          resultSoFar += 2;
        }
        else if( op == '3' )
        {
          expression = "(" + expression + "*3)";
          resultSoFar *= 3;
        }

        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println();
      }
      
      if ( op != '4' )
        System.out.println(expression);
      
    } while ( op != '4' );
    
    System.out.println();
    System.out.println("---------------------------------------------");
    System.out.println();
    System.out.println(expression + " = " + resultSoFar);
    System.out.println();
    System.out.println("---------------------------------------------");
    
    stdIn.close();
  }
}