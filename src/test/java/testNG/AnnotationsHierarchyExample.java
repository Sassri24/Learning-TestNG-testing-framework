package testNG;

import org.testng.annotations.*;

public class AnnotationsHierarchyExample {
    @Test
    public void test01() {
    }

    @BeforeMethod
    public void beforeMethod() {

    }

    @BeforeClass
    public void beforeClass() {

    }

    @AfterClass
    public void afterClass() {

    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("I am After Test");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I am before Suite");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("I am after Suite");
    }

}
