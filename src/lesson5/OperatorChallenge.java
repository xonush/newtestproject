package lesson5;

public class OperatorChallenge {
    public static void main (String args []){

        double myFirstVar = 20.00d;
        double mySecondVar = 80.00d;
        double total = (myFirstVar+mySecondVar)*100.00d;
        System.out.println("total = " + total);

        double theRemainder = total % 40.00d;
        System.out.println(theRemainder);
        boolean booleanVar = (theRemainder == 0) ? true:false;
        System.out.println(booleanVar);
        if (!booleanVar) {
            System.out.println("Got some remainder");

        }


    }
}
