package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static helper.Utility.generateRandomEmail;

public class Models {

    private static RequestSpecification request;
    public static void setupHeaders() {
        request = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("app-id", "65bdd752f8e09e1010d3749b");
    }

    public static Response getSpecificUser(String endpoint) {
        setupHeaders();
        return request.when().get(endpoint);
    }
    public static Response postCreateUser(String endpoint) {
        String title = "mr";
        String fname = "Hanif";
        String lname = "bzir";
        String picture = "https://media.licdn.com/dms/image/D5603AQFnfdgSBKfmLQ/profile-displayphoto-shrink_800_800/0/1705580443889?e=2147483647&v=beta&t=dkMR_OixHqr-JDtJUKSlQ7YRg08mrAR06RKRjeq9MJo";
        String gender = "male";
        String email = generateRandomEmail();
        String dateOfBirth = "2002-02-06";
        String phone = "089089089089";
        String location_street = "indo";
        String location_city = "indoo";
        String location_state = "indooo";
        String location_country = "indoooo";
        String location_timezone = "+07";
        JSONObject payload = new JSONObject();
        payload.put("title", title);
        payload.put("firstName", fname);
        payload.put("lastName", lname);
        payload.put("picture", picture);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("dateOfBirth", dateOfBirth);
        payload.put("phone", phone);
        JSONObject location = payload.put("location", new JSONObject()
                .put("street", location_street)
                .put("city", location_city)
                .put("state", location_state)
                .put("country", location_country)
                .put("timezone", location_timezone));

        setupHeaders();
        String finalEndpoint = endpoint + "/create";
        return request.body(payload.toString()).when().post(finalEndpoint);

    }
    public static Response updateUser(String endpoint, String userId) {
        setupHeaders();

        String title = "mr";
        String fname = "edit";
        String lname = "lah";
        String picture = "https://media.licdn.com/dms/image/D5603AQFnfdgSBKfmLQ/profile-displayphoto-shrink_800_800/0/1705580443889?e=2147483647&v=beta&t=dkMR_OixHqr-JDtJUKSlQ7YRg08mrAR06RKRjeq9MJo";
        String gender = "male";
        String email = generateRandomEmail();
        String dateOfBirth = "2002-02-06";
        String phone = "089089089089";
        String location_street = "indo";
        String location_city = "indoo";
        String location_state = "indooo";
        String location_country = "indoooo";
        String location_timezone = "+07";
        JSONObject payload = new JSONObject();
        payload.put("title", title);
        payload.put("firstName", fname);
        payload.put("lastName", lname);
        payload.put("picture", picture);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("dateOfBirth", dateOfBirth);
        payload.put("phone", phone);
        JSONObject location = payload.put("location", new JSONObject()
                .put("street", location_street)
                .put("city", location_city)
                .put("state", location_state)
                .put("country", location_country)
                .put("timezone", location_timezone));

        String finalEndpoint = endpoint + "/" + userId;
//        System.out.println(finalEndpoint);
        return request.body(payload.toString()).when().put(finalEndpoint);

    }
    public static Response deleteUser(String endpoint, String userId) {
        setupHeaders();
        String finalEndpoint = endpoint + "/" + userId;
//        System.out.println(finalEndpoint);
        return request.when().delete(finalEndpoint);
    }
    public static Response getListTag(String endpoint){
        setupHeaders();
        return request.when().get(endpoint);
    }
}
