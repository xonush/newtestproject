package lesson14;

public class Truck extends Vehicle {

        String capasity;
        final String name = "Truck";


        @Override
        public void makeSound(){
                super.makeSound();
                System.out.println("Truck sound");
                System.out.println("name: " + super.name);

        }




}
