import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

//        System.out.println("The value of pi is approximately " + pi);

        System.out.format("The value of pi is approximately: %.2f%n", pi);

        // multiple wildcards are separated by commas.
        String name = "codeup";
        String cohort = "Ceres";
        System.out.format("Welcome, %s, nice to see you %s!\n", cohort, name);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer");

        // You will get runtime error if you enter something other than a number.
        // InputMismatchException
        int numInt = scanner.nextInt();

        System.out.println("Enter three words");
        String wordOne = scanner.next();
        String wordTwo = scanner.next();
        String wordThr = scanner.next();

        System.out.println(wordOne);
        System.out.println(wordTwo);
        System.out.println(wordThr);

        // After last lines, add this to create a break to add more lines.
        scanner.nextLine();

        System.out.println("\nEnter a sentence");

        String sentence = scanner.nextLine();

        System.out.printf("You entered: %s", sentence);

        System.out.println("\nCalculate Perimeter !");

        System.out.println("\nEnter the length");
        int length = scanner.nextInt();
        // int length = Integer.parseInt(input.nextLine());

        System.out.println("Enter the width");
        int width = scanner.nextInt();

        int perimeter = (length * 2) + (width * 2);

        // parseInt
        // valueOf

        //Parsing values or getting the value of

//        String piString = "3.1416";
//        double pi = Double.valueOf(piString);
//        double piParsed = Double.parseDouble(piString);

        // Now that they are doubles we can do math with them

//        pi = pi *2;
//        piParsed = piParsed *3;
//
//        System.out.println("piParsed = " + pi);
//        System.out.println("piParsed = " + piParsed);

        System.out.printf("\nPerimeter of codeup's classrooms is %d feet.\n", perimeter);

        System.out.println("Insert height to calculate volume");
        int height = scanner.nextInt();
        int volume = perimeter * height;

        System.out.printf("Volume of the classroom is %d\n", volume);

        System.out.println("Provide a decimal entry: ");
        double decimalEntry = scanner.nextDouble();

        System.out.printf("Decimal entry you provided is %.2f", decimalEntry);



    }
}
