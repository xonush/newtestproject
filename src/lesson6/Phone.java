package lesson6;

public class Phone {
    //Attributes
    String color;
    int releaseYear;
    int batterLife;
    String model;
    double price;
    String os;
    int memory;
    //Consructor
    public Phone() {}

    public Phone(String model){
        this.model=model;
    }


    //Behavior
        void ring() {

        System.out.println("Ringing...");
        }
        void alarm() {
        System.out.println("Time to wake up");

    }
        void call (String number ) {
         System.out.println("Dialing ..."+number);

     }
        void sendText(String number,String text){

          System.out.println("Sending message to"+number);
         System.out.println("Message: " + text);
     }
    }
