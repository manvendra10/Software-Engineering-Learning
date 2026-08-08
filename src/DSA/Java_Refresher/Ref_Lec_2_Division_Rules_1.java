package DSA.Java_Refresher;

public class Ref_Lec_2_Division_Rules_1 {
    public static void main(String[] args) {
        /*
        Theory
        Rules of Division ->
        int/int = int
        long/int = long
        long/long = long

        float/int = float
        int/float = float

        double/int = double
        int/double = double
        double/long = double
        long/double = double

        double/float = double
        float/double = double

        -> Here,
        1. int and long can be exchanged anywhere
        2. float and double can be exchanged anywhere
         */
        System.out.println( 13.00000 / 4 );
        System.out.println( 13.0f /4 );
        System.out.println( 13 / 4 );
        System.out.println( 4 / 13);
        System.out.println( 13l/4 );

    }
}
