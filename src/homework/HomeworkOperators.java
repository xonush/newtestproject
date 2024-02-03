package homework;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

public class HomeworkOperators {
    public static void main(String args[]) {
        //1-answer
        int whether = 23;
        if (whether > 0) {
            System.out.println(whether + " is positive whether");

        } else if (whether < 0) {
            System.out.println(whether + " is negetive whether");
        }


        //2-answer
        int number = 7;
        if (number <= 10) {
            System.out.println("the number belongs to the first 10 natural numbers");
        } else {
            System.out.println("This number is outside the range");
        }
        //3-answer
        int myMark=97;
        if(myMark>85 && myMark<=100){
            System.out.println("A");
        }else if (myMark>71 && myMark<=85){
            System.out.println("B");
        }else if (myMark>55 && myMark<=71) {
            System.out.println("C");
        }else {
            System.out.println("D");
        }
        //4-answer
        int a = 4;
        int b = 7;
        int c = 9;

        if (a <= b && a <= c) {
            System.out.println(a + " is smallest number");
        } else if (b <= a && b <= c) {
            System.out.println(b + " is smallest number");
        } else if (c <= b && c <= a)
            System.out.println(c + " is smallest number");
        //5-answer
        int day = 3;
        if (day < 1 || day > 7) {
            System.out.println("Not weekday");
        } else if (day == 1) {
            System.out.println("This is Monday");
        } else if (day == 2) {
            System.out.println("This is Tuesday");
        } else if (day == 3) {
            System.out.println("This is Wednesday");
        } else if (day == 4) {
            System.out.println("This is Thursday");
        } else if (day == 5) {
            System.out.println("This is Friday");
        } else if (day == 6) {
            System.out.println("This is Saturday");
        } else if (day == 7) {
            System.out.println("This is Sunday");
        }
        //6-answer
        int month = 2;
        //31 days:1,3,5,7,8,10,12
        //30 days:4,6,9,11
        //28 days or 29 days: 2
        if (month < 1 || month > 12) {
            System.out.println("Not month day");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("This month has 30 days");
        } else if (month == 2) {
            System.out.println("This month has 28 or 29 days");
        } else {
            System.out.println("This  month has 31 days");
        }
        //7-answer

    }

    public static void isLeapYear( int year){
        boolean isLeapYear=true;
        int counter=2100;
        for(int i=0; i<=counter;i++){
            if (i% 4==0 && i%100==0 && i%400==0)


                System.out.println(i);
        }

        System.out.println(isLeapYear);
    }
}





