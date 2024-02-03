package lesson18;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingDataProvider {
    @Test(dataProvider = "user-credentials",dataProviderClass = DataSets.class)
    public void testUsingDataProvider(String username,String password){
        System.out.println("Username " + username);
        System.out.println("Password "+ password);

    }



}
