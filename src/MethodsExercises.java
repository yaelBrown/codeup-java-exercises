import java.util.Scanner;

public class MethodsExercises {

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
        if (temp > min && temp < max) {
            return temp;
        } else {
            System.out.println("Number out of range, try again!");
            getInput(min, max);
        }
        return temp;
    }

    public static void main(String[] args) {
        addition(2,3);
        subtraction(4,2);
        division(15,3);
        multiplication(5,5);
        modulus(15, 3);

        getInput(1,10);
    }

}
