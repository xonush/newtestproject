package lesson6;

public class Dog {
    //Attributes(adjective)-variable
    String eyeColor;
    String name;
    String furColor;
    double height;
    int speed;

    //Behavior(verb)-method
    public void bark(){
        System.out.println("Woof woof");
    }
    public void jump(){
        System.out.println("jumping");
    }
    public void run(){
        System.out.println("Running at the speed of " + speed + "m/ph");
    }
}
