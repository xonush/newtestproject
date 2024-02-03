package lesson5;



public class RewatchLesson3 {
    public static void main(String args[]){
        int a=5;
        int b=++a;
        System.out.println(b);
        b--;
        --b;
        System.out.println(b);

        
        //challenge methods
        //1-answer
        int x = 4;
        int y = 7;
        int z = 9;
        if (x <= y && x <= z) {
            System.out.println(x + " is smallest number");
        } else if (y <= x && y <= z) {
            System.out.println(y + " is smallest number");
        } else if (z <= y && z <= x)
            System.out.println(z + " is smallest number");
        //2 answer
        double total = average(27, 3, 6);
        System.out.println(total);
        System.out.println(isVowel('a'));
        int v=12;
        int n=4;
        total=sum(v,n);
        System.out.println(total);


    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;


    }
    //3-answer
    public static double sum(int a,int b){
            return 2*(a+b);
        }
//4-answer
    public static boolean isVowel(char value) {
        String temp = "" + value;
        temp = temp.toLowerCase();
        value = temp.charAt(0);
        if (value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u') {
            return true;
        } else {
            return false;
    }
        //5-answer


}}
