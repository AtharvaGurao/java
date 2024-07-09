/*Program to Compute Quotient and Remainder */

import java.util.Scanner;

public class code_4 {
    public static void main(String args[]){
      System.out.println("Division of Numbers");
      System.out.println("Please Enter a First Number: ");
      Scanner scanner = new Scanner(System.in);
      int Number_1 = scanner.nextInt();

      System.out.println("Please Enter a Second Number: ");
      Scanner scanner2 = new Scanner(System.in);
      int Number_2 = scanner.nextInt();
   
      int quotient = Number_1/Number_2;

      int remainder = Number_1%Number_2;

    System.out.println("Quotient = " + quotient);
    System.out.println("Remainder = " + remainder);

    
    }
    
}
