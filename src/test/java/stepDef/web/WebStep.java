package stepDef.web;

import helper.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.web.*;

import java.time.Duration;

public class WebStep {

    public WebStep() {
        this.homepage = new HomePage();
        this.signup = new SignUp();
        this.login = new Login();
        this.contact = new Contact();
        this.aboutUs = new AboutUs();
        this.cart = new Cart();
    }

    HomePage homepage;
    SignUp signup;
    Login login;
    Contact contact;
    AboutUs aboutUs;
    Cart cart;


    @Given("user is on home page")
    public void userIsOnStorePage() throws InterruptedException {
        homepage.goToStorePage();
        Thread.sleep(1000);
    }

    @And("user click menu Sign up")
    public void userClickMenuSignUp() {
        homepage.clickSignUpMenu();
    }

    @And("verify sign up menu pop-up will be displayed")
    public void verifySignUpMenuPopUpWillBeDisplayed() throws InterruptedException {
        signup.verifySignUpPopUp();
        Thread.sleep(1000);
    }

    @When("user input sign up username unregistered")
    public void userInputSignUpUsernameUnregistered() throws InterruptedException {
        String username = Utility.generateRandomData();
        signup.inputUnregisUsername(username);
        Thread.sleep(500);
    }

    @And("user input sign up password unregistered")
    public void userInputSignUpPasswordUnregistered() {
        String password = Utility.generateRandomData();
        signup.inputUnregisPassword(password);
    }

    @And("user click sign up button")
    public void userClickSignUpButton() {
        signup.clickSignUpButton();
    }

