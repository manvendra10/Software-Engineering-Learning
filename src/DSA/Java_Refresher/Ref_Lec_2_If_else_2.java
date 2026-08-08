package DSA.Java_Refresher;

import java.util.Scanner;

public class Ref_Lec_2_If_else_2 {
    public static void main(String[] args) {
        // Question 1
        System.out.println("Question 1 -> Input the temperature of the person and we will tell low, normal or high");
        System.out.println("input the temperature in double like 98.2, 99.0, etc ");
        Scanner scn = new Scanner( System.in );
        /*
        Theory -> Here, we use Double and NOT Float since in java Float is buggy and Double is preferred
        If u can use the double then use it ( though it takes more memory )
         */
        double temp = scn.nextDouble();
        if( temp < 98.2 ) {
            System.out.println("person has low temperature");
        }
        else if( temp > 98.6 ) {
            System.out.println("person has high temperature ");
        }
        else { // Normal temp = [ 98.2 to 98.6 ] boundary's are inclusive
            System.out.println("person has normal temperature");
        }

    }
}
