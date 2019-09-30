package Hashmaps;

import java.util.HashMap;

public class hashmappz {
    // Hashmaps are like objects with key value pairs.
    // No indexing and no order.

    public static void main(String[] args) {

        // Defines a new hashmap with the key datatype of long and value datatype of string
        HashMap<Long, String> users = new HashMap<>();

        users.put(1L, "apple");
        users.put(2L, "cookie");

        // .get shows the value in the hashmap
        System.out.println("users.get(1L) = " + users.get(1L));
        System.out.println("users.get(2L) = " + users.get(2L));

        // .getOrDefault(key) - Gets you value or gives you the default (key) value that you set.
        System.out.println("users.getOrDefault() = " + users.getOrDefault(3L, "No exisiting user."));

        // .containsValue - checks the hashmap and returns a boolean
//        users.containsKey(key);
//        users.containsValue(value);

        // .put(key , value) replaces the value

        // .putIfAbsent(key, value) replaces the value if it's absent, if not it will not do anything.

        // Can only loop thru keys or value, but not both.
        for (Long k: users.keySet()) {
            System.out.println("key = " + k);
        }

        // .remove(key) removes the key and value pair

        System.out.println(users.size());

    }

}
