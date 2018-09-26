public class WagnerSalesTaxAssignment //don't FORGET TO SAVE
{
   public static void main(String[] args) { 
   
   
   System.out.println("Hi Jason, here's my code for the second Blackboard Assignment!");
   
   
   String messageZero;
    messageZero = "Sales Tax is 6%"; 
    System.out.println (messageZero);
    
      double taxAmount = .06;
      System.out.println();
      
   
      double firstItemAmount = 1;
      double answer = taxAmount*firstItemAmount+firstItemAmount;
      System.out.println ("Amount for item 1 after tax is: $" + answer);
      
      
      double secondItemAmount = 10;
      double answerTwo = taxAmount*secondItemAmount+secondItemAmount;
      System.out.println ("Amount for item 2 after tax is: $" + answerTwo + "0");
      
      
      double thirdItemAmount = 100;
      double answerThree = taxAmount*thirdItemAmount+thirdItemAmount;
      System.out.println ("Amount for item 3 after tax is: $" + answerThree + "0");
      
      
     /* Not sure if using the "0" is the best way to add the second decimal point, but it works so far!
         
        I started off using the int for the cost of the item, but 
         realized you cannot combine the double and int variable, so I
         made everything a double variable.
       */

       
        
   }
}