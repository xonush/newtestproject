package lesson6;

public class Class {
    //Attributes (adjective)=fields
    String name="Explorer";


    //Static keyword-
    static String os="iOS";
    static double maxSpeed=10;
    String color;
    double weight;
    int batteryLifeMins;
    final static double PI=3.14;// Final variables can't be updated.
    //Behavior (verb/actions)
    void speak() {
        System.out.println("Hi, i am robot is " + name);

    }
    void move(int x, int y) {
        System.out.println("Going to location " + x + ":" +y);
        System.out.println("Travelling at a speed of "+ maxSpeed);
    }

}
