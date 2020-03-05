package Fall_2018;

import java.util.Scanner;

class Program10
{
  public static void main(String[] args)
  {
    final int FOAK = 6545;
    final int TOAK = 51;
    final int STR = 38;
    final int TP = 22;
    final int OP = 1;

    int bank = 100;
    int [] deck = new int[36];
    int nextCardLoc = 36;
    int[] hand = new int[4];
    
    int nHands = 0;
    int nWins = 0;
    int nLosses = 0;

    Scanner stdIn = new Scanner(System.in);
    boolean exit = false;

    System.out.println("\n\tWelcome to 4 Card Poker");
    System.out.println("   Your initial bank roll is $100.00");
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++\n");
    
    do
    {
      if ( playHand(stdIn) )
      {
        ++nHands;
        
        int bet = getBet(stdIn, bank);
       
        nextCardLoc = dealHand(deck, nextCardLoc, hand);
        System.out.println("\nLet the cards fall where they may ...\n");
        displayHand(hand);
        System.out.println("\n");

        if ( isQuad(hand) )
        {
          ++nWins;
          bank += bet * FOAK;
          System.out.println("Congrats: You got 4 of a Kind " +
                             "and have won $" + bet * FOAK + ".");
        }
        else if ( isTrip(hand) )
        {
          ++nWins;
          bank += bet * TOAK;
          System.out.println("Congrats: You got 3 of a Kind " +
                             "and have won $" + bet * TOAK + ".");
        }
        else if ( isStriaght(hand) )
        {
          ++nWins;
          bank += bet * STR;
          System.out.println("Congrats: You got a Straight " +
                             "and have won $" + bet * STR + ".");
        }
        else if ( is2Pair(hand) )
        {
          ++nWins;
          bank += bet * TP;
          System.out.println("Congrats: You got 2 Pair " +
                             "and have won $" + bet * TP + ".");
        }
        else if ( isPair(hand) )
        {
          ++nWins;
          bank += bet * OP;
          System.out.println("Congrats: You got a Pair " +
                             "and have won $" + bet * OP + ".");
        }
        else // Bubkiss
        {
          ++nLosses;
          bank -= bet;
          System.out.println("Sorry: you got Bubkiss " +
                             "and have lost $" + bet + ".");
        }
        System.out.println();
      }
      else
        exit = true;
      
    } while ( bank > 0 && !exit );
 
    report(nHands, nWins, nLosses, bank);
    
    stdIn.close();
  }

  
  public static boolean playHand(Scanner stdIn)
  {
    String op;
    
    do
    {
      System.out.print("\nPlay a hand [ y / n ] ? ");
      op = stdIn.next();
    } while ( !(op.equalsIgnoreCase("y") || op.equalsIgnoreCase("n")) );

    return op.equalsIgnoreCase("y");
  }

  public static int getBet(Scanner stdIn, int bank)
  {
    int bet;
    
    do
    {
      System.out.print("\nPlace your bet [1, " + bank + "] : ");
      bet = stdIn.nextInt();
    } while ( bet < 1 || bet > bank );

    return bet;
  }
  
  public static void report(int nHands, int nWins, int nLosses, int bank)
  {
    System.out.println("\n\n+++++++++++++++++++++++++++++++++++++++++++\n\n");
    if (bank == 0)
      System.out.println("Party's Over: you are out of chips.\n\n");

    System.out.println("Thanks for playing ... \n");

    System.out.println("You played a total of " + nHands + " hands.");
    System.out.println("Of which, you won " + nWins + ".");
    System.out.println("And you lost " + nLosses + "."); 

    System.out.print("\nBut in the end you ");
    if (bank - 100 > 0)
      System.out.print("won $" + (bank - 100));
    else if (bank - 100 < 0)
      System.out.print("lost $" + (100 - bank));
    else
      System.out.print("Broke even");
    System.out.println(".\n\n"); 
  }
  
  public static void initDeck(int[] deck)
  {
    for (int i = 0; i < deck.length; ++i)
      deck[i] = (i % 9) + 1;
  }
  
  public static void shuffleDeck(int[] deck, int n)
  {
    int loc1;
    int loc2;
    int tCard;
    for (int i = 1; i <= n; ++i)
    {
      loc1 = (int)(Math.random() * deck.length);
      loc2 = (int)(Math.random() * deck.length);
      tCard = deck[loc1];
      deck[loc1] = deck[loc2];
      deck[loc2] = tCard;
    }
  }
  
  public static void sortHand(int[] hand) 
  {
    for (int i = 0; i < hand.length; ++i)
    {
      int maxLoc = i;
      for (int j = i+1; j < hand.length; ++j)
        if (hand[j] > hand[maxLoc])
          maxLoc = j;        

      int tmp = hand[i];
      hand[i] = hand[maxLoc];
      hand[maxLoc] = tmp;
    }
  }
  
  public static int dealHand(int [] deck, int nextCard, int[] hand)
  {
    if ( nextCard > deck.length - hand.length )
    {
      initDeck(deck); 
      shuffleDeck(deck, 128);
      nextCard = 0;
      // just for effect
      System.out.println("\n\n ... Shuffling Deck ... \n");
    }
    for (int i = 0; i < hand.length; ++i)
    {
      hand[i] = deck[nextCard + i];
    }
    sortHand(hand);
    
    return nextCard + hand.length;
  }

  public static void displayHand(int[] hand)
  {
    for (int i = 0; i < hand.length; ++i)
    {
      if ( i < hand.length - 1 )
        System.out.print(hand[i] + "  ");
      else
        System.out.print(hand[i]);
    }
  }

  public static boolean isQuad(int[] hand) 
  {
    return (hand[0] == hand[1] &&
            hand[1] == hand[2] &&
            hand[2] == hand[3]);
  }

  public static boolean isTrip(int[] hand) 
  {
    return ((hand[0] == hand[1] &&
             hand[1] == hand[2]) ||
            (hand[1] == hand[2] &&
             hand[2] == hand[3]));
  }

  public static boolean isStriaght(int[] hand) 
  {
    return (hand[0] == hand[1]+1 &&
            hand[1] == hand[2]+1 &&   
            hand[2] == hand[3]+1);
  }

  public static boolean is2Pair(int[] hand) 
  {
    return (hand[0] == hand[1] &&
            hand[2] == hand[3] &&
            hand[1] != hand[2]);
  }

  public static boolean isPair(int[] hand) 
  {
    return (hand[0] == hand[1] ||
            hand[1] == hand[2] ||
            hand[2] == hand[3]);
  }

}