    @Then("verify the sign up pop-up is not displayed")
    public void verifyTheSignUpPopUpIsNotDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        signup.verifySignUpPopUpNotDisplayed();
    }

    @And("verify display alert message {string}")
    public void verifyDisplayAlertMessage(String alertMessage) throws InterruptedException {
        Thread.sleep(2000);
        homepage.verifyAlertMessage(alertMessage);
    }

    @When("user input sign up username {string}")
    public void userInputSignUpUsernameRegistered(String username) throws InterruptedException {
        signup.inputRegisteredSignupUsername(username);
        Thread.sleep(500);
    }

    @And("user input sign up password {string}")
    public void userInputSignUpPasswordRegistered(String password) {
        signup.inputRegisteredSignupPassword(password);
    }

    @When("user click close sign up button")
    public void userClickCloseSignUpButton() {
        signup.clickCloseSignUpButton();
    }

    @When("user click X sign up button")
    public void userClickSignUpXButton() {
        signup.clickXSignUpButton();
    }

    @Then("user back to home page")
    public void userBackToStorePage() {
        homepage.goToStorePage();
    }

    @And("user click menu log in")
    public void userClickMenulogin() {
        homepage.clickSignInMenu();
    }

    @And("verify login menu pop-up will be displayed")
    public void verifyLoginMenuPopUpWillBeDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        login.verifyLoginPopUp();
    }

    @When("user input log in username {string}")
    public void userInputloginUsername(String loginusername) throws InterruptedException {
        Thread.sleep(1000);
        login.inputLoginUsername(loginusername);
    }

    @And("user input log in password {string}")
    public void userInputloginPassword(String loginpassword) {
        login.inputLoginPassword(loginpassword);
    }

    @And("user click log in button")
    public void userClickloginButton() {
        login.clickLoginButton();
    }

    @And("user click close login button")
    public void userClickCloseLoginButton() throws InterruptedException {
        Thread.sleep(1000);
        login.clickCloseLoginButton();
    }

    @And("user click X login button")
    public void userClickXLoginButton() {
        login.clickXLoginButton();
    }

    @Then("verify the login pop-up is not displayed")
    public void verifyTheLoginPopUpIsNotDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        login.verifyLoginPopUpNotDisplayed();
    }

    @Then("validation user has been logged in {string}")
    public void validationUserLoggedIn(String name) {
        homepage.verifyUserLoggedIn(name);
    }

    @And("user has been logged in")
    public void userHasBeenLoggedIn() throws InterruptedException {
        userClickMenulogin();
        verifyLoginMenuPopUpWillBeDisplayed();
        userInputloginUsername("kucingnjir");
        userInputloginPassword("kucing");
        userClickloginButton();
        Thread.sleep(2000);
    }

    @When("user click menu Log out")
    public void userClickMenuLogOut() throws InterruptedException {
        homepage.clickLogOutMenu();
    }

    @Then("user successfully logged out")
    public void userLogOutSuccessfull() throws InterruptedException {
        Thread.sleep(1000);
        homepage.logOutSuccess();
    }

    @And("user click menu contact")
    public void userClickMenuContact() throws InterruptedException {
        homepage.clickContactMenu();
    }

    @And("verify contact menu pop-up will be displayed")
    public void verifyContactMenuPopUpWillBeDisplayed() throws InterruptedException {
        contact.verifyContactPopUp();
        Thread.sleep(2000);
    }

    @When("user input Contact Email {string}")
    public void userInputContactEmail(String email) {
        contact.inputContactEmail(email);
    }

    @And("user input Contact Name {string}")
    public void userInputContactName(String name) {
        contact.inputContactName(name);
    }

    @And("user input Message {string}")
    public void userInputMessage(String message) {
        contact.inputMessage(message);
    }

    @And("user click button Send Message")
    public void userClickButtonSendMessage() {
        contact.sendMesaggeButton();
    }

    @And("user click close button")
    public void userClickCloseButton() throws InterruptedException {
        Thread.sleep(1000);
        contact.closeContactButton();
    }

    @And("user click X contact button")
    public void userClickXContactButton() {
        contact.XContactButton();
    }

    @Then("verify the contact pop-up is not displayed")
    public void verifyTheContactPopUpIsNotDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        contact.verifyContactPopUpNotDisplayed();
    }

    @And("user click menu about us")
    public void userClickMenuAboutUs() {
        homepage.clickAboutUsMenu();
    }

    @And("verify about us menu pop-up will be displayed")
    public void verifyAboutUsMenuPopUpWillBeDisplayed() throws InterruptedException {
        aboutUs.verifyAboutUsPopUp();
        Thread.sleep(1000);
    }

    @When("user click button play video")
    public void userClickButtonPlayVideo() {
        aboutUs.playvideo();
    }

    @Then("verify the video is played")
    public void videoPlayedSuccessfully() throws InterruptedException {
        aboutUs.videoPlayedSuccessfully();
        Thread.sleep(1000);
    }

    @When("user click close about us button")
    public void userClickCloseAboutUsButton() throws InterruptedException {
        Thread.sleep(1000);
        aboutUs.closeAboutUsButton();
    }

    @When("user click x about us button")
    public void userClickXAboutUsButton() {
        aboutUs.XAboutUsButton();
    }

    @Then("verify the about us pop-up is not displayed")
    public void verifyTheAboutUsPopUpIsNotDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        aboutUs.verifyAboutUsPopUpNotDisplayed();
    }


    @When("user click Phones category")
    public void userClickPhonesCategory() throws InterruptedException {
        Thread.sleep(1000);
        homepage.clickPhonesCategories();
    }

    @When("user click Laptops category")
    public void userClickLaptopsCategory() throws InterruptedException {
        Thread.sleep(1000);
        homepage.clickLaptopsCategories();
    }

    @When("user click Monitors category")
    public void userClickMonitorsCategory() throws InterruptedException {
        Thread.sleep(1000);
        homepage.clickMonitorsCategories();
    }

    @Then("user can see one of the products {string}")
    public void userSeeOneOfProducts(String itemName) throws InterruptedException {
        Thread.sleep(2000);
        homepage.verifyUserSeeOneOfProducts(itemName);
    }

    @And("user click product {string}")
    public void userClickProduct(String nameProduct) {
        homepage.clickProduct(nameProduct);

        WebDriverWait wait = new WebDriverWait(Utility.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-success.btn-lg")));
    }

    @And("user click add to cart")
    public void userClickAddToCart() throws InterruptedException {
        Thread.sleep(1000);
        cart.clickButtonAddCart();
    }

    @And("user go to cart menu")
    public void userClickMenuCart() throws InterruptedException {
        homepage.menucart();
        Thread.sleep(1000);
    }

    @And("verify product should be added in the cart page {string}")
    public void productShouldBeAddedInTheCartPage(String itemAddedName) throws InterruptedException {
        cart.verifyProductAddedToCart(itemAddedName);
        Thread.sleep(2000);
    }

    @And("user click delete button for {string}")
    public void userClickDeleteButtonSpecificItem(String productToBeDeleted) throws InterruptedException {
        cart.deleteProductButton(productToBeDeleted);
        Thread.sleep(2000);
    }

    @Then("product successfully deleted from cart")
    public void productSuccessfullyDeletedFromCart() throws InterruptedException {
        Thread.sleep(2000);
        cart.verifyProductDeleted();
    }

    @And("verify user can see total price")
    public void userCanSeeTotalPrice() {
        cart.verifyTotalPrice();
    }

    @And("user click place order button")
    public void userClickPlaceOrderButton() {
        cart.placeOrderButton();
    }

    @When("user click close place order button")
    public void userClickClosePlaceOrderButton() throws InterruptedException {
        Thread.sleep(1000);
        cart.closePopUpOrderButton();
    }

    @When("user click X place order button")
    public void userClickXPlaceOrderButton() throws InterruptedException {
        Thread.sleep(1000);
        cart.XPopUpOrderButton();
    }

    @And("verify order form pop-up will be displayed")
    public void verifyOrderFormPopUpWillBeDisplayed() throws InterruptedException {
        cart.verifyOrderFormPopUp();
        Thread.sleep(1000);
    }

    @Then("verify order form pop-up is not displayed")
    public void verifyOrderFormPopUpIsNotDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        cart.verifyOrderPopUpNotDisplayed();
    }

    @And("user input name {string}")
    public void userInputName(String name) throws InterruptedException {
        cart.inputNameForm(name);
        Thread.sleep(300);
    }

    @And("user input country {string}")
    public void userInputCountry(String country) throws InterruptedException {
        cart.inputCountryForm(country);
        Thread.sleep(300);
    }

    @And("user input city {string}")
    public void userInputCity(String city) throws InterruptedException {
        cart.inputCityForm(city);
        Thread.sleep(300);
    }

    @And("user input credit card {string}")
    public void userInputCreditCard(String creditcard) throws InterruptedException {
        cart.inputCreditCardForm(creditcard);
        Thread.sleep(300);
    }

    @And("user input month {string}")
    public void userInputMonth(String month) throws InterruptedException {
        cart.inputMonthForm(month);
        Thread.sleep(300);
    }

    @And("user input year {string}")
    public void userInputYear(String year) throws InterruptedException {
        cart.inputYearForm(year);
        Thread.sleep(300);
    }

    @And("user click purchase button")
    public void userClickPurchaseButton() {
        cart.clickPurchaseButton();
    }

    @Then("user see the pop-up successfully order")
    public void userSeeThePopUpSuccessfullyOfOrder() throws InterruptedException {
        cart.verifyPopUpSuccessfullyOrder();
        Thread.sleep(1000);
    }

    @And("user click OK button on the pop-up successfully order")
    public void userClickOKButtonOnThePopUpConfirmation() {
        cart.clickOkButtonSuccessOrder();
    }
}
