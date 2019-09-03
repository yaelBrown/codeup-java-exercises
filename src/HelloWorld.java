public class HelloWorld {
    public static void main(String[] args) {
//        Prints to new line
//        System.out.println("Hello World");

//        prints to same line.
//        System.out.print("Hello ");
//        System.out.print("World");

        int myFavoriteNumber = 27;
        String myString = "This is a string.";
        char c = myString.charAt(0);

        System.out.println(c);

//        myString = 3.14159.toString();
//        4. Double cannot be dereferenced

//        long myNumber;
//        5. Variable myNumber might not have been initialized

//        long myNumber = 3.14;
//        6. Incompatible types

//        float myNumber = 3.14;
//        Possible lossy conversion from double to float

        long myNumber = 123L;
        System.out.println(myNumber);

        myNumber = 123;

//        8. Longs have to be whole numbers. Floats and doubles have values after deciminal

//        float anothaNumber = 3.14;

//        Using casting you can convert double to float.
        double temp =  3.14;
        float f = (float)temp;

        System.out.println(f); // 3.14

//        Shows x then adds 1 to the variable of x.
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        Shows adds 1 to x then displays x, then displays x again
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        11. Class is a reserved keyword in java

//        12. String could not be cast to integer
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        int x = 4;
        x += 5;

        int y = 4;
        int z = 3;
        z *= y;

        int a = 10;
        int b = 2;
        a /= b;
        b -= a;

//        14. Wont let you compile a number larger than max value for that datatype
    }
}
