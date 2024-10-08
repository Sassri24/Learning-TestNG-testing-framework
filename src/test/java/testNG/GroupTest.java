package testNG;

import org.testng.annotations.Test;

public class GroupTest {
    //S= smoke testing
    //R= regression testing

    @Test
    public void test01(){
        System.out.println("This is Smoke and Regression test case");
    }
    @Test
    public void test02(){
        System.out.println("This is Regression test case");
    }
    @Test
    public void test03(){
        System.out.println("This is Not Smoke or Regression");
    }
    @Test
    public void test04(){
        System.out.println("This is Smoke test case");
    }
    @Test
    public void test05(){
        System.out.println("This is Smoke and Regression test case");
    }
}
