package lesson5;


public class MethodsChallenge {
    public static void main(String args[]) {
        //1-answer
        int x = 89;
        int y = 79;
        int z = 69;
        findSmallestNumber(x, y, z);


        //2-answer

        double total = average(27.0d, 3.0d, 6.0d);
        System.out.println(total);
        System.out.println(isVowel('a'));


    }

    public static void findSmallestNumber(int x, int y, int z) {
        if (x <= y && x <= z) {
            System.out.println(x + " is smallest number");
        } else if (y <= x && y <= z) {
            System.out.println(y + " is smallest number");
        } else if (z <= y && z <= x)
            System.out.println(z + " is smallest number");
    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;


    }
    //3-answer

    public static int getTotal(int a, int b) {
        return a + b;
    }

    //4-answer
    public static boolean isVowel(char value) {
        // String stringVal = "" + value;
        // stringVal = stringVal.toLowerCase();
        // stringVal = stringVal.toUpperCase();

        if (value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u' || value == 'A' || value == 'E' || value == 'I' || value == 'O' || value == 'U') {
            return true;
        } else {
            return false;
        }



    }

    //5-answer
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }
}










