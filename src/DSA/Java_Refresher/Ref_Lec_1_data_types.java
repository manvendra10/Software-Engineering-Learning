package DSA.Java_Refresher;

import java.util.Scanner;

public class Ref_Lec_1_data_types {
    public static void main(String[] args) {
        String name = "Neeraj";
        System.out.println( "my name is = " + name );
        System.out.println( name + " age is 27 years old ");
        int i = 10; // whole number default is integer
        long l = 10000000000l;
        float f = 3.14f;
        double d = 4.786744784; // decimal number default is double

        /*
        1. In java -> the whole number is always considered as integer by default
        2. In java -> the decimal number is always considered as double by default.
        3. when we want to override it -> then we specially mention l and f.
        l for long( big whole number )
        f for float( small decimal number)
        Note -> This is true only when u initialize the value and not when u get data from the user.
         */
        System.out.println( "i = " + i );
        System.out.println( "l = " + l );
        System.out.println("f = "+ f );
        System.out.println("d = "+ d );

        // Typecasting

        // case 1 ->
        int i1 = 5;
        long l1 = i1; // Typecast from Low to High -> Implicit type coasting
        System.out.println(" integer type-casted to Long...so l1 = " + l1);

        // case 2 ->
        long l2 = 1000l;
        // Typecast from high to low ( saving long into int variable)   -> Implicit type coasting
        //int i2 = l2; // compilation error = possible lossy conversion from long to int  -> Implicit type conversion
        //System.out.println( "Typecast from Long to Int....so i2 = " + i2 );

        long l3 = 1000l;
        int i3 = (int)l3; // no compilation error -> explicit type casting  ( we mention it explicitly )
        System.out.println(" EXPLICIT typecasting i3 = " + i3 );

        long l5 = 10000000000000l;
        int i5 = (int) l5;  // it is a data loss for us
        System.out.println( " i5 value = "+ i5 + " it is data loss of us");

        // Taking input from the user
        System.out.println( "Taking the i/p from the user ");
        Scanner scn = new Scanner( System.in ); // creating the object scn

        //System.out.println( "give ur input as string");
        //String name2 = scn.next(); // fails with space and takes only 1st value
        //System.out.println( "name2 = " + name2 );

        System.out.println( "give ur input as string with space in between");
        String name3 = scn.nextLine(); // takes input with space
        System.out.println( "name3= " + name3 );


        System.out.println( "given ur input in integer");
        int i4 = scn.nextInt();
        System.out.println( "given ur input in long");
        long l4 = scn.nextLong();
        System.out.println( "given ur input in float");
        float f1 = scn.nextFloat();
        System.out.println( "given ur input in double");
        double d1 = scn.nextDouble();

        System.out.println( "i4 = " + i4 );
        System.out.println( "l4 = " + l4 );
        System.out.println("f1 = "+ f1 );
        System.out.println("d1 = "+ d1 );


    }
}
