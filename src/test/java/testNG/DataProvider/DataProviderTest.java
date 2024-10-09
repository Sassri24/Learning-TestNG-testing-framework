package testNG.DataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderTest {

    public void loginTest(String name,String pass){
        System.out.println(name+" "+pass);
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data={
                {"chamod@gmail.com","chaod123"},
                {"def@gmail.com","chaod123"},
                {"xyz@gmail.com","xyz123"}
        };
        return  data;
    }
}
