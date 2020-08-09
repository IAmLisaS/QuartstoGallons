// Lisa Sinn
// Intro to Java - CSCI 1146 
// CSCI 1146-241
// Unit 2, Exercise #4
// quartstogallons.java

//QuartToGallons
import java.util.Scanner;
public class quartstogallons
{    
   public static void main(String[] args) 
   {  
      final int QUARTS_IN_GALLON = 4;
      int quartsNeeded = 18;
      int gallonsNeeded;
      int extraQuartsNeeded;

      Scanner input = new Scanner(System.in);

      System.out.print("Enter quarts needed >> ");
      quartsNeeded = input.nextInt();

      gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
      extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
      
      System.out.println("A job that needs " + quartsNeeded +
         " quarts requires " + gallonsNeeded + " gallons plus " +
         extraQuartsNeeded + " quarts.");
   }
}