import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

//        System.out.println("The value of pi is approximately " + pi);

        System.out.format("The value of pi is approximately: %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer");

        String num = scanner.nextLine();
//        Explore Scanner class #1

    }
}
