package Fall_2019.Programs;


public class Program09
{
  public static void main(String[] args)
  {

    int [] deck = new int[36];

    initDeck(deck);

    displayDeck(deck);

    System.out.println("***********************************************");

    shuffleDeck(deck, 256);
    
    displayDeck(deck);

    System.out.println("***********************************************");

  }


  public static int cardValue(int card)
  {
    return card % 9 + 1;
  }

  public static String cardSuit(int card)
  {
    String [] suits = {"C", "S", "H", "D"};

    return suits[ card / 9 ];
  }

  public static void displayCard(int card)
  {
    System.out.print(cardValue(card) + cardSuit(card));
  }


  public static void initDeck(int[] deck)
  {
    for (int i = 0; i < deck.length; ++i)
      deck[i] = i;
  }

  public static void shuffleDeck(int[] deck, int n)
  {
    for (int i = 1; i <= n; ++i)
    {
      int j = (int)(Math.random() * 36);
      int k = (int)(Math.random() * 36);
      
      int tmp = deck[j];
      deck[j] = deck[k];
      deck[k] = tmp;
    }
  }

  public static void displayDeck(int[] deck)
  {
    for (int i = 0; i < deck.length; ++i)
    {
      displayCard(deck[i]);
      System.out.println();
    }
  }

}
