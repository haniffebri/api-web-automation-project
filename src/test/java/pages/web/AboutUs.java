package pages.web;

import org.openqa.selenium.By;
import static helper.Utility.driver;
import static org.junit.Assert.assertFalse;

public class AboutUs {

    By aboutus_popup = By.xpath("//div[@id='videoModal'] /child::div[@class='modal-dialog'] /child:: div[@class='modal-content']");
    By button_play_video = By.xpath("//button[@title='Play Video']");
    By button_close_video = By.xpath("//div[@id='videoModal']//button[@class='btn btn-secondary'][normalize-space()='Close']");
    By video_played = By.xpath("//button[@class='vjs-play-control vjs-control vjs-button vjs-playing']");
    By button_x_aboutus = By.xpath("//div[@id='videoModal']//span[@aria-hidden='true']");

    public void verifyAboutUsPopUp( ) {
        driver.findElement(aboutus_popup).isDisplayed();
    }

    public void playvideo(){
        driver.findElement(button_play_video).click();
    }

    public void closeAboutUsButton(){
        driver.findElement(button_close_video).click();
    }

    public void XAboutUsButton(){
        driver.findElement(button_x_aboutus).click();
    }

    public void videoPlayedSuccessfully() {
        driver.findElement(video_played).isDisplayed();
    }

    public void verifyAboutUsPopUpNotDisplayed( ) {
        assertFalse(driver.findElement(aboutus_popup).isDisplayed());
    }
}