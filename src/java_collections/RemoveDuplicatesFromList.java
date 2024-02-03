package java_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        // Create a list with duplicate elements
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(5);
        numbers.add(15);
        numbers.add(20);
        numbers.add(10);

        // Remove duplicates from the list
        HashSet<Integer> hashSet = new HashSet<>(numbers);
//        Collections.copy(numbers, hashSet);
        System.out.println(hashSet);

    }
}
