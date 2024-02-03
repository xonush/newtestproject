package lesson18;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SomeOtherAttributes {

    @Test(priority = 4)
    public void testAttributes1(){
        System.out.println("test1");

    }
    @Test(dependsOnGroups = {"DB"})
    public void testAttributes4(){
        System.out.println("test4");

    }
    @Test(expectedExceptions = RuntimeException.class)
    public void testAttributes2() throws IOException {
        System.out.println("test2");
       throw new IOException("test2");

    }
    @Test(groups = {"DB"})
    public void testAttributes3(){
        System.out.println("test3");
        Assert.fail();

    }
}
