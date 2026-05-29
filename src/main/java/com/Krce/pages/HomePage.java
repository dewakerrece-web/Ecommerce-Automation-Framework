package com.Krce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    // Locators
    private By loginSignupLink = By.xpath("//a[@href='/login']");
    private By loggedInUsername = By.xpath("//a[contains(text(),' Logged in as')]");
    private By logoutLink = By.xpath("//a[@href='/logout']");

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void clickLoginSignup() {
        driver.findElement(loginSignupLink).click();
    }

    public boolean isLoggedIn() {
        return driver.findElement(loggedInUsername).isDisplayed();
    }

    public void clickLogout() {
        driver.findElement(logoutLink).click();
    }
}