import java.util.Arrays;

public class ArraysExercises {

    // Created add person method
    public static Person[] addPerson(Person[] arr, Person p) {
        // Create temp array with +1 of the original array
        Person[] temp = new Person[arr.length + 1];

        // Add person Object to last element of the array
        temp[arr.length - 1] = p;

        // Return the temporary array
        return temp;
    }

    public static void main(String[] args) {


//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        Arrays.toString(numbers); // This will print out a string of all the arrays
//
//        // Will print out the reference of the array

        Person[] peeps = new Person[4];

        // Prints object reference of array.
        System.out.println(peeps);

        // Add elements to array
        peeps[0] = new Person("Yael");

        peeps[1] = new Person("Steve");

        peeps[2] = new Person("Bob");

        peeps[3] = new Person("Ethan");


        // Can use comma seperated values to create objects into the array.
//        Person peeps = {
//                new Person("Yael"),
//                new Person("Steve"),
//                new Person("Bob"),
//                new Person("Ethan")
//        };

        // Print name of person within the peeps array
        System.out.println(peeps[3].getName());

        // Using Java forEach loop to print names of each person in array
        for (Person p : peeps) {
            System.out.println(p.getName());
        }

        // Use created add person method.
        Person human = new Person("Cool");

        addPerson(peeps, human);

        // Print updated peeps array
        System.out.println("\nUpdated peeps array:");


        // Created new array.
        Person[] newPeeps = new Person[peeps.length + 1];

        // Add human to last element of new array
        newPeeps[newPeeps.length - 1] = human;

        // Should print name of Mr. Cool
        System.out.println(newPeeps[newPeeps.length - 1].getName());

        // elements of other array (peeps) into newPeeps
        int idx = 0; // cannot get index using a forEach loop
        for (Person p : peeps) {
            newPeeps[idx] = p;
            idx++;
        }

        // can add elements with for loop
//        for (int i = 0; i < peeps.length; i++) {
//            newPeeps[i] = peeps[i];
//        }

//        // Could also use copyOf method for arrays when creating new Peeps array
//        Person[] newPeeps = Arrays.copyOf(peeps, peeps.length+1);
//        // Will then still need to do a for loop to populate new array.

        // This line is unnecessary
//        newPeeps[newPeeps.length - 1].setName(human.getName());

        // Print new array
        for (Person p : newPeeps) {
            System.out.println(p.getName());
        }



    }



}
