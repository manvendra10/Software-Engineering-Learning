package DSA.Java_Refresher;

import java.util.Scanner;

public class Ref_Lec_2_Modulo_Rules_1_Theory {
    public static void main(String[] args) {
        /*
        Modulo -> % operator is for fetching the remainder when we divide 2 numbers
        Example ->
         1. 7 % 3 = 1
         2. 10 % 1 = 0
         3. 7 % 11 = 7
         4. 17 % 4 = 1
         5. when b completely divides a  or a is completely divisble by b =>
                a % b = 0
         6. a % 2 = 0  => It means a is even
         7. a % 2 = 1  => It means a is odd
         8. 0 is even number
         */
        // Ques -> given a number, tell whether it is even or odd ?
        Scanner scn = new Scanner( System.in );
        System.out.println("Enter the number..to test even or odd ");
        int x = scn.nextInt();
        if( x % 2 == 0 ){
            System.out.println( "the number is = "+ " even ");
        }
        else {
            System.out.println("the number is = " + " odd ");
        }
        System.out.println("other approach ");
        String result = (x % 2 == 0) ? "even" : "odd";
        System.out.println( "String result = (x % 2 == 0) ? \"even\" : \"odd\";" + " = " + result );

    }
}
