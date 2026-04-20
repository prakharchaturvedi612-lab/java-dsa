package _02_Conditionals;

import java.util.Scanner;

public class evenOddTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
                  // condition ? if true :  if false
        System.out.println((n%2==0) ? "Even" : "Odd");





    }

}
