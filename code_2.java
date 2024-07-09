/**
 Program to multiply two floating point number
 */

import java.util.Scanner;
public class code_2 {

    public static void main(String[] args) {
        System.out.println("Multiplication of two floating numbers");
        System.out.println("Enter First Floating Number:");
        Scanner scanner = new Scanner(System.in);
        Double Number_1 = scanner.nextDouble();

        System.out.println("Enter a Second Floating Number:");
        Scanner scanner2 = new Scanner(System.in);
        Double Number_2 = scanner2.nextDouble();


        System.out.println(Number_1 * Number_2);

        



    }
}