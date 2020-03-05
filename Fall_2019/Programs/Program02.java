package Fall_2019.Programs;

/*
I am: The teacher

This is Program 02: it is having use compute the 
total surface area of the floor and also the walls 
of a given room, and display them separately.

My lab section is:

*/

public class Program02 
{
  public static void main(String[] args) 
  { 
    double length = 9.0;
    double width =  12.5;
    double height = 8.25;
    String units = "meters";
    
    System.out.println("Given a length of " + length + " " + units);
    System.out.println("a width of " + width + " " + units);
    System.out.println("and a height of " + height + " " + units);
    System.out.println();

    double floorSurfaceArea = length * width;
    
    System.out.println("The room\'s floor surface area is : " + 
        floorSurfaceArea + " " + units + " squared.");

    double totalSurfaceArea = 2 * (length * height) + 2 * (width * height);
    System.out.println();
    
    System.out.println("The room\'s walls total surface area is : " + 
                       totalSurfaceArea + " " + units + " squared.");
  }
}
