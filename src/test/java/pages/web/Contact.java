package pages.web;

import org.openqa.selenium.By;
import static helper.Utility.driver;
import static org.junit.Assert.assertFalse;

public class Contact {

    By contact_popup = By.xpath("//div[@id='exampleModal'] /child::div[@class='modal-dialog'] /child:: div[@class='modal-content']");
    By input_contact_email = By.id("recipient-email");
    By input_contact_name = By.id("recipient-name");
    By input_message = By.id("message-text");
    By button_send_message = By.xpath("//button[@onclick='send()' and text()='Send message']");
    By button_close_contact = By.xpath("//div[@id='exampleModal']//button[@class='btn btn-secondary'][normalize-space()='Close']");
    By button_x_contact = By.xpath("//div[@id='exampleModal']//span[@aria-hidden='true']");


    public void verifyContactPopUp( ) {
        driver.findElement(contact_popup).isDisplayed();
    }

    public void inputContactEmail(String value) {
        driver.findElement(input_contact_email).sendKeys(value);
        System.out.println(value);
    }
    public void inputContactName(String value) {
        driver.findElement(input_contact_name).sendKeys(value);
        System.out.println(value);
    }
    public void inputMessage(String value) {
        driver.findElement(input_message).sendKeys(value);
        System.out.println(value);
    }
    public void sendMesaggeButton(){
        driver.findElement(button_send_message).click();
    }

    public void closeContactButton(){
        driver.findElement(button_close_contact).click();
    }

    public void XContactButton(){
        driver.findElement(button_x_contact).click();
    }

    public void verifyContactPopUpNotDisplayed( ) {
        assertFalse(driver.findElement(contact_popup).isDisplayed());
    }
}
