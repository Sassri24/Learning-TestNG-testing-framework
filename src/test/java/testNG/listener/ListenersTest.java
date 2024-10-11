package testNG.listener;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)

public class ListenersTest {

    @Test
    public void test1(){
        System.out.println("I am in inside test method 01");
    }

    @Test
    public void test2(){
        System.out.println("I am in inside test method 02");
    }

    @Test
    public void test3(){
        System.out.println("I am in inside test method 03");
    }

    @Test
    public void test4(){
        System.out.println("I am in inside test method 04");
    }
}
