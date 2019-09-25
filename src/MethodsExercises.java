import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {

    public static void main(String[] args) {
//        addition(2,3);
//        subtraction(4,2);
//        division(15,3);
//        multiplication(5,5);
//        modulus(15, 3);
//
//        getInput(1,10);

//        printFactorial(10);
    }

    // Addition
    public static int addition(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }

    // Subtraction
    public static int subtraction(int a, int b) {
        System.out.println(a - b);
        return a - b;
    }

    // Division
    public static int division(int a, int b) {
        System.out.println(a / b);
        return a / b;
    }

    // Multiplication
    public static int multiplication(int a, int b) {
        System.out.println(a * b);
        return a * b;
    }

    // Modulus
    public static int modulus(int a, int b) {
        System.out.println(a % b);
        return a % b;
    }

    // Get Input
    public static int getInput(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int temp = Integer.parseInt(scanner.nextLine());
        if (temp >= min && temp <= max) {
            System.out.println("This is a valid number");
            return temp;
        } else {
            System.out.println("Number out of range, try again!");
            getInput(min, max);
        }
        return temp;
    }

    // Calc and display factorial
    public static void printFactorial(int num) {
        String multiples = "";
        int factorial = 0;
        String iteratorToString;

        for (int i = 1; i <= num; i++) {
            iteratorToString = Integer.toString(i);
            if (i == 1) {
                multiples = iteratorToString;
                factorial = i;
            }
            if (i > 1) {
                multiples += " x " + iteratorToString;
                factorial = factorial * i;
            }
            System.out.printf("%4d!    %-60s = %d \n", i, multiples, factorial);
        }

    }


}
