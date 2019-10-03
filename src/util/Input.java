package util;

import java.util.Scanner;

public class Input {

    public static Scanner sc = new Scanner(System.in);
    // Don't define how the scanner is going to be used.
    // Could be used differently.
    private static Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Type y/n or yes/no");
        String answer = scanner.nextLine();
        return answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        int number = getInt();
        if (number >= min && number <= max) {
            return number;
        } else {
            System.out.println("Out of range");
            return getInt(min, max);
        }
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        // use getDouble() to get the info, instead of writing out scanner and prompt message.
        double doub = getDouble();
        if (doub >= min && doub <= max) {
            return doub;
        } else {
            System.out.println("Out of range");
            return getDouble();
        }
    }

    // Method asks for input and returns that input (double)
    public static double getDouble() {
        System.out.println("Enter a decimal: ");
        return scanner.nextDouble();
    }

}