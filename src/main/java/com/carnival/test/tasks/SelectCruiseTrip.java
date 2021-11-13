package com.carnival.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.carnival.test.userinterfaces.SelectCruiseTripUserInterfaces.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SelectCruiseTrip implements Task {

    private String trip;
    private String duration;

    public SelectCruiseTrip(String trip, String duration) {
        this.trip = trip;
        this.duration = duration;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_POP_UP2, isPresent()),
                Click.on(BTN_POP_UP2),
                WaitUntil.the(BTN_POP_UP, isPresent()),
                Click.on(BTN_POP_UP),
                WaitUntil.the(BTN_SAIL_TO, isPresent()),
                Click.on(BTN_SAIL_TO),
                Click.on(BTN_OPTIONS.of(trip)),
                Click.on(BTN_DURATION),
                Click.on(BTN_OPTIONS.of(duration)),
                Click.on(BTN_SEARCH_CRUISES)
        );
    }

    public static SelectCruiseTrip onThePage(String trip, String duration) {
        return Tasks.instrumented(SelectCruiseTrip.class, trip, duration);
    }
}
