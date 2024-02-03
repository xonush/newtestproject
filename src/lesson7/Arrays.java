package lesson7;

public class Arrays {
    public static void main (String []args){

        String car1 = "BMW";
        String car2 = "Mercedez";
        String car3 = "Audi";

        String car1000="Nexia";
        //Array=Object
        String[] cars={"BMW","Mercedez","Audi","Nexia"};

        //Syntax:
        //1.Type[] arrName={value1,value2,....}
        //2.Type[] arrName = new Type[10]

        String [] students = new String [10];
        System.out.println(students[5]);
        students[5]="Josh";
        System.out.println(students[5]);
        System.out.println(cars[2]);






    }
}
