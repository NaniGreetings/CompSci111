/*notes for 9/17/2018
what if we want a value not to change?

double pi = 3.14159
what if someone made it pi = 3.1?

use the keyword "final" once final is used the variable is sealed up

final double PI = 3.14159 */

// final variables are always in ALL CAPS


/* Strings both int and double are lower case and turned purple
a String is captilized and is not purple.

Primitive data the base line, you can't break them down anymore except into binary
a string is broken down into it's characters, then into binary. 
An object is a compound thing, a string is a compound
Objects are "complex data"
Objects can be interacted with, and they have certain properties

It's important to know the length of a string
because strings are objects, you can ask them what you need to now

how long is the string?

String word = "Montgomery"
int totalLetters = word.lenth()

System.out.println("Total Letters is: " + totalLetters 

A method is instruction that the string is giving

println is a method because it's telling the monitor to print and display the text in the ()

CompSci always starts at 0!

error: cannot find symbol = capilization error, spelling error, method doesn't exists (objects doesn't know how to do that)

 */


public class Notes91718
{
   public static void main(String[] args) {


final double PI = 3.14159;

String word = "Montgomery";
int totalLetters = word.length();

System.out.println( "Total Letters is: " + totalLetters);
System.out.println( word.toUpperCase() );
System.out.println( word.toLowerCase() );

System.out.println( word.charAt(12) );

System.exit(0);




System.out.println(PI);

}
}




