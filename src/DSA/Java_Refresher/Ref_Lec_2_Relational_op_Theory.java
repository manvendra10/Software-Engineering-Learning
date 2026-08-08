package DSA.Java_Refresher;

import java.util.Scanner;

public class Ref_Lec_2_Relational_op_Theory {
    public static void main(String[] args) {
        /*
        Relational Operator ===>
         A < B
         A > B
         A >= B
         A <= B
         A == B
         A != B

         Logical Operator ===>

         AND Operator -->
         Gives Output as boolean ( true or false )
         T && T = T
         T && F = F
         F && T = T
         F && F = F

         OR Operator -->
         Gives Output as boolean( true or false )
         T || F = T
         F || T = T
         T || T = T
         F || F = F
         */
        /*
        Electricity bill -> Print the bill amount
        units [ 1 - 50 ] = charge 1 rs
        units [ 51 - 100] = charge 2 rs
        units [ 101 - above] = charge 4 rs
         */
        Scanner scn = new Scanner( System.in );
        System.out.println( "Ques : Electricity bill -> Print the bill amount ");
        int bill;
        System.out.println("Enter, How many electricity units have been used by customer");
        int units = scn.nextInt();
        if( units <= 50 ) {
            System.out.println( "Bill = " + units * 1 );
        }
        else if( units > 50 && units <= 100 ) {
            System.out.println( "Bill = "+ ( 50 * 1 + (units - 50) * 2) );
        }
        else { // units > 100
            System.out.println( "Bill = "+ ( 50*1 + 50 *2 + ( (units-100) *4) ) );
            /*
            Units = 156   ===>
            Bill = 50 *1 + 50 * 2 + 56 * 4 = 50+ 100 + 224 = 374
             */
        }
    }
}
