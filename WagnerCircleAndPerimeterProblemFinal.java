import java.util.Scanner;
import java.lang.Math;



public class WagnerCircleAndPerimeterProblemFinal 
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
            System.out.println( "Let's tell a joke first. What do you call a man who spent all summer at the beach?" );
      
            String joke = jokeVariable.nextLine();
            System.out.println(spacerBar);
            
            System.out.println("A tangent!") ;
            System.out.println(spacerBar);
           
           
   
   String measuringUnit;
   measuringUnit = " inches";
   
               double pi = 3.14;       
               double radiusCircle = 7;
               
          System.out.println("Radius of a circle " + radiusCircle + measuringUnit);
          System.out.println(spacerBar);
          
               double circumference = (radiusCircle * 2) * pi;
          
          System.out.println( "The circumference of this circle will be " + circumference + measuringUnit);
          System.out.println(spacerBar);
          
                double areaCirc = Math.pow(radiusCircle, 2.0) * pi;
                 
          System.out.println( "The area of this circle will be " + areaCirc + measuringUnit);
          System.out.println(spacerBar);
          System.out.println(spacerBar);
                
                 double lengthSideA = 6;
                 double widthSideB = 10;
               
         System.out.println("Length of Rectangle is " + lengthSideA + measuringUnit);
         
               
          System.out.println("Width of Rectangle is " + widthSideB + measuringUnit);
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

