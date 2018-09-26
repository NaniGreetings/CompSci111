import javax.swing.JOptionPane;
{

public class WagnerCookies
{
      String nameInput = JOptionPane.showInputDialog("Hello there! Enter Your Name: ");
      JOptionPane.showMessageDialog(null, "Welcome, " + nameInput + "! Let's get baking!");
      
      String cookies = JOptionPane.showInputDialog("How many cookies would you like to make?");
      int cookieAmount = Integer.parseInt( cookies );
      System.out.println("You'd like to make " + cookieAmount + " cookies.");
      

}
}

// Cookies!
//    1.5 cups of sugar
//    1 cup of butter
//    2.75 cups of flour
//    
//    produces 48 cookies
//    
//    