package com.herokuapp.the.internet.testsuite;

import com.herokuapp.the.internet.pages.LoginPage;
import com.herokuapp.the.internet.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedText = "Secure Area";
        String actualText = loginPage.getTextVerify();
        Assert.assertEquals(actualText, expectedText, "Text not displayed");

    }
    @Test
    public void verifyTheUsernameErrorMessage(){
        loginPage.enterUsername("tomsmith1");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedText = "Your username is invalid!\n"  +
                "×";
        String actualText = loginPage.getUsernameErrorVerify();
        Assert.assertEquals(actualText, expectedText, "Text not displayed");

    }
    @Test
    public void verifyThePasswordErrorMessage(){
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expectedText = "Your password is invalid!\n" +
                "×";
        String actualText = loginPage.getPasswordErrorVerify();
        Assert.assertEquals(actualText, expectedText, "Text not displayed");

    }

}
