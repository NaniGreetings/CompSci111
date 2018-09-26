

/* It's important to use base 10 measurement. this indicates it's a number
not binary. 

You also have to indicate you're reading left to right

This is byte:
0001 1010 base 2

16+8+2=26 base ten = 0001 1010

base two can only have 0 or 1, where base ten can have 0-9

19 base 10

0000 0000
128,64,32,16,8,4,2,1

16 can subtract from 19
2 can subtract from 19
1 can subtract from 19

0001 0011 = 19 base 2

This is int:

int a = 6;

0000 0000 0000 0000
0000 0000 0000 0110

^ This is why it's more effcient to indicate 6 as a byte

Some languages are unsigned, so they have no negative numbers, however
Java is signed and splits it so it covers -128 to 127

byte a = -6

0000 0000
computer doesn't understand negative


0101   5
0011  +3    You have to carry the one, because 2 doesn't exist in binary
1000  =8 


Base 8 is octal
8^0  8^1  8^2
1s    8s   64s



Base 16 is hexadecimal 

17 base 10 in 17 base 16 would be 11
uses 0-9, but 10-15 is represented with a-f


*/


public class Notes92418

{

   public static void main(String[] args)
    
    {
    
    byte b = (byte) (126+2); // the (byte) is a cast and overrides Java's protection
    
    System.out.println("Answer is: " + b);
    
    }
    }