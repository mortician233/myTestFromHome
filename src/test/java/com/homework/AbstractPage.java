package com.homework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class AbstractPage {


    public WebDriver driver = null;
    public WebElement webElement = null;


    public void getUrl(String Url) {
        driver.navigate().to(Url);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

    }


    public void createFieldForm(ProjectData projectData) {
        driver.findElement(By.xpath("//*[.='Report Issue']")).click();
        driver.findElement(By.xpath("//*[@name='category_id']/*[@value=4]")).click();
        driver.findElement(By.name("summary")).sendKeys(projectData.getSummary());
        driver.findElement(By.name("description")).sendKeys(projectData.getDescriprion());
        driver.findElement(By.className("button")).click();
    }

    public void logIn(UserData userData) {
        driver.findElement(By.name("username")).sendKeys(userData.getLogin());
        driver.findElement(By.name("password")).sendKeys(userData.getPassword());
        driver.findElement(By.className("button")).click();
    }

    public void logOut() {
        driver.findElement(By.xpath("//*[@class='menu']/*[.='Logout']")).click();
    }
}
