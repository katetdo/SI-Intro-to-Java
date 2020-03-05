package Fall_2018;

/*
I am: The teacher

This is Program 01: it is having us display two
formatted lines from our course schedule this semester.

My lab section is:
*/

public class Program01
{  
  public static void main(String[] args) 
  {    	
    // the long way
    System.out.println();  
    System.out.println("COMPSCI-251: Intermediate Computer Programming (3 Credits)");
    System.out.println();
    System.out.print("Lecture 401");
    System.out.print('\t');
    System.out.print("10:00 - 10:50am");
    System.out.print('\t');
    System.out.print("MW");
    System.out.print('\t');
    System.out.print("EMS W190");
    
    System.out.println();
    System.out.println();
    
    // the short way
    System.out.println();
    System.out.println("COMPSCI-251: Intermediate Computer Programming (3 Credits)");
    System.out.println();
    System.out.print("Lecture 401\t12:00 - 12:50am\tTR\tEMS E145");
     
    System.out.println();
  }
}
