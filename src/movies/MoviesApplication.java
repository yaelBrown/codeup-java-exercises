package movies;

import java.util.Scanner;

public class MoviesApplication {

    // variables
    public static Movie[] allTheMovies = MoviesArray.findAll();

    public static Scanner sc = new Scanner(System.in);

    public static int choice;

    public static boolean lookForMovies = true;

    // methods
    public static void findMoviesBy(String cat) {
        for (Movie mov : allTheMovies) {
            if (mov.getCategory().equalsIgnoreCase(cat)) {
                System.out.println(mov.getName() + "--" + mov.getCategory());
            }
        }
    }

    public static int promptForChoice() {
        choice = sc.nextInt();
        if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
            System.out.println("Please enter a valid choice!");
            promptForChoice();
        }
        return choice;
    }

    public static boolean promptoSearchMovies() {
        String tempChoice;

        System.out.println("Want to keep looking for movies?");

        sc.next();
        tempChoice = sc.nextLine();

        if (tempChoice == "yes" || tempChoice == "y") {
            return lookForMovies = true;
        } else {
            return lookForMovies = false;
        }
    }




    public static void main(String[] args) {

        System.out.println("What movies do you want to see? (Pick a number)");
        System.out.println("1. All movies");
        System.out.println("2. SciFi Movies");
        System.out.println("3. Drama");
        System.out.println("4. Musical");

        promptForChoice();

        switch (choice) {
            case 1:
                for (Movie mov : allTheMovies) {
                    System.out.println(mov.getName());
                }
                break;
            case 2:
                findMoviesBy("scifi");
                break;
            case 3:
                findMoviesBy("drama");
                break;
            case 4:
                findMoviesBy("musical");
                break;
            default:
                System.out.println("You should not see this.");
        }

    }

}
