package testNG.listener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class ListenersTestWithErrors {

    @Test
    public void test1(){
        System.out.println("I am in inside test method 01");
    }

    @Test
    public void test2(){
        System.out.println("I am in inside test method 02");
        Assert.assertTrue(false);
    }

    @Test(timeOut = 1000)
    public void test3() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("I am in inside test method 03");
    }

    @Test(dependsOnMethods = "test3")
    public void test4(){
        System.out.println("I am in inside test method 04");
    }
}
