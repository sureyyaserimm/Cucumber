package TestingProject_6.Utilities;

import io.cucumber.java.After;

public class Utilities {
    @After
    public void after(){
        System.out.println("Senaryo bitti");

        BaseDriver.quitDriver();
    }
}
