package _02_Conditionals;

import java.util.Scanner;

public class fiveOrThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        if (n % 5 == 0 || n % 3 == 0) System.out.println("The Number Is Divisible By Three Or Five");
        else System.out.println("The Number Is Not Divisible By Three Or Five ");


    }


    }
