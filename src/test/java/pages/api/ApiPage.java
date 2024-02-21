package pages.api;

import helper.Endpoint;
import helper.Utility;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.File;

import static helper.Models.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiPage {

    String setURL, global_user_id = null;
    private static Response res;

    public void prepareUrlFor(String url) {
        switch (url) {
            case "specific_user":
                setURL = Endpoint.specific_user;
                break;
            case "modif_user":
                setURL = Endpoint.modif_user;
                break;
            case "tag_data":
                setURL = Endpoint.tag_data;
                break;
            default:
                System.out.println("input right url");
        }
    }

    public void hitApiGetSpecificUser() {
        res = getSpecificUser(setURL);
//        System.out.println(res.getBody().asString());
    }

    public void hitApiPostCreateUser() {
        res = postCreateUser(setURL);
//        System.out.println(res.getBody().asString());
    }

    public void validationStatusCode(int status_code) {
        assertThat(res.statusCode()).isEqualTo(status_code);
    }

    public void validationResponseBodyGetSpecificUser() {
        String title = res.jsonPath().getString("title");
        String firstName = res.jsonPath().getString("firstName");
        String lastName = res.jsonPath().getString("lastName");
        String picture = res.jsonPath().getString("picture");
        String gender = res.jsonPath().getString("gender");
        String email = res.jsonPath().getString("email");
        String dateOfBirth = res.jsonPath().getString("dateOfBirth");
        String phone = res.jsonPath().getString("phone");
        String registerDate = res.jsonPath().getString("registerDate");
        String updatedDate = res.jsonPath().getString("updatedDate");
        String location_street = res.jsonPath().getString("location.street");
        String location_city = res.jsonPath().getString("location.city ");
        String location_state = res.jsonPath().getString("location.state");
        String location_country = res.jsonPath().getString("location.country");
        String location_timezone = res.jsonPath().getString("location.timezone");

        assertThat(location_street).isNotNull();
        assertThat(location_city).isNotNull();
        assertThat(location_state).isNotNull();
        assertThat(location_country).isNotNull();
        assertThat(location_timezone).isNotNull();
        assertThat(title).isNotNull();
        assertThat(firstName).isNotNull();
        assertThat(lastName).isNotNull();
        assertThat(picture).isNotNull();
        assertThat(gender).isNotNull();
        assertThat(email).isNotNull();
        assertThat(dateOfBirth).isNotNull();
        assertThat(phone).isNotNull();
        assertThat(registerDate).isNotNull();
        assertThat(updatedDate).isNotNull();
    }

    public void validateResponseJSONSchema(String filename) {
        File JSONFile = Utility.getJSONSchemaFile(filename);
        res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JSONFile));
    }

    public void validationResponseBodyPostCreateUser() {

        JsonPath jsonPathEvaluator = res.jsonPath();
        String id = jsonPathEvaluator.get("id");
        String title = jsonPathEvaluator.get("title");
        String firstName = jsonPathEvaluator.get("firstName");
        String lastName = jsonPathEvaluator.get("lastName");
        String picture = jsonPathEvaluator.get("picture");
        String gender = jsonPathEvaluator.get("gender");
        String email = jsonPathEvaluator.get("email");
        String dateOfBirth = jsonPathEvaluator.get("dateOfBirth");
        String phone = jsonPathEvaluator.get("phone");
        String location_street = jsonPathEvaluator.get("location.street");
        String location_city = jsonPathEvaluator.get("location.city ");
        String location_state = jsonPathEvaluator.get("location.state");
        String location_country = jsonPathEvaluator.get("location.country");
        String location_timezone = jsonPathEvaluator.get("location.timezone");
        String registerDate = jsonPathEvaluator.get("registerDate");
        String updatedDate = jsonPathEvaluator.get("updatedDate");

        assertThat(id).isNotNull();
        assertThat(title).isNotNull();
        assertThat(firstName).isNotNull();
        assertThat(lastName).isNotNull();
        assertThat(picture).isNotNull();
        assertThat(gender).isNotNull();
        assertThat(email).isNotNull();
        assertThat(dateOfBirth).isNotNull();
        assertThat(phone).isNotNull();
        assertThat(location_street).isNotNull();
        assertThat(location_city).isNotNull();
        assertThat(location_state).isNotNull();
        assertThat(location_country).isNotNull();
        assertThat(location_timezone).isNotNull();
        assertThat(registerDate).isNotNull();
        assertThat(updatedDate).isNotNull();

        global_user_id = id;
    }

    public void hitUpdateUser() {
        res = updateUser(setURL, global_user_id);
    }

    public void validationResponseBodyUpdateUser() {
        JsonPath jsonPathEvaluator = res.jsonPath();
        String id = jsonPathEvaluator.get("id");
        String title = jsonPathEvaluator.get("title");
        String firstName = jsonPathEvaluator.get("firstName");
        String lastName = jsonPathEvaluator.get("lastName");
        String picture = jsonPathEvaluator.get("picture");
        String gender = jsonPathEvaluator.get("gender");
        String email = jsonPathEvaluator.get("email");
        String dateOfBirth = jsonPathEvaluator.get("dateOfBirth");
        String phone = jsonPathEvaluator.get("phone");
        String location_street = jsonPathEvaluator.get("location.street");
        String location_city = jsonPathEvaluator.get("location.city ");
        String location_state = jsonPathEvaluator.get("location.state");
        String location_country = jsonPathEvaluator.get("location.country");
        String location_timezone = jsonPathEvaluator.get("location.timezone");
        String registerDate = jsonPathEvaluator.get("registerDate");
        String updatedDate = jsonPathEvaluator.get("updatedDate");

        assertThat(id).isNotNull();
        assertThat(title).isNotNull();
        assertThat(firstName).isNotNull();
        assertThat(lastName).isNotNull();
        assertThat(picture).isNotNull();
        assertThat(gender).isNotNull();
        assertThat(email).isNotNull();
        assertThat(dateOfBirth).isNotNull();
        assertThat(phone).isNotNull();
        assertThat(location_street).isNotNull();
        assertThat(location_city).isNotNull();
        assertThat(location_state).isNotNull();
        assertThat(location_country).isNotNull();
        assertThat(location_timezone).isNotNull();
        assertThat(registerDate).isNotNull();
        assertThat(updatedDate).isNotNull();

//        System.out.println(res.getBody().asString());
    }

    public void hitDeleteUser() {
        res = deleteUser(setURL, global_user_id);
    }

    public void validationResponseBodyDeleteUser() {
        JsonPath jsonPathEvaluator = res.jsonPath();
        String id = jsonPathEvaluator.get("id");

        assertThat(id).isNotNull();

//        System.out.println(res.getBody().asString());
    }

    public void hitApiGetListTag() {
        res = getListTag(setURL);
    }

    public void validationResponseBodyGetListTag() {
        res = getListTag(setURL);
        String data = res.jsonPath().getString("data");

        assertThat(data).isNotNull();
//        System.out.println(res.getBody().asString());
    }

}


