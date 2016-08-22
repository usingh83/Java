/*
 * A prime number is a natural number greater than  whose only positive divisors are  and itself. For example, the first six prime numbers are , , , , , and .

Given a large integer, , use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.
 Input Format

A single line containing an integer, n (the number to be checked).

Constraints

n contains at most 100 digits.

Output Format

If n is a prime number, print prime; otherwise, print not prime.

Sample Input

13

Sample Output

prime

Explanation

The only positive divisors of 13 are 1 and 13, so we print prime.

 */

import java.util.*;
import java.math.*;

public class PrimeOrNot {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      in.close();
      boolean bool=n.isProbablePrime(10);
      if (bool==true){System.out.println("Prime");}
      else System.out.println("Not Prime");
   }
}
