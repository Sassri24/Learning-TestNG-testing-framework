package testNG.DataProvider;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {


    @DataProvider
    public Object[][] getData(){
        Object[][] data={
                {"chamod@gmail.com","chamod123"},
                {"def@gmail.com","chamod123"},
                {"xyz@gmail.com","xyz123"}
        };
        return data;
    }
}
