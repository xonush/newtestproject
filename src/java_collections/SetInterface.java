package java_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SetInterface {

    public static void main(String args[]){
        HashSet<String> hashSet = new HashSet<>();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Orange");
        arrayList.add("Banana");

        Collections.addAll(arrayList,"Grapes","Strawberry");
        System.out.println(arrayList);

        Collections.reverse(arrayList);
        System.out.println(arrayList);






    }
}
