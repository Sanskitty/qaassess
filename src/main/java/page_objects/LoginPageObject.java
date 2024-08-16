package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import generic_keywords.WebElementInteractions;

public class LoginPageObject extends WebElementInteractions

{
    private final By userNameTextField = By.id("user-name");
    private final By passwordTextField = By.id("password");

    private final By loginBtn = By.id("login-button");

    public LoginPageObject(WebDriver driver)
    {
        super(driver);
    }

    public ProductPageObject userLogin(String username, String password)
    {
        goToApplication("https://www.saucedemo.com/");
        //Thread.sleep(1000);
        sendText(userNameTextField, username);
        //Thread.sleep(1000);
        sendText(passwordTextField, password);
        //Thread.sleep(1000);
        clickElement(loginBtn);
        //Thread.sleep(1000);
        return new ProductPageObject(driver);

    }

}
