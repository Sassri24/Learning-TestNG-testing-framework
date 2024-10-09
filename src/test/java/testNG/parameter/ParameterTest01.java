package testNG.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest01 {

    @Test
    @Parameters({"val1","val2"})
    public void Sum(int v1,int v2){
        int finalsum = v1+v2;
        System.out.println("The final sum of the given value is "+finalsum);

    }
}
