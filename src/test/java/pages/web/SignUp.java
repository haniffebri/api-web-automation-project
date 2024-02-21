package pages.web;

import org.openqa.selenium.By;
import static helper.Utility.driver;
import static org.junit.Assert.assertFalse;

public class SignUp {

    By input_userName_signUp = By.id("sign-username");
    By input_password_signUp = By.id("sign-password");
    By button_signup = By.xpath("//button[@onclick='register()'][normalize-space()='Sign up']");
    By sign_up_popup = By.xpath("//div[@id='signInModal'] /child::div[@class='modal-dialog'] /child:: div[@class='modal-content']");
    By button_close_signup = By.xpath("//div[@id='signInModal']//button[@class='btn btn-secondary'][normalize-space()='Close']");
    By button_x_signup = By.xpath("//div[@id='signInModal']//span[@aria-hidden='true']");

    public void verifySignUpPopUp( ) {
        driver.findElement(sign_up_popup).isDisplayed();
    }

    public void inputUnregisUsername(String value) {
    driver.findElement(input_userName_signUp).sendKeys(value);
//    System.out.println(value);
    }

    public void inputUnregisPassword(String value) {
    driver.findElement(input_password_signUp).sendKeys(value);
//    System.out.println(value);
    }

    public void inputRegisteredSignupUsername(String value) {
        driver.findElement(input_userName_signUp).sendKeys(value);
//        System.out.println(value);
    }

    public void inputRegisteredSignupPassword(String value) {
        driver.findElement(input_password_signUp).sendKeys(value);
//        System.out.println(value);
    }

    public void clickSignUpButton(){
        driver.findElement(button_signup).click();
    }

    public void clickCloseSignUpButton(){
        driver.findElement(button_close_signup).click();
    }

    public void clickXSignUpButton(){
        driver.findElement(button_x_signup).click();
    }

    public void verifySignUpPopUpNotDisplayed( ) {
        assertFalse(driver.findElement(sign_up_popup).isDisplayed());
    }
}
