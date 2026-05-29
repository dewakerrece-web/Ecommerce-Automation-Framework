package com.Krce.tests;

import com.Krce.base.BaseTest;
import com.Krce.pages.HomePage;
import com.Krce.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void verifyValidLogin() {
        HomePage homePage = new HomePage(driver);
        homePage.clickLoginSignup();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("dewaker.r.ece@gmail.com", "Dewa@2005!");

        Assert.assertTrue(homePage.isLoggedIn(), "User should be logged in!");
        System.out.println("Valid login test passed!");
    }

    @Test
    public void verifyInvalidLogin() {
        HomePage homePage = new HomePage(driver);
        homePage.clickLoginSignup();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("wrong@email.com", "wrongpassword");

        Assert.assertTrue(loginPage.isErrorMessageDisplayed(),
                "Error message should appear for invalid login!");
        System.out.println("Invalid login test passed!");
    }
}