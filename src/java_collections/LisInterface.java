package java_collections;

import jdk.internal.icu.text.UnicodeSet;
import org.openqa.selenium.json.JsonOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LisInterface {

    //List
    //ArrayList,LinkedList

    public static void main(String[] args) {

        ArrayList<String> arrayList =  new ArrayList<>();
        LinkedList<Dog> linkedList = new LinkedList<>();

        String[] array = {"abc","def"};

        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        System.out.println(arrayList);

        linkedList.add(new Dog("Rex",3));
        Dog dog1 =new Dog("Chappi",1);
        linkedList.add(dog1);
        System.out.println(linkedList);

        String name = linkedList.get(1).getName();
        System.out.println(name);

       // for(Dog dog : linkedList){
            //System.out.println("Name " + dog.getName());
          //  System.out.println("Age " +dog.getAge());



            LinkedList<Dog> linkedList2 = new LinkedList<Dog>();
            linkedList2.add(new Dog("Prince",4));
            linkedList.addAll(linkedList2);

            Collections.sort(linkedList, Comparator.comparing(Dog::getName));
        for(int i = 0; i<linkedList.size(); i++){
            System.out.println("Name " + linkedList.get(i).getName());
            System.out.println("Age " + linkedList.get(i).getAge());
        }
        }
    }




