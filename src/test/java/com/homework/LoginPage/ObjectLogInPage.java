package com.homework.LoginPage;


import com.homework.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectLogInPage extends AbstractPage {

    LoginData loginData;

    public void setLoginData(LoginData loginData) {
        this.loginData = loginData;
    }

    public ObjectLogInPage(WebDriver driver, LoginData loginData) {
        this.driver = driver;
        this.loginData = loginData;

        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    private WebElement loginTxt;

    @FindBy(name = "password")
    private WebElement passwordTxt;

    @FindBy(className = "button")
    private WebElement loginBtn;


    public boolean logInPage() {
        loginTxt.sendKeys(loginData.getLogin());
        passwordTxt.sendKeys(loginData.getPassword());
        loginBtn.click();
        return true;
    }

}
