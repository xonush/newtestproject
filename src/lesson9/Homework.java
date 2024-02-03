package lesson9;

public class Homework {
    public static void main(String[] args) {
        //1-answer
        String name = "Xonzoda";

        int length = name.length();
        int midIndex = length / 2;
        System.out.println(name.charAt(midIndex));
        //2-answer
        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            char currentChar = name.charAt(i);
            if (currentChar == 'a' || currentChar == 'i' || currentChar == 'u' ||
                    currentChar == 'e' || currentChar == 'o') {
                counter++;
            }
        }
        System.out.println("There are " + counter + " vowels in the string " + name);

        //3-answer
        int a = 987653;
        int sum = 0;

        while (a > 0) {
            int remainder = a % 10;
            sum = sum + remainder;
            a = a / 10;
        }

        System.out.println("sum of integers= " + sum);

        //5-answer
        int whether = 23;
        if (whether > 0) {
            System.out.println(whether + " is positive whether");

          } else if (whether < 0) {
            System.out.println(whether + " is negetive whether");
        }
        //6-answer
        int number = 7;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        //7-answer
        String charAt;
        //8-answer
        // str1+str1
        // str1.concat(str2);


        //9-answer

        }
}
