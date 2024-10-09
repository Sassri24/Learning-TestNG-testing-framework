package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;
import testNG.DataProvider.CustomDataProvider;

public class ArithmeticOperatorDataProviderTest {

    @Test(dataProvider = "setOfData")
    public void testSum(int input1, int input2,int expectedOutPut){
        Assert.assertEquals(ArithmeticOperator.calSum(input1,input2),expectedOutPut,"Failed to cal sum");
    }

    @DataProvider(name ="setOfData")
    public Object[][] getData(){
        Object[][] data={
                {0,1,1},
                {2,4,6},
                {3,8,11},
                {1,5,6}
        };
        return data;
    }
}
