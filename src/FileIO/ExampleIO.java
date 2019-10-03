package FileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleIO {

    // Defines path of file
    // Has to be static to be used in static methods
    private static Path p = Paths.get("src", "FileIO", "data.txt");

    // Prints out contents of file
    public static void retrieveFiles() {

        // Creates arrayList to hold information from file
        List<String> lines = new ArrayList<>();

        try {
            // Reads all lines in file
            lines = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Prints out whats in lines arrayL
        System.out.println(lines); // [Yael, Ethan, Dimitri]

        // Prints out list vertically
        //for (String l : lines) {
        //    System.out.println(l); // Outputs the lines on new lines each time
        //}
    }

    // Replace a line in the text file. (Replace replacee with the replacer)
    public static List replaceLine(String replacee, String replacer) {

        List<String> lines = new ArrayList<>();
        List<String> newLines = new ArrayList<>();

        try{
            // Read all the lines in file, assign to variable
            lines = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Iterate thru read list and replace in new arr newLines
        for (String li : lines) {
            if (li.equalsIgnoreCase(replacee)) {
                newLines.add(replacer);
                continue;
            }
            newLines.add(li);
        }

        // Print new array
        System.out.println(newLines);

        return newLines;
    }

    // Writes list arr thats passed in to method
    public static void writeToFile(List arr) {
        try {
            Files.write(p, arr);
        } catch(IOException e) {
            System.out.println("Unable to write to file !");
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        // Diplsay current file contents
        System.out.print("Contents currently in file: ");
        retrieveFiles();

        replaceLine("Ethan", "Derek");
        writeToFile(replaceLine("Ethan", "Derek"));

        // Display file content after making changes
        System.out.print("Modified contents in file: ");
        retrieveFiles();
    }


}
