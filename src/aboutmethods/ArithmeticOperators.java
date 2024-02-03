package aboutmethods;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        //      double c=(double)a/b;
        int c = a /b;
        System.out.println(a+b);

        System.out.println(a*b);

        System.out.println(c);
        System.out.println(a%b);

        System.out.println(sum(134, 5767));

        System.out.println(subtract(27, 7));

        System.out.println(multiply(9, 2));
        double result = division(10, 3);

        System.out.println(result);
        a++;
        b--;
        System.out.println(a);
        System.out.println(b);
        int x = 5;
        double y= 2;
        System.out.println(x/y);

    }

    public static int sum(int j, int x) {
        return j + x;
    }

    public static int sum(int j, int x, int o) {
        return j + x + o;
    }

    public static int subtract(int j, int x) {
        return j - x;
    }

    public static int multiply(int j, int x) {
        return j * x;
    }

    public static double division(double j, double x) {
        return j / x;
    }
}
