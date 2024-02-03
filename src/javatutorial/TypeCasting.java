package javatutorial;

public class TypeCasting {
    public static void main(String args[]){

        int myInt = 18;
        double myDouble  = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        double doublevalue = 17.0d;
        int intvalue = (int) doublevalue;

        System.out.println(doublevalue);
        System.out.println(intvalue );

        char charVar = '$';
        char eurosign ='\u00A5';
        System.out.println(eurosign  + " " + 45);

        String lastname = "Sadullaeva";
        String firstname = "Khonzoda";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

    }
}
