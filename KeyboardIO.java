import java.util.Scanner;


public class KeyboardIO

{

   public static void main(String[] args)
   {
   
            Scanner myKeyboardVariable = new Scanner(System.in); //system.in is taking input from the keyboard, where .out is printing out to the monitor
            System.out.println( "Enter your name: ");
            
            String name = myKeyboardVariable.nextLine();
            
            System.out.println("You entered: " + name);
            
   }
   
}

