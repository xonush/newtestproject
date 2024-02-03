package java_collections;

import java.util.HashMap;

public class MapInterface {
    public static void main(String args []){

        HashMap<String,Integer> studentGrades = new HashMap<>();
        studentGrades.put("Omar",98);
        studentGrades.put("Musa",90);
        studentGrades.put("Khonzoda",86);
        System.out.println(studentGrades.get("Omar"));
        System.out.println(studentGrades);

        for(String key: studentGrades.keySet()){
            if(key.equals("Omar")){
                System.out.println(studentGrades.get(key));

            }
            System.out.println("====");
        }


    }




}
