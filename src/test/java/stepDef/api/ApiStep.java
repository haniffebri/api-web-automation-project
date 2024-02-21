package stepDef.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.api.ApiPage;

public class ApiStep {
    ApiPage apiPage;

    public ApiStep() {
        this.apiPage = new ApiPage();
    }
    @Given("prepare url for {string}")
    public void prepareUrlFor(String url) {
        apiPage.prepareUrlFor(url);
    }

    @When("hit api get specific user")
    public void hitApiGetSpecificUser() {
        apiPage.hitApiGetSpecificUser();
    }

    @Then("validation status code is equals {int}")
    public void validationStatusCodeIsEquals(int status_code) {
        apiPage.validationStatusCode(status_code);

    }

    @And("validation response body get specific user")
    public void validationResponseBodyGetSpecificUser() {
        apiPage.validationResponseBodyGetSpecificUser();
    }

    @And("validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String filename) {
        apiPage.validateResponseJSONSchema(filename);
    }

    @When("hit api post create new user")
    public void hitApiPostCreateUser() {
        apiPage.hitApiPostCreateUser();
    }

    @And("validation response body post create new user")
    public void validationResponseBodyPostCreateUser() {
        apiPage.validationResponseBodyPostCreateUser();
    }

    @And("hit api update data")
    public void hitApiUpdateData() {
        apiPage.hitUpdateUser();
    }

    @And("hit api delete new user")
    public void hitApiDeleteNewUser() {
        apiPage.hitDeleteUser();
    }

    @And("validation response body update user")
    public void validationResponseBodyUpdateUser() {
        apiPage.validationResponseBodyUpdateUser();
    }

    @And("validation response body delete user")
    public void validationResponseBodyDeleteUser() {
        apiPage.validationResponseBodyDeleteUser();
    }

    @When("hit api get list tag")
    public void hitApiGetListTag() {
        apiPage.hitApiGetListTag();
    }

    @And("validation response body get list tag")
    public void validationResponseBodyGetListTag() {
        apiPage.validationResponseBodyGetListTag();
    }
}
