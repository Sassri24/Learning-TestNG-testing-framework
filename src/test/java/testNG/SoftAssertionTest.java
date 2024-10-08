package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest {

    SoftAssert softAssert=new SoftAssert();  // we have to create object,because softAssert is Non-Static class.Also softAssert extends Assertion class
    String actualValue= "chamod";

    @Test(priority =0)
    public void valuesEqualCheck(){
        String expectedValue = "chamod123"; //this should be failed
        System.out.println("Prior to valuesEqualCheck assertion");
        softAssert.assertEquals(actualValue,expectedValue,"Values miss matched");
        System.out.println("After valuesEqualCheck assertion");
        softAssert.assertAll();
    }
    @Test(priority =1)
    public void valuesNotEqualCheck(){
        String expectedValue = "Learn Well";
        System.out.println("Prior to valuesNotEqualCheck assertion");
        softAssert.assertNotEquals(actualValue,expectedValue,"Values matched");
        System.out.println("After valuesNotEqualCheck assertion");
    }
    @Test(priority =2)
    public void trueConditionCheck(){
        System.out.println("Prior to trueConditionCheck assertion");
        softAssert.assertTrue(actualValue.startsWith("c"),"Condition return a False");
        System.out.println("After trueConditionCheck assertion");
    }
    @Test(priority =3)
    public void falseConditionCheck(){
        System.out.println("Prior to falseConditionCheck assertion");
        softAssert.assertFalse(actualValue.isBlank(),"Condition return a True");
        System.out.println("After trueConditionCheck assertion");
    }
}
