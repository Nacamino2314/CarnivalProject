package com.carnival.test.stepdefinitions;

import com.carnival.test.questions.TheResults;
import com.carnival.test.tasks.OpenURL;
import com.carnival.test.tasks.SelectCruiseTrip;
import com.carnival.test.tasks.SelectPrice;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static com.carnival.test.utils.Constants.PAGE_URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SelectCruiseTripStepDefinitions {

    @Before
    public void PrepareScenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^he goes to the page$")
    public void HeGoesToThePage() {
        theActorCalled("The User").wasAbleTo(OpenURL.onPage(PAGE_URL));
    }

    @When("^he selects the trip (.*) cruises and month (.*) and duration (.*)$")
    public void HeSelectsTheTripCruisesAndDuration(String trip, String month, String duration) {
        theActorInTheSpotlight().attemptsTo(SelectCruiseTrip.onThePage(trip, month, duration));
    }

    @When("^he filters by price$")
    public void HeFiltersByPrice() {
        theActorInTheSpotlight().attemptsTo(SelectPrice.onThePage());
    }

    @Then("^he should see the results$")
    public void HeShouldSeeTheResults() {
          theActorInTheSpotlight().should(seeThat(TheResults.onThePage()));
    }

    @Then("^he should see the prices of the trip$")
    public void HeShouldSeeThePricesOfTheTrip() {
        theActorInTheSpotlight().should(seeThat(TheResults.onThePage()));
    }
}
