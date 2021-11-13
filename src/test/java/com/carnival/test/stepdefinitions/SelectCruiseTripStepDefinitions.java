package com.carnival.test.stepdefinitions;

import com.carnival.test.tasks.OpenURL;
import com.carnival.test.tasks.SelectCruiseTrip;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static com.carnival.test.utils.Constants.PAGE_URL;
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

    @When("^he selects the trip (.*) cruises and duration (.*)$")
    public void HeSelectsTheTripCruisesAndDuration(String trip, String duration) {
        theActorInTheSpotlight().attemptsTo(SelectCruiseTrip.onThePage(trip, duration));
    }

    @Then("^validate the sentence (.*)$")
    public void validateTheSentence(String answer) {
        //  theActorInTheSpotlight().should(seeThat(ValidateAnswer.exist(), is(answer)));
//TheAnswer.fromBot
    }
}
