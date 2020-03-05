package Fall_2018;

import java.util.Scanner;

public class Program09
{ 
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);
    
    // get common phrase from user1
    String sPhrase;
    System.out.print("Please enter the phrase to guess at : ");
    sPhrase = stdIn.nextLine();
    System.out.println("\n\n\n\n\n\n\n");
    
    // create correct sized template array
    int size = sPhrase.length();
    char [] tmpArr = new char[size];
    // initialize template array
    int spaces = initTemplateArray(sPhrase, tmpArr);
    int vowels = 0;
    int consons = 0;

    // start the game (user2)
    char guess;
    do 
    {
      // display current state of the template array
      System.out.println("\n\n");
      System.out.println("Common Phrase");
      System.out.println("-------------");
      printTemplateArray(tmpArr);
      System.out.println("\n\n\n");
      
      String resp;
      // is allowed ask for vowel or consonant guess
      if (consons > 0)
      {
        do
        {
          System.out.print("Would you like to buy a vowel : ");
          resp = stdIn.next();
        } while (!(resp.equalsIgnoreCase("y") || resp.equalsIgnoreCase("n")));
        if (resp.equalsIgnoreCase("y"))
        {
          System.out.println();
          guess = getVowel(stdIn);
         // update template array with new guess, and vowels revealed variable
          vowels += updateTemplateArray(tmpArr, sPhrase, guess);
        }
        else
        {
          System.out.println();
          guess = getConsonant(stdIn);
          // update template array with new guess, and consonants revealed variable
          consons += updateTemplateArray(tmpArr, sPhrase, guess);
        }
      }
      // otherwise consonant guess only
      else
      {
        System.out.println();
        guess = getConsonant(stdIn);
        // update template array with new guess, and consonants revealed variable
        consons += updateTemplateArray(tmpArr, sPhrase, guess);    
      }
    } while (spaces + consons + vowels < size);

    // display fully revealed template array
    System.out.println("\n\n");
    System.out.println("Common Phrase");
    System.out.println("-------------");
    printTemplateArray(tmpArr);
    System.out.println("\n");
    
    // display "report"
    System.out.println("The common phrase contained: " + spaces + " space(s), " +
                       consons + " consonsant(s) and " + vowels + " vowel(s).");    
    
    stdIn.close();
  }
  
  
  public static int initTemplateArray(String sPhrase, char [] tmpArr)
  {
    int spaces = 0;
    int sLen = sPhrase.length();
    for (int i = 0; i < sLen; ++i)
      if (sPhrase.charAt(i) == ' ')  
      {
        tmpArr[i] = ' ';
        ++spaces;
      }
      else
        tmpArr[i] = '?';
    
    return spaces;
  }

  public static void printTemplateArray(char [] tmpArr)
  {
    for (int i = 0; i < tmpArr.length; ++i)
      System.out.print(tmpArr[i]);
  }
    
  public static boolean isVowel(char c)
  {
    return (c == 'a' || c == 'e' || c == 'i' ||
            c == 'o' || c == 'u');
  }  

  public static char getConsonant(Scanner stdIn)
  {
    String guess;
    
    do
    {
      System.out.print("Enter a lowercase consonant guess : ");
      guess = stdIn.next();
    } while (guess.length() != 1 || isVowel(guess.charAt(0)) || 
             guess.charAt(0) < 'a' || guess.charAt(0) > 'z');

    return guess.charAt(0); 
  }

  public static char getVowel(Scanner stdIn)
  {
    String guess;
    
    do
    {
      System.out.print("Enter a lowercase vowel guess : ");
      guess = stdIn.next();
    } while (guess.length() != 1 || !isVowel(guess.charAt(0)));

    return guess.charAt(0); 
  }

  public static int updateTemplateArray(char [] tmpArr, String sPhrase, char guess)
  {  
    int found = 0;
    int loc = sPhrase.indexOf(guess);
    while (loc != -1)
    {
      if (tmpArr[loc] == '?')
      {
        ++found;
        tmpArr[loc] = guess;
      }
    
      loc = sPhrase.indexOf(guess, loc+1);
    }
  
    return found;
  }

}