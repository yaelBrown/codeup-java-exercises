import java.util.Scanner;

public class Input {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Ask for integer
        try {
            System.out.println("Enter a Integer");
            int getInt = sc.nextInt();
            System.out.println("getInt = " + getInt);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Integer was not inputted");
            sc.nextLine(); // clear buffer stream
        }

        // Ask for double
        try {
            System.out.println("Enter a double");
            double getDouble = sc.nextDouble();
            System.out.println("getDouble = " + getDouble);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Double was not inputted");
        }

    }


}

//oop
//arrays
//inheritance
//polymorphism
//interfaces
//collections
//exceptions and errors