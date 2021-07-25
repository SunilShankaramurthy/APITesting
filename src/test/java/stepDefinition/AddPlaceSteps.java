package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.AddPlace;
import resources.APIResources;
import resources.TestDataBuilder;
import resources.Utils;

import java.io.FileNotFoundException;

import static io.restassured.RestAssured.given;

public class AddPlaceSteps extends Utils {
    RequestSpecification reqSpec;
    RequestSpecification resSpec;
    Response response;
    TestDataBuilder data=new TestDataBuilder();
    @Given("Add Place Payload with {string}  {string} {string}")
    public void add_Place_Payload_with(String string, String string2, String string3) throws FileNotFoundException {
        // Write code here that turns the phrase above into concrete actions
        reqSpec= given().spec(Utils.requestSpecification())
                .body(data.AddPlacePlaytload());
//        throw new cucumber.api.PendingException();
    }

    @When("user calls {string} with {string} http request")
    public void user_calls_with_http_request(String resource, String method) {
        // Write code here that turns the phrase above into concrete actions
        APIResources resourcesAPI=APIResources.valueOf(resource);
        if (method.equalsIgnoreCase("POST"))
            response=reqSpec.when().post(resourcesAPI.getAPIResource());
        else
            response=reqSpec.when().get(resourcesAPI.getAPIResource());
     //   throw new cucumber.api.PendingException();
    }

    @Then("the API call got success with status code {int}")
    public void the_API_call_got_success_with_status_code(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

    @Then("{string} in response body is {string}")
    public void in_response_body_is(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
    //    throw new cucumber.api.PendingException();
    }

    @Then("verify place_Id created maps to {string} using {string}")
    public void verify_place_Id_created_maps_to_using(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
     //   throw new cucumber.api.PendingException();
    }

    @Given("DeletePlace Payload")
    public void deleteplace_Payload() {
        // Write code here that turns the phrase above into concrete actions
   //     throw new cucumber.api.PendingException();
    }


}
