package org.example.pages;

import org.example.StepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_login {


    //elements
    //1.login
    By username_field=By.id("user-name");
    By  password_field=By.id("password");
    By  login_button=By.id("login-button");
    //actions
    //1.login
    public WebElement loginButton(){
        return Hooks.driver.findElement((login_button));
    }
    //username
    public WebElement username(){
        return Hooks.driver.findElement( username_field);
    }

    //password
    public WebElement password(){
        return Hooks.driver.findElement(password_field);
    }
}
