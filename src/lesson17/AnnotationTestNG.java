package lesson17;


import org.testng.annotations.*;

public class AnnotationTestNG extends CommonStuff {

    @Test(groups = {"Smoke","Ui","DB"})
    public void test1(){
        System.out.println("Test1");
    }
    @Test
    public void test2(){
        System.out.println("Test2");
    }


}
