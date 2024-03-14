package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
    @Given("Addplace payload")
    public void addplace_payload() {
        System.out.println("this is payload");
    }
    @When("User calls {string} API with POST http request")
    public void user_calls_api_with_post_http_request(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the API call is sucess")
    public void the_api_call_is_sucess() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("{string} in resoponse is {string}")
    public void in_resoponse_is(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
