package aboutmethods;

public class LogicalOperators {
    public static void main(String[] args){
        int age=31;
        double money=10200.34;
        boolean isTall=true;

        if (!(age<28 && money<=20000) || !isTall){
            System.out.println("will marry");
        }
        else{
            System.out.println("will not marry");

        }

        boolean sevamanmi = money > 10000 ? true : false;
        String sev = (age > 20 && age <=25) ? "Sevaman olaman" : "detskiy yoki qarri akan";

        System.out.println(sev);
    }
}
