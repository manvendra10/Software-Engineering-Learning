package DSA.Java_Refresher;

import java.util.Scanner;


public class Ref_Lec_2_Modulo_Rules_Ques_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in );
        System.out.println( "Enter the number as input ");
        // ques -> Get the last digit of the number
        System.out.println( "Ques : Get the last digit of the number ");
        int x = scn.nextInt();
        int last_digit = x % 10; // 1456 % 10 = 6
        System.out.println("last_digit = " + last_digit );
        // Ques : Get all the digits of the number
        System.out.println( "Ques: Get all the digits of the number");
        System.out.println("all digits of the number are = ");
        while( x > 0 ) {
            int current_digit = x % 10;
            x = x / 10; // current number under consideration
            System.out.println(" " + current_digit);
        }

    }
}
