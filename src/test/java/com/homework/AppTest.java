package com.homework;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest extends AbstractPage {

    private ChromeOptions options = null;


    @BeforeClass
    public void initData() {
        System.setProperty("webdriver.chrome.driver",
                "lib/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test()
    public void testCreateForm() {
        getUrl("https://www.shipovalov.net/login_page.php");
        logIn(new UserData("student", "luxoft"));
        createFieldForm(new ProjectData("Autotest OK", "Autotest OK"));
        logOut();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}
