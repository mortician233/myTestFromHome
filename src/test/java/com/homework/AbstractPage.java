package com.homework;


import com.homework.LoginPage.ObjectLogInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AbstractPage {

    ObjectLogInPage objectLogInPage;

    public WebDriver driver = null;
    public WebElement webElement = null;


    public void getUrl(String Url) throws InterruptedException {
        driver.navigate().to(Url);

    }


}
