package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.core.StringStartsWith.startsWith;

public class AssertionTest {

//    String name = "Chamod";
//
//    @Test
//    public void valuesEqualCheck(){
//        if(name.equals("Chamod")){
//            System.out.println("Name is equal");
//        }else{
//            System.out.println("Name is not equal");
//        }
//    }

    String actualValue= "chamod";

    @Test(priority =0)
    public void valuesEqualCheck(){
        String expectedValue = "chamod";
        System.out.println("Prior to valuesEqualCheck assertion");
        Assert.assertEquals(actualValue,expectedValue,"Values miss matched");
        System.out.println("After valuesEqualCheck assertion");
    }
    @Test(priority =1)
    public void valuesNotEqualCheck(){
        String expectedValue = "Learn Well";
        System.out.println("Prior to valuesNotEqualCheck assertion");
        Assert.assertEquals(actualValue,expectedValue,"Values matched");
        System.out.println("After valuesNotEqualCheck assertion");
    }
    @Test(priority =2)
    public void trueConditionCheck(){
        System.out.println("Prior to trueConditionCheck assertion");
        Assert.assertTrue(actualValue.startsWith("H"),"Condition return a False");
        System.out.println("After trueConditionCheck assertion");
    }
    @Test(priority =3)
    public void falseConditionCheck(){
        System.out.println("Prior to falseConditionCheck assertion");
        Assert.assertTrue(actualValue.isBlank(),"Condition return a True");
        System.out.println("After trueConditionCheck assertion");
    }
}
