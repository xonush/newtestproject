package lesson6;

public class Horse {

    // attributes
       int age;
       boolean isFemale;
       String name;
       double weight;
       char nickname;


    //constructor
    public Horse() {}


    public Horse(int age, boolean isFemale, String name, double weight, char nickname) {
        this.age = age;
        this.isFemale = isFemale;
        this.name = name;
        this.weight = weight;
        this.nickname = nickname;
    }
    //behaviors - verb
    public void run() {
        // code
        System.out.println(name+" is running");
    }

    public void neigh(){
        System.out.println("Neigh neigh");
    }
    public void jump() {
        // code
        System.out.println(name+" is jumping");
    }
    public void printHorseInfo(){
        System.out.println("name" +this.name);
        System.out.println();
    }










}


