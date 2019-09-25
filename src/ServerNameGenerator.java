public class ServerNameGenerator {

    // Random number generator
    public static int randomNum(int mini, int maxi) {
        int max = maxi;
        int min = mini;
        int range = max - min + 1;
        return (int) (Math.random() * range) + min;
    }

    public static void main(String[] args) {

        // Create nouns and adj's arrays
        String[] adjs = new String[10];
        String[] nouns = new String[10];

        // Add different adjectives to array
        adjs[0] = "Happy";
        adjs[1] = "Sad";
        adjs[2] = "Funny";
        adjs[3] = "Quick";
        adjs[4] = "Slow";
        adjs[5] = "Big";
        adjs[6] = "Nicer";
        adjs[7] = "Breakable";
        adjs[8] = "Gorgeous";
        adjs[9] = "Homeless";

        // Add different nouns to array
        nouns[0] = "Chair";
        nouns[1] = "Toilet";
        nouns[2] = "Car";
        nouns[3] = "Computer";
        nouns[4] = "Television";
        nouns[5] = "Cookie";
        nouns[6] = "Apple (food)";
        nouns[7] = "Strawberry";
        nouns[8] = "Donut";
        nouns[9] = "Rock";

        // Randomly generate a favorite movie
        System.out.println("Your server name is: " + adjs[randomNum(0,9)] + " " + nouns[randomNum(0,9)]);

    }


}
