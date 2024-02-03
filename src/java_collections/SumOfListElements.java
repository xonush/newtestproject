package java_collections;

import java.util.ArrayList;
import java.util.List;

public class SumOfListElements {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

        int total=0;
        for(int number:numbers){
            total += number;

        }
        System.out.println(total);
    }
}
