package _02_Conditionals;

import java.util.Scanner;

public class gratestOfThreeNestedIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First Number");
        int a = sc.nextInt();
        System.out.println("Enter a Second Number");
        int b = sc.nextInt();
        System.out.println("Enter a Third Number");
        int c = sc.nextInt();

        if (a > b) {
        if (a > c) System.out.println( a + " is greatest");
        else System.out.println( c +  " is greatest "); // c >= a > b
        }
       else { // b >= a
           if (b > c) System.out.println( b + " is greatest");
          else // c > = b > = a
               System.out.println(c + " is largest");

        }



    }

}
