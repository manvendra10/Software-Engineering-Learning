package DSA.Java_Refresher;

import java.util.*;

public class Ref_Lec_2_If_else_1 {
    public static void main(String[] args) {
        /*
        Ques 1 -> Given, a person's as a input -> is he eligible to vote ?
        print accordingly
        */
        Scanner scn = new Scanner(System.in);
        System.out.println( "enter the age ");
        int age = scn.nextInt();
        if( age < 18 ) {
            System.out.println( "person is not eligible to vote ");
        }
        else { // age is >= 18
            System.out.println( "person is eligible to vote ");
        }
        /*
        Theory -> if else is sequential. if-else is a chained approach.
         */
        // Ques 2 :-> max of 2 numbers
        System.out.println( "enter 2 numbers as input and give max out of them ");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        if( num1 > num2 ) {
            System.out.println( num1 + " is max out of these 2 numbers ");
        }
        else if( num2 > num1 ){ // num2 is greater
            System.out.println( num2 + " is max out of these 2 numbers ");
        }
        else { // num1 == num2
            System.out.println( num1 +" and "+ num2 + " both are equal ");
        }

    }
}
