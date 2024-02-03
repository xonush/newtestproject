package java_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {

        // Create two sets of integers
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(4);
        set1.add(6);
        set1.add(8);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(8);
        set2.add(10);
        set2.add(12);

        ArrayList<Integer> arrayList = new ArrayList<>(set1);
        ArrayList<Integer> arrayList2 = new ArrayList<>(set2);
        arrayList.addAll(arrayList2);
        System.out.println(arrayList);

        int total = 0;
        for (int x : arrayList) {
            total += x;
        }
        System.out.println(total);

        set1.retainAll(set2);
//        set1.addAll(set2);
        System.out.println(set1);


    }


}
