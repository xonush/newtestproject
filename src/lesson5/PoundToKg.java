package lesson5;

public class PoundToKg {
    public static void main(String args []){

        double result = calcFeetAndInchesToCentimeters(4,2);
        System.out.println(result);
        System.out.println(calcFeetAndInchesToCentimeters(25));
        System.out.println(calcFeetAndInchesToCentimeters(-25));
        System.out.println(calcFeetAndInchesToCentimeters(0));
        System.out.println(calcFeetAndInchesToCentimeters(25, 11));
        System.out.println(calcFeetAndInchesToCentimeters(11, 25));
        System.out.println(calcFeetAndInchesToCentimeters(5, 11));
        System.out.println(calcFeetAndInchesToCentimeters(-5, 0));
        System.out.println(calcFeetAndInchesToCentimeters(3, -7));

    }
    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if (feet<0 || inches<0 || inches>12){
            return -1;
        }

        double totalInches=feet*12+inches;
        double centimeters=totalInches*2.54;
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0){
            return -1;
        }
        double feet=(int) (inches/12);
        double remainingInches=inches%12;
        return calcFeetAndInchesToCentimeters(feet,remainingInches);

    }


}
