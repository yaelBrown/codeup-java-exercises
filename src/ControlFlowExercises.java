import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        // While

//        int i = 5;
//
//        while ( i <= 15) {
//            System.out.println(i);
//            i++;
//        }


        //  Do-While

        int j = 0;

//        do {
//            System.out.println(j);
//            j += 2;
//        } while (j <= 100);


        j = 100;

//        do {
//            System.out.println(j);
//            j -= 5;
//        } while (j >= 0);


//        System.out.println(j);
//        j = 2;
//        double k = Double.valueOf(j);
//
//            do {
//                System.out.println(k);
//                k = Math.pow(k, 2);
//            } while (k < 1000000);


        // FizzBuzz (again)
//        for (int l = 1; l <= 100; l++) {
//            if (l % 15 == 0) System.out.println("FizzBuzz");
//            if (l % 5 == 0) System.out.println("Buzz");
//            if (l % 3 == 0) System.out.println("Fizz");
//            System.out.println(l);
//        }



        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What number would you like to go up too?");
//        int limit = scanner.nextInt();
//
//        System.out.println("\nHere is your table!\n");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for (int m = 1;m <= limit; m++) {
//            System.out.println(m + "      | " + (m * m) + "       | " + ((m * m) * m ));
//        }



        boolean cont = true;
        String response = "";
        char ltrGrade;
        int grade = 0;
        System.out.println("Please enter a grade between 0 and 100:");
        grade = scanner.nextInt();

        while (cont) {
            if (grade <= 100 && grade >= 88) {
                ltrGrade = 'A';
            } else if (grade <= 87 && grade >= 80) {
                ltrGrade = 'B';
            } else if (grade <= 79 && grade >= 67) {
                ltrGrade = 'C';
            } else if (grade <= 66 && grade >= 60) {
                ltrGrade = 'D';
            } else {
                ltrGrade = 'F';
            }

            System.out.println("Current letter grade is: " + ltrGrade);

            System.out.println("Add another grade? (type yes or no)");
            scanner.next();
            response = scanner.next();
            if (response == "yes" || response == "y") {
                cont = true;
            } else {
                cont = false;
            }
        }






    }

}
