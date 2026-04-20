package _02_Conditionals;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a Cost Price");
        int cp = sc.nextInt() ;
        System.out.println("Enter a Selling Price");
        int sp = sc.nextInt() ;

        if (sp > cp) {
            System.out.println("Profit is");
            System.out.println( sp - cp);
        }
        if (sp < cp) {
            System.out.println("Loss is " + (cp - sp));
        }
        if (sp == cp) System.out.println("No Profit No Loss");









    }











}
