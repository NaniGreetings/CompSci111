import java.util.Scanner;
import java.lang.Math;




public class WagnerShapesAgain 
{
   public static void main(String[] args) {     
   
   String spacerBar;
   spacerBar = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
      
   
    Scanner myKeyboardVariable = new Scanner(System.in);      
            System.out.println( "Hello! Please type your name in! " );
      
            String name = myKeyboardVariable.nextLine();
            System.out.println(spacerBar);
            
            System.out.println(name + "! Welcome to the shape assignment!") ;
            System.out.println(spacerBar);
            
   Scanner jokeVariable = new Scanner(System.in);      
            System.out.println( "Let's tell a joke first. What do you call friends who love math?" );
      
            String joke = jokeVariable.nextLine();
            System.out.println(spacerBar);
            
            System.out.println("Algebros.") ;
            System.out.println(spacerBar);
            
         
            
    Scanner keyboardRadius = new Scanner(System.in);      
            System.out.println( "Type in a radius: " );
      
            double radiusCirc = keyboardRadius.nextDouble();
            System.out.println(spacerBar);
            
            System.out.println("Great! " + radiusCirc + " inches is the Radius") ;
            System.out.println(spacerBar);
           
           
   
   String measuringUnit;
   measuringUnit = " inches";
   
               double pi = 3.14;       
              
               
                    
               double circumference = (radiusCirc * 2) * pi;
          
          System.out.println( "The circumference of this circle will be " + circumference + measuringUnit);
          System.out.println(spacerBar);
          
                double areaCirc = Math.pow(radiusCirc, 2.0) * pi;
                 
          System.out.println( "The area of this circle will be " + areaCirc + measuringUnit);
          System.out.println(spacerBar);
          System.out.println(spacerBar);
                
                
    Scanner keyboardLength = new Scanner(System.in);      
            System.out.println( "Type in a length for a rectangle: " );
      
            double lengthSideA = keyboardLength.nextDouble();
            System.out.println(spacerBar);
            
            System.out.println("Nice! " + lengthSideA + " inches is the Length") ;
            
            System.out.println(spacerBar);
                
               
   Scanner keyboardWidth = new Scanner(System.in);      
            System.out.println( "Type in a width for a rectangle: " );
      
            double widthSideB = keyboardWidth.nextDouble();
            System.out.println(spacerBar);
            
            System.out.println("Fantastic! " + widthSideB + " inches is the Width") ;
            
            System.out.println(spacerBar);
               
                   System.out.println(spacerBar);
           
           
                  double areaRect = lengthSideA * widthSideB;
           System.out.println("The area of this rectangle is " + areaRect + measuringUnit);
           System.out.println(spacerBar);
           
                  double perimeterRect = (lengthSideA * 2) + (widthSideB * 2);
                  
           System.out.println("The perimeter of this rectangle is " + perimeterRect + measuringUnit);
           System.out.println(spacerBar);
           
           System.out.println("Let's throw in some triangles!");
            System.out.println(spacerBar);
            
            
           System.out.println("Side A is " + lengthSideA + measuringUnit);
           System.out.println("side B is " + widthSideB  +  measuringUnit);
         
           
                  double sideCsquared = (Math.pow(lengthSideA, 2.0)) + (Math.pow(widthSideB, 2.0));
                  double sideC = Math.sqrt(sideCsquared);
                  
           System.out.println("Side C is " + sideC + measuringUnit);
           
           
           
           
           
           
           
           
           
           
   
   }
}

