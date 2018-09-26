import java.util.Scanner;

public class WagnerPennyandChange
{
   public static void main(String[] args) {
   
   String spacerBar;
   spacerBar = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
   
   
    Scanner myKeyboardVariable = new Scanner(System.in); //system.in is taking input from the keyboard, where .out is printing out to the monitor
            System.out.println( "Enter your name: ");
            
            String name = myKeyboardVariable.nextLine();
            System.out.println(spacerBar);
            
            System.out.println("Hello " + name + "! Welcome to the change calculator!") ;
            System.out.println(spacerBar);
            
            
     Scanner jokeVariable = new Scanner(System.in);      
            System.out.println( "Let's tell a joke first. Why didn't the quarter roll down the hill with the nickel?" );
      
            String joke = jokeVariable.nextLine();
            System.out.println(spacerBar);
            
            System.out.println("Because it had more cents!") ;
            System.out.println(spacerBar);
            
            
   
   
   int totalPen = 111;
   
   System.out.println("I wonder why my bag is so heavy, must be the " + totalPen + " pennies in there!");
   System.out.println("Let's put some change back in the register, what will I take out?");
   System.out.println(spacerBar);
   
 
   
   
   int quarter = 25;
   int dime = 10;
   int nickel = 5;
   int penny = 1;
   
         int quarterCount = totalPen / quarter;
         System.out.println("This is how many quarters I will get: " + quarterCount);
         int quarterAmount = (quarterCount * quarter);
         System.out.println(spacerBar);
         
         int dimeCount = (totalPen-quarterAmount) / dime;
         System.out.println("This is how many dimes I will get: " + dimeCount);
         int dimeAmount = (dimeCount * dime);
         System.out.println(spacerBar);
         
         
         int nickelCount = (totalPen-quarterAmount-dimeAmount) / nickel;
         System.out.println("This is how many nickels I will get: " + nickelCount);
         int nickelAmount = (nickelCount * nickel);
         System.out.println(spacerBar);
         
         int pennyCount = (totalPen-quarterAmount-dimeAmount-nickelAmount) / penny;
         System.out.println("This is how many pennies I will get: " + pennyCount);
         int pennyAmount = (pennyCount * penny);
         System.out.println(spacerBar);

   
   
   
   }
   }