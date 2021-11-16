package com.carnival.test.tasks;

import com.carnival.test.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.carnival.test.userinterfaces.SelectCruiseTripUserInterfaces.BTN_ITINERARY;
import static com.carnival.test.userinterfaces.SelectCruiseTripUserInterfaces.BTN_ITINERARY_PAGE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SelectItinerary implements Task {

    private String itinerary;

    public SelectItinerary(String itinerary) {
        this.itinerary = itinerary;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_ITINERARY, isPresent()),
                Click.on(BTN_ITINERARY),
                Wait.seconds(6),
                Click.on(BTN_ITINERARY_PAGE.of(itinerary))
                );
    }

    public static SelectItinerary onThePage(String itinerary) {
        return Tasks.instrumented(SelectItinerary.class, itinerary);
    }
}
