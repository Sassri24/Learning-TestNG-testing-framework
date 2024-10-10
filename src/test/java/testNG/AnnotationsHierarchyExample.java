package testNG;

import org.testng.annotations.*;

public class AnnotationsHierarchyExample {
    @Test
    public void test01() {
        System.out.println("I am Test01");
    }

    @Test
    public void test02() {
        System.out.println("I am Test02");
    }
    @Test
    public void test03() {
        System.out.println("I am Test03");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I am before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("I am after Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("I am before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("I am after class");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("I am after Test");
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
