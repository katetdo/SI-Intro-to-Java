package Fall_2018;

import java.util.Scanner;

public class Program07
{
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);
      
    // display the welcome / instructions    
    System.out.println();
    System.out.println();
    System.out.println("                Welcome to opponent Dice");
    System.out.println("---------------------------------------------------------");
    System.out.println("You will be playing dice against the opponent");
    System.out.println();
    System.out.println("High beats low, and same ties");
    System.out.println("Triples beat Pairs and Junk");
    System.out.println("Pairs beat Junk");
    System.out.println("In the case of two identical Pairs - high card decides");
    System.out.println("in the case of two Junks - its a tie");
    System.out.println("---------------------------------------------------------");
    System.out.println();
    System.out.println();
    
    // the three Player dice
    int pd1;
    int pd2;
    int pd3;
    
    // the three opponent dice
    int od1;
    int od2;
    int od3;
    
    // keep track of results
    int wins = 0;
    int loses = 0;
    int ties = 0;
 
    // play again response
    String pa;
    do
    {
      // roll the Player's dice
      pd1 = (int)(Math.random() * 6) + 1;
      pd2 = (int)(Math.random() * 6) + 1;
      pd3 = (int)(Math.random() * 6) + 1;

      // display the Player's dice roll
      System.out.println("   Player");
      System.out.println("------------");
      System.out.print("  " + pd1 + "  " + pd2 + "  " + pd3);
      System.out.print("\n\n");

      // roll the Opponent's dice
      od1 = (int)(Math.random() * 6) + 1;
      od2 = (int)(Math.random() * 6) + 1;
      od3 = (int)(Math.random() * 6) + 1;
      
      // display the Opponent's dice roll
      System.out.println("  Opponent");
      System.out.println("------------");
      System.out.print("  " + od1 + "  " + od2 + "  " + od3);
      System.out.print("\n\n");
      
      // analyze the Player's dice roll
      int playerR;

      // Triple
      if ( (pd1 == pd2) && (pd2 == pd3) )
        playerR = 100* pd1 ;
      // Pair with high card
      else if ( pd1 == pd2 ) 
        playerR = 10 * pd1 + pd3;
      else if ( pd1 == pd3 )
        playerR = 10 * pd1 + pd2;
      else if ( pd2 == pd3 )
        playerR = 10 * pd2 + pd1;
      // Junk
      else
        playerR = 0;

      // analyze the Opponent's dice roll
      int opponentR;

      // Triple
      if ( (od1 == od2) && (od2 == od3) ) 
        opponentR = 100* od1 ;
      // Pair with high card
      else if ( od1 == od2 ) 
        opponentR = 10 * od1 + od3;
      else if ( od1 == od3 )
        opponentR = 10 * od1 + od2;
      else if ( od2 == od3 )
        opponentR = 10 * od2 + od1;
      // Junk
      else
        opponentR = 0;
        
     // determine outcome
      if ( playerR > opponentR ) 
      {
        ++wins;
        System.out.println("Congrats, you win!");
      }
      else if ( playerR < opponentR ) 
      {
        ++loses;
        System.out.println("Sorry, you lose!");
      }
      else // playerR == opponentR
      {
        ++ties;
        System.out.println("Its a Tie!");
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
    System.out.println("Player's Dice Results");
    System.out.println("----------------------");
    System.out.println("You played " + (wins + ties + loses) + " rounds");
    System.out.println();
    System.out.println("Rounds won\t:" + wins);
    System.out.println("Rounds tied\t:" + ties);
    System.out.println("Rounds lost\t:" + loses);
    System.out.println("---------------------");
    System.out.println();
    
    stdIn.close();
  } 
} // class
