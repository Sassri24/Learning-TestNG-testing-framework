package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTest {

    //soft asset part
    SoftAssert softAssert=new SoftAssert();

    @Test(priority = 0)
    public void testSum(){
        int actualValueSum1 = ArithmeticOperator.calSum(10,10);
        System.out.println("Actual sum1 value is: "+actualValueSum1);
        softAssert.assertEquals(actualValueSum1,20,"Failed to cal sum1");

        int actualValueSum2= ArithmeticOperator.calSum(20,5);
        System.out.println("Actual sum2 value: is "+ actualValueSum2);
        softAssert.assertEquals(actualValueSum2,25,"Failed to cal sum 2");
        softAssert.assertAll();
    }

    //hard assert

    @Test(priority = 1)
    public void testSubtraction(){
        int actValueSubtraction1 = ArithmeticOperator.calSubtraction(10,5);
        System.out.println("Actual Subtraction value 1 is : "+actValueSubtraction1);
        Assert.assertEquals(actValueSubtraction1,5,"Failed to cal subtraction 1");

        int actValueSubstraction2 = ArithmeticOperator.calSubtraction(20,5);
        System.out.println("Actual Subtraction value 2 is : "+actValueSubstraction2);
        Assert.assertEquals(actValueSubstraction2,15,"Failed to cal subtraction 2");
    }
}
