package DSA.Java_Refresher;

public class Ref_Lec_2_Multi_Rules_1_Theory {
    public static void main(String[] args) {
        /*
            int * int = int    ( stored temporary )
            long * int = long  ( stored temporary )
            int * long = long  ( stored temporary )
            long * long = long ( stored temporary )

            ===> int and float are replaceable
            ===> double and long are replaceable

            float * float = float
            double * int = double
            double * float = double
            float * double = double
            double * double = double

         */

        int x1 = 100000;
        int x2 = 100000;

        int result1 = x1 * x2 ; // -> gives garbage value
        long result2 = x1 * x2; // -> gives garbage value -> it will not able to store 10^10 in long variable

        System.out.println( "int result1 = x1 * x2 = " + result1 );  // -> gives garbage value
        System.out.println( "long result1 = x1 * x2 = " + result2 ); // -> gives garbage value

        long z = (long) ( x1 * x2 ); // this will also give the garbage value only
        // since x1 * x2 = stored in the int only so the value is trimmed/became garbage here only





    }
}
