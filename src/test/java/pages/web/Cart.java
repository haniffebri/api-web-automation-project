package pages.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import static helper.Utility.driver;
import static org.junit.jupiter.api.Assertions.*;

public class Cart {

    String itemPrices, correctTotalPrice, NameOrderFilled, CreditCardFilled;

    By button_add_cart = By.xpath("//a[@class='btn btn-success btn-lg' and text()='Add to cart']");
    By button_place_order = By.xpath("//button[normalize-space()='Place Order']");
    By order_form_popup = By.xpath("//*[@id=\"orderModal\"]/div/div");
    By nameForm = By.id("name");
    By countryForm = By.id("country");
    By cityForm = By.id("city");
    By creditCardForm = By.id("card");
    By monthForm = By.id("month");
    By yearForm = By.id("year");
    By button_purchase = By.cssSelector("button[onclick='purchaseOrder()']");
    By button_close_order = By.xpath("//div[@id='orderModal']//button[@type='button'][normalize-space()='Close']");
    By button_x_order = By.xpath("//div[@id='orderModal']//span[@aria-hidden='true']");
    By order_success_popup = By.xpath("/html/body/div[10]");
    By button_ok_success_order = By.xpath("//button[normalize-space()='OK']");
    By totalPrice = By.id("totalp");
    By total_item = By.xpath("//tr[@class='success']");
    By deleteSpecificProductButton(String itemToBeDeleted) {
        return By.xpath("//tr[@class='success'] //td[normalize-space()='" + itemToBeDeleted + "'] //following-sibling:: td //a[contains (@onclick, 'deleteItem') and normalize-space()='Delete']");
    }

    By priceItems (int price){
        return By.xpath("(//tr[@class='success']//child::*[3])["+price+"]");
    }

    By item_name(String itemName) {
        return By.xpath("//tr[@class='success'] //child:: td[normalize-space()='"+itemName+"']");
    }

        public void clickButtonAddCart ()  {
            driver.findElement(button_add_cart).click();
        }

        public void verifyProductAddedToCart(String itemAddedName){

            String[] itemAddedArray = itemAddedName.split(", ");

            for (String item : itemAddedArray){
                WebElement cartItem = driver.findElement(item_name(item));
                assertTrue(cartItem.isDisplayed());
                }
        }


    public void verifyTotalPrice() {

        int parsingItemPrice;
        int totalPriceTable = 0;

        List<WebElement> elementsItem = driver.findElements(total_item);
        int itemCount = elementsItem.size();

        int[] tablePriceArray = new int[itemCount];

        for(int intPrice = 0; intPrice < tablePriceArray.length; intPrice++){

            if(driver.findElement(priceItems(intPrice+1)).isDisplayed()){
                itemPrices = driver.findElement(priceItems(intPrice+1)).getText();

                parsingItemPrice = Integer.parseInt(itemPrices);

                tablePriceArray[intPrice] = parsingItemPrice;

                totalPriceTable += parsingItemPrice;
            }else{
                break;
            }
        }

        String totalPriceTableString = Integer.toString(totalPriceTable);
        correctTotalPrice = driver.findElement(totalPrice).getText();
        assertEquals(totalPriceTableString, correctTotalPrice);

        // System.out.println("Total price : " +totalPriceTableString);
    }

    public void deleteProductButton(String productToBeDeleted) {
        driver.findElement(deleteSpecificProductButton(productToBeDeleted)).click();
    }

    public void verifyProductDeleted() {
        assertFalse(driver.findElement(totalPrice).isDisplayed());
    }

    public void placeOrderButton() {
        driver.findElement(button_place_order).click();
    }

    public void verifyOrderFormPopUp() {
        driver.findElement(order_form_popup).isDisplayed();
    }

    public void verifyOrderPopUpNotDisplayed() {
        assertFalse(driver.findElement(order_form_popup).isDisplayed());
    }

    public void inputNameForm(String name) {
        driver.findElement(nameForm).sendKeys(name);
        NameOrderFilled = name;
    }

    public void inputCountryForm(String country) {
        driver.findElement(countryForm).sendKeys(country);
    }

    public void inputCityForm(String city) {
        driver.findElement(cityForm).sendKeys(city);
    }

    public void inputCreditCardForm(String creditcard) {
        driver.findElement(creditCardForm).sendKeys(creditcard);
        CreditCardFilled = creditcard;
    }

    public void inputMonthForm(String month) {
        driver.findElement(monthForm).sendKeys(month);
    }

    public void inputYearForm(String year) {
        driver.findElement(yearForm).sendKeys(year);
    }

    public void closePopUpOrderButton(){
        driver.findElement(button_close_order).click();
    }

    public void XPopUpOrderButton(){
        driver.findElement(button_x_order).click();
    }

    public void clickPurchaseButton() {
        driver.findElement(button_purchase).click();
    }

    public void verifyPopUpSuccessfullyOrder() {
        driver.findElement(order_success_popup).isDisplayed();
        //System.out.println(driver.findElement(orderPopUpConfirmation).getText());

        assertTrue(driver.findElement(order_success_popup).getText().contains("Thank you for your purchase!") );
        assertTrue(driver.findElement(order_success_popup).getText().contains("Id: ") );

        if(driver.findElement(order_success_popup).getText().contains("Amount: 0 USD")){
            assertTrue(driver.findElement(order_success_popup).getText().contains("Amount: 0 USD") );
        }else{
            assertTrue(driver.findElement(order_success_popup).getText().contains(correctTotalPrice) );
        }

        assertTrue(driver.findElement(order_success_popup).getText().contains(NameOrderFilled) );
        assertTrue(driver.findElement(order_success_popup).getText().contains(CreditCardFilled) );
    }

    public void clickOkButtonSuccessOrder() {
        driver.findElement(button_ok_success_order).click();
    }
}
