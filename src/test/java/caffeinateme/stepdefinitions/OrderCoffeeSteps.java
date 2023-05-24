package caffeinateme.stepdefinitions;

import caffeinateme.Barista;
import caffeinateme.Customer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class OrderCoffeeSteps {
    Customer cathy = new Customer();
    Barista barry = new Barista();
    String cathysOrder;

    //Essential RegExs:                             //Cucumber expressions:
    // (.*) Matches anything (including nothing)    // {int} whole numbers
    // (.+) Matches a non-empty string              // {float} decimal numbers
    // (\\d) Matches a digit                        // {string} a string surrounded by quotes: "test"
    // (\\d*) Matches zero or more digits           // {word} a string with no spaces
    // (\\d+) Matches one or more digits            // (...) indicates optional text: metre(s)
    // (\\w) Matches any "word" character           // "/" indicates a list of possible variations: "he/she/they"
    // (\\s) Matches any blank character            // {order-status} Custom expressions: name = "order-status"


    @Given("^(.*) is (\\d+) meters? from the coffee shop$")
    public void cathy_is_n_meters_from_the_coffee_shop(String name, Integer distanceInMeters) {
        cathy.setDistanceFromShop(distanceInMeters);
    }
    @When("^Cathy (?:orders|has ordered) a (small|regular|large) (.*)$")
    public void cathy_orders_a(String size, String order) {
        cathysOrder = order;
        cathy.placesOrderFor(cathysOrder);
    }
    @Then("^Barry should receive the order$")
    public void barry_should_receive_the_order() {
        assertThat(barry.getPendingOrders(), hasItem(cathysOrder));
    }
    @Then("^Barry should know that the coffee is Urgent$")
    public void barry_should_know_that_the_coffee_is_urgent() {
        assertThat(barry.getUrgentOrders(), hasItem(cathysOrder));
    }

}
