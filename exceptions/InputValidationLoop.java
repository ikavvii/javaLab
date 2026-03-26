package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidationLoop {

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = 0;
        do {
            System.out.println("Enter your age: ");
            try {
                age = sc.nextInt();
                if (age < 18) { // throw an exception if the user is under 18
                    throw new IllegalArgumentException("You must be at least 18 years old to vote.");
                } else {
                    System.out.println("You are eligible to vote.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for age.");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (age < 10);  // Input Validation Loop, user wrongly enters single digit age, loop continues until a valid age is entered
        sc.close();
     }
}