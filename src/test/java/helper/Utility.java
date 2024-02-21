package helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.File;
import java.time.Duration;

public class Utility {

    public static WebDriver driver;

    public static File getJSONSchemaFile(String JSONFile){
        return new File("src/test/java/helper/JSONSchema/" + JSONFile);
    }

    public static String generateRandomData() {
        String data = RandomStringUtils.randomAlphanumeric(8);
        return data;
    }

    public static String generateRandomEmail() {
        String email;
        String temp = RandomStringUtils.randomAlphanumeric(10);
        email = temp + "@testdata.com";
        return email;
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void startDriver() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
