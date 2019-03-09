package com.homework;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ObjectPage {


    public WebDriver driver = null;


    public void getUrl(String Url) {
        driver.navigate().to(Url);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);

    }

    @FindBy(name = "username")
    private WebElement loginTxt;

    @FindBy(name = "password")
    private WebElement passwordTxt;

    @FindBy(xpath = "//*[.='Report Issue']")
    private WebElement reportIssue;

    @FindBy(name = "category_id")
    private WebElement selectedType;

    @FindBy(className = "button")
    private WebElement submite;

    @FindBy(xpath = "//*[@class='menu']/*[.='Logout']")
    private WebElement logout;

    @FindBy(name = "summary")
    private WebElement summary;

    @FindBy(name = "description")
    private WebElement description;

    @FindBy(xpath = "//*[@name='category_id']/*[.='someCategory']")
    private WebElement categorySomeCategory;


    public void createFieldForm(ProjectData projectData) {
        reportIssue.click();
        categorySomeCategory.click();
        summary.sendKeys(projectData.getSummary());
        description.sendKeys(projectData.getDescriprion());
        submite.click();
    }

    public void logIn(UserData userData) {
        loginTxt.sendKeys(userData.getLogin());
        passwordTxt.sendKeys(userData.getPassword());
        submite.click();
    }

    public void logOut() {
        logout.click();
    }
}
