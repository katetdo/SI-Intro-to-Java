package Fall_2019.Programs;

import java.util.Scanner;

public class Program06
{
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);
      
    // display the welcome / instructions
    System.out.println();
    System.out.println();
    System.out.println("       Welcome to Computer Dice");
    System.out.println("-----------------------------------------");
    System.out.println("You will first roll your dice");
    System.out.println();
    System.out.println("Next the outcome of your roll will");
    System.out.println("be determined:");
    System.out.println();
    System.out.println("any Quad and you Win");
    System.out.println("any Triple and you Win");
    System.out.println("any HighPair ( 4's ) and you Win");
    System.out.println("anything else and you Lose");
    System.out.println("-----------------------------------------");
    System.out.println();
    System.out.println();
    
    // for the four die
    int d1;
    int d2;
    int d3;
    int d4;
    
    // keep track of results
    int wins = 0;
    int loses = 0; 
    // play again response
    String pa;
    do
    {
      // roll the two die
      d1 = (int)(Math.random() * 4) + 1;
      d2 = (int)(Math.random() * 4) + 1;
      d3 = (int)(Math.random() * 4) + 1;
      d4 = (int)(Math.random() * 4) + 1;
      
      // display the result of the dice roll
      System.out.println("  Player ");
      System.out.println("----------");
      System.out.print(d1 + "  " + d2 + "  " + d3 + "  " + d4);
      System.out.print("\n\n");


      // assume a win
      ++wins;
      // determine & report if it is an actual win or a loss
      if ( (d1 == d2) && (d2  == d3) && (d3 == d4) ) // Quad
        System.out.println("Quad, you win!");
      
      else if ( 
                (d1 == d2) && (d2 == d3) ||
                (d1 == d2) && (d2 == d4) ||
                (d1 == d3) && (d3 == d4) ||
                (d2 == d3) && (d3 == d4)                
              ) // Triple
        System.out.println("Triple, you win!");
      
      else if (
                (d1 == d2) && (d3 == d4) ||
                (d1 == d3) && (d2 == d4) ||
                (d1 == d4) && (d2 == d3)                
              ) // TwoPair
        System.out.println("Two pair, you win!");
      
      else if ( 
                (d1 == 4) && (d2 == 4) ||
                (d1 == 4) && (d3 == 4) ||
                (d1 == 4) && (d4 == 4) ||
                (d2 == 4) && (d3 == 4) ||
                (d2 == 4) && (d4 == 4) ||
                (d3 == 4) && (d4 == 4)
              )
        System.out.println("High pair, you win!");
      
      else // lose
      {
        --wins;
        ++loses;
        System.out.println("Sorry, you lose!");

      }
      System.out.println();
      
      // play again question / answer
      do
      {
        System.out.print("Do you wish to play again [y, n] : ");
        pa = stdIn.next();
      } while (!(pa.equalsIgnoreCase("y") || pa.equalsIgnoreCase("n")));

      System.out.println("\n");

    } while (pa.equalsIgnoreCase("y"));

    // display final results / report
    System.out.println();
    System.out.println("Computer Dice Results");
    System.out.println("---------------------");
    System.out.println("You played " + (wins + loses) + " rounds");
    System.out.println();
    System.out.println("Rounds won\t:" + wins);
    System.out.println("Rounds lost\t:" + loses);
    System.out.println("---------------------");
    System.out.println();
    
    stdIn.close();
  } 
} // class
