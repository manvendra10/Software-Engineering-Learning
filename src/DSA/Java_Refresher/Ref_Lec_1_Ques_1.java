package DSA.Java_Refresher;

import java.util.Scanner;

/*
Take two names as input and print x and y are friends;
 */
public class Ref_Lec_1_Ques_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in );
        System.out.println( " enter two names ");
        String name1 = scn.nextLine();
        String name2 = scn.nextLine();
        System.out.println( name1 + " and " + name2 +" are good friends ");
        System.out.println( "enter the name1's age ");
        int age = scn.nextInt();
        System.out.println( name1 + " age is = " + age );

    }
}

