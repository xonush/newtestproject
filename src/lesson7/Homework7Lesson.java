package lesson7;

public class Homework7Lesson {
    public static void  main (String []args){

        for (int i =1;i<5;i++){
            for(int j=1;j<=i;j++)
            {System.out.println(" ");}
            System.out.println(" ");

        }
       //3
       int number=3;
        for(int i=1; i<=number; i++){
            for(int j=1;j<=i;j++)
                for(int k=1;k<=j;k++)
                  //  counter++;
           System.out.println(  );
           // System.out.println(counter);
        }

        //1
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
        //5
        for(int i=1; i<=25; i=i+2){
            System.out.println(i);
        }
        //4
        int counter=0;
         for(int i=0; i<=100;i++){
             if (i% 3==0 && i%7==0)


            System.out.println(i);
              }

         //2
        int sum = 0;
        for(int i=1; i<=10;i++ ){

         sum += i;
        }

        System.out.println(sum);








    }
}
