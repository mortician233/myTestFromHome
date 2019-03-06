package com.homework;


import com.homework.LoginPage.LoginData;
import com.homework.LoginPage.ObjectLogInPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest extends AbstractPage {
    private ChromeOptions options = null;


    @BeforeClass
    public void initData() {
        System.setProperty("webdriver.chrome.driver",
                "lib/chromedriver.exe");

    }

    @Test()
    public void testCaseChrome01() throws InterruptedException {
        driver = new ChromeDriver();
        getUrl("https://www.shipovalov.net/login_page.php");
        LoginData loginData = new LoginData("student", "luxoft");
        ObjectLogInPage objectLogInPage = new ObjectLogInPage(driver, loginData);
        Assert.assertTrue(objectLogInPage.logInPage());
        Thread.sleep(7000);

    }

    @AfterClass
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}
