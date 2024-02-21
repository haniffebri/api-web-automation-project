package pages.web;

import org.openqa.selenium.By;
import static helper.Utility.driver;
import static org.junit.Assert.assertFalse;

public class Login {

    By login_popup = By.xpath("//div[@id='logInModal'] /child::div[@class='modal-dialog'] /child:: div[@class='modal-content']");
    By input_userName_login = By.id("loginusername");
    By input_password_login = By.id("loginpassword");
    By button_login = By.xpath("//button[@onclick='logIn()' and text()='Log in']");
    By button_close_login = By.xpath("//div[@id='logInModal']//button[@class='btn btn-secondary'][normalize-space()='Close']");
    By button_x_login = By.xpath("//div[@id='logInModal']//span[@aria-hidden='true']");


    public void verifyLoginPopUp( ) {
        driver.findElement(login_popup).isDisplayed();
    }

    public void inputLoginUsername(String value) {
    driver.findElement(input_userName_login).sendKeys(value);
//    System.out.println(value);
    }

    public void inputLoginPassword(String value) {
    driver.findElement(input_password_login).sendKeys(value);
//    System.out.println(value);
    }

    public void clickLoginButton(){
    driver.findElement(button_login).click();
    }

    public void clickCloseLoginButton(){
        driver.findElement(button_close_login).click();
    }

    public void clickXLoginButton(){
        driver.findElement(button_x_login).click();
    }

    public void verifyLoginPopUpNotDisplayed( ) {
        assertFalse(driver.findElement(login_popup).isDisplayed());
    }
}