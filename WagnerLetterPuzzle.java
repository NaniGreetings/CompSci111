import java.util.Scanner;
import javax.swing.JOptionPane;



public class WagnerLetterPuzzle 
{
   public static void main(String[] args) {     
   
   String spacerBar;
   spacerBar = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
      
  String nameInput = JOptionPane.showInputDialog("Greetings! Enter Your Name: ");
   JOptionPane.showMessageDialog(null, "Welcome, " + nameInput + "! Thanks for opening this program.");
            
                     
  
                
            
    Scanner keyboardFirstWord = new Scanner(System.in);      
            System.out.println( "Enter your first word: " );
      
            String firstWord = keyboardFirstWord.nextLine();
            System.out.println(spacerBar);
            
            System.out.println("Fabulous, you entered: " + firstWord ) ;
            System.out.println(spacerBar);
            
    Scanner keyboardSecondWord = new Scanner(System.in);      
            System.out.println( "Enter your second word: " );
      
            String secondWord = keyboardSecondWord.nextLine();
            System.out.println(spacerBar);
            
            System.out.println("Neat, you entered: " + secondWord ) ;
            System.out.println(spacerBar);
            
    Scanner keyboardThirdWord = new Scanner(System.in);      
            System.out.println( "Enter your third word: " );
      
            String thirdWord = keyboardThirdWord.nextLine();
            System.out.println(spacerBar);
            
            System.out.println("Wow, you entered: " + thirdWord ) ;
            System.out.println(spacerBar);
            
            String wordsTogether = firstWord + secondWord + thirdWord;
            
            System.out.println("Let's see them all together  --> " + wordsTogether);
            System.out.println(spacerBar);
            
            
            String upperWords = wordsTogether.toUpperCase();
            String lowerWords = wordsTogether.toLowerCase();
                  

       
            System.out.println("What if you yelled? --> " + upperWords);
            System.out.println("What if you whispered? --> " + lowerWords);
            System.out.println(spacerBar);
            
            int firstWordLength = firstWord.length();
            int secondWordLength = secondWord.length();
            int thirdWordLength = thirdWord.length();
            int wordsTogetherLength = wordsTogether.length();
            
            System.out.println("How long are these words?");
            System.out.println("The first word is " + firstWordLength + " letter(s) long!");
            System.out.println("The second word is " + secondWordLength + " letter(s) long!");
            System.out.println("The third word is " + thirdWordLength + " letter(s) long!");
            System.out.println("Aaaaaaaaaaand all together it is " + wordsTogetherLength + " letter(s) long!");
            System.out.println(spacerBar);
            
            char firstLetterFirstWord = firstWord.charAt(0);
            char firstLetterSecondWord = secondWord.charAt(0);
            char firstLetterThirdWord = thirdWord.charAt(0);
       
            
                        
            System.out.println("" + firstLetterFirstWord + firstLetterSecondWord + firstLetterThirdWord);
            
            
             char lastLetterFirstWord = firstWord.charAt(firstWordLength - 1);
             char lastLetterSecondWord = secondWord.charAt(secondWordLength - 1);
             char lastLetterThirdWord = thirdWord.charAt(thirdWordLength -1);
             
            System.out.println("" + lastLetterFirstWord + lastLetterSecondWord + lastLetterThirdWord);
            
            
            
            
//             //                   
            
                 
           
           
           
           
           
   
   }
}

