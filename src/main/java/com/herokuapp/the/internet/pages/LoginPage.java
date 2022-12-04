package com.herokuapp.the.internet.pages;

import com.herokuapp.the.internet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By usernameField= By.id("username");
    By passwordField= By.id("password");
    By loginButton= By.xpath("//i[contains(text(),'Login')]");
    By verifyMessage= By.xpath("//h2[normalize-space()='Secure Area']");
    By usernameErrorMessage= By.xpath("//div[@id='flash']");
    By passwordErrorMessage= By.xpath("//div[@class = 'flash error']");


    public void enterUsername(String text){
        sendTextToElement(usernameField, text);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getTextVerify(){
        return getTextFromElement(verifyMessage);
    }
    public String getUsernameErrorVerify(){
        return getTextFromElement(usernameErrorMessage);
    }
    public String getPasswordErrorVerify(){
        return getTextFromElement(passwordErrorMessage);
    }
}
