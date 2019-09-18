import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        final Scanner scan = new Scanner(System.in);

        System.out.println("Ask Bob a question?");
        String message = scan.nextLine();

        System.out.println("message is: " + message + " length is : " + message.length());
//        System.out.println("?".equals(message.substring(message.length() - 1)));

        if ("?".equals(message.substring(message.length() - 1))) {
            System.out.println("Sure");
        } else if ("!".equals(message.substring((message.length() - 1)))) {
            System.out.println("Whoa, chill out!");
        } else if (message.equals("") || message.equals(" ")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever");
        }
    }

}