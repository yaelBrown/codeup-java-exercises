import util.WrongFavoritePerson;

public class FavoritePerson {

    public static void main(String[] args) {
        String favPerson;
        Boolean equalsYael = null;

        do {
            System.out.println("Who is your favorite person?");
            favPerson = util.Input.sc.nextLine();
            try {
                System.out.println("favPerson = " + favPerson);
                equalsYael = favPerson.equalsIgnoreCase("Yael");
                if (!equalsYael) {
                    WrongFavoritePerson customException;
                    customException = new WrongFavoritePerson(favPerson);
                    throw customException;
                }
            } catch (Exception e) {
                System.out.println("Wrong person entered! ");
                e.printStackTrace();
            }
        } while (!equalsYael);

    }

}