package page_tests;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import page_objects.LoginPageObject;
import page_objects.ProductPageObject;

public class LoginPageTest extends BaseTest
{
     LoginPageObject loginPageObject;
     ProductPageObject productPageObject;

    private static final Logger logger = LogManager.getLogger(LoginPageTest.class);

    @Test
    public void userLoginTest() throws InterruptedException 
    {
        String username = "standard_user";
        String password = "secret_sauce";
        loginPageObject = new LoginPageObject(driver);
        productPageObject = loginPageObject.userLogin(username, password);
        logger.info("Username is:" + username + "password is:" + password);
        System.out.println(productPageObject.getTitleOfPage());
    }

    @Test
    public void InvaliduserLoginTest() throws InterruptedException 
    {
        String username = "locked_out_user";
        String password = "secret_sauce";
        loginPageObject = new LoginPageObject(driver);
        productPageObject = loginPageObject.userLogin(username, password);
        logger.info("Username is:" + username + "password is:" + password);
        System.out.println(productPageObject.getTitleOfPage());
    }


}
