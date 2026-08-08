package DSA.Java_Refresher;

import java.util.Scanner;

public class Ref_Lec_2_Amazon_Ques {
    public static void main(String[] args) {
        /*
        Amazon Question ->
        Fizz Buss
        Given, A as input ( Number )
        1. if A is divisible by 3 -> Print Fizz
        2. if A is divisible by 5 -> Print Buss
        3. if A is divisible by 3 and 5 -> Print Fizz Buss
        4. else print Nothing
         */
        System.out.println("Solving Amazon Ques : Fizz Buss");
        Scanner scn = new Scanner( System.in );
        System.out.println("Enter, a number as input ");
        int a = scn.nextInt();
        if( (a % 3 == 0) && (a % 5 == 0 ) ) {
            System.out.println( "Fizz Buss");
        }
        else if( a % 3 == 0 ) {
            System.out.println( "Fizz");
        }
        else if( a % 5 == 0 ) {
            System.out.println( "Buss");
        }
        else {
            System.out.println( "Nothing");
        }
    }
}
