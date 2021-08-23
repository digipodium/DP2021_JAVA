package collections_n_generics;

import java.util.HashMap;
import java.util.Map;

public class Example2 {
    public static void main(String[] args) {
        Map<String, Dog> dogs = new HashMap<>();

        dogs.put("Tommy", new Dog("indian", "red", "stray", 3));
        dogs.put("Sam", new Dog("bulldog", "gray", "pet", 4));
        // keep on adding items
        int size = dogs.size();
        Dog sam = dogs.get("Sam");
        Dog moti = dogs.get("moti");
        System.out.println(size);
        System.out.println(sam);
        System.out.println(moti);
    }
}
