package Fall_2019.Programs;

import java.util.Scanner;

public class Program08
{
  public static void main(String[] args) 
  {
    Scanner stdIn = new Scanner(System.in);

    int chips = 100;

    int choice;
    int number = 0;
    String color = "";
    int bet;

    int spinNumber;
    String spinColor;

    welcome();
    System.out.println("You have 100 chips");

    do
    {
      System.out.println("\n");
      choice = getMenuChoice(stdIn);
      System.out.println();
      if ( choice != 3 )
      {
        if ( choice == 1 )
        {	
          number = getNumber(stdIn);
        }
        else
        {
          color = getColor(stdIn);
        }
        System.out.println();
        bet = getBet(stdIn, chips);
        System.out.println();
        
        System.out.println("Spinng the wheel ...");
        spinNumber = (int)(Math.random() * 37);
        System.out.println("Spin number : " + spinNumber);
        spinColor = determineColor(spinNumber);
        System.out.println("Spin color : " + spinColor);

        System.out.println();
        if ( choice == 1 )
        {
          if ( number == spinNumber )
          {
            System.out.println("Congrats, you won!");
            chips += 35*bet;
          }
          else
          {
            System.out.println("Sorry, you lost!");
            chips -= bet;
          }
        }
        else
        {
          if ( color.equalsIgnoreCase(spinColor) )
          {
            System.out.println("Congrats, you won!");
            chips += bet;
          }
          else
          {
            System.out.println("Sorry, you lost!");
            chips -= bet;
          }
        }
        
        System.out.println("You now have " + chips + " chips");
      }      
    } while ( choice != 3 && chips > 0 );

    System.out.println("\n");
    report(chips);

    stdIn.close();
  }


  public static void welcome()
  {
    System.out.println("############################");
    System.out.println("#   WELCOME TO ROULETTE    #");
    System.out.println("############################");
    System.out.println("# NUMBER BETS PAYOUT: 35:1 #");
    System.out.println("# COLOR BETS PAYOUT:   1:1 #");
    System.out.println("############################\n");
  }

  public static int getMenuChoice(Scanner stdIn)
  {
    int choice;

    System.out.println("1. Pick a number to bet on");
    System.out.println("2. Pick a color to bet on");
    System.out.println("3. Cash out");
    System.out.println();
    do 
    {	
      System.out.print("Enter a choice [1-3]: ");
      choice = stdIn.nextInt();
    } while ( choice < 1 || choice > 3 );

    return choice;
  }

  public static int getNumber(Scanner stdIn)
  {
    int number;

    do 
    {   
      System.out.println("Enter the number to bet on [1-36]: ");
      number = stdIn.nextInt();
    } while ( number < 1 || number > 36 );

    return number;
  }

  public static String getColor(Scanner stdIn)
  {
    String color;

    do 
    {   
      System.out.println("Enter the color to bet on [Red or Black]: ");
      color = stdIn.next();
    } while ( !(color.equalsIgnoreCase("red") || color.equalsIgnoreCase("black")) );

    return color;    
  }

  public static int getBet(Scanner stdIn, int chipsNow)
  {
    int bet;

    do
    {
      System.out.print("Enter the number of chips to bet [1-" + chipsNow + "]: ");
      bet = stdIn.nextInt();
    } while (bet < 1 || bet > chipsNow);

    return bet;
  }

  public static String determineColor(int spinNum)
  {
    if( spinNum == 0 )
      return "Green";
    else if( spinNum % 2 == 0 )
      return "Red";
    else
      return "Black";
  }

  public static void report(int chipsNow)
  {
    System.out.print("Thanks for playing, ");
    if ( chipsNow > 100 )
      System.out.println("you won a total of " + (chipsNow - 100) + " chips!");
    else if ( chipsNow < 100 )
      System.out.println("you lost a total of " + (100 - chipsNow) + " chips!");
    else
      System.out.println("you broke even!");
  }

}
