package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnTest {
    @Test()
    public void oLevel(){
        System.out.println("O/l");
        Assert.fail(); //fail the test case by myself
    }
    @Test(dependsOnMethods="oLevel")
    public  void aLevel(){
        System.out.println("A/l");
    }
    @Test(dependsOnMethods = {"oLevel","aLevel"},alwaysRun = true)
    public void campus(){
        System.out.println("Campus");
    }
}
