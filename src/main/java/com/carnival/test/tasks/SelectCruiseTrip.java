package com.carnival.test.tasks;

import com.carnival.test.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAndHoldAction;
import org.openqa.selenium.interactions.MoveMouseAction;
import org.openqa.selenium.interactions.internal.MouseAction;

import static com.carnival.test.userinterfaces.SelectCruiseTripUserInterfaces.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class SelectCruiseTrip implements Task {

    private String trip;
    private String duration;
    private String month;

    public SelectCruiseTrip(String trip, String month, String duration) {
        this.trip = trip;
        this.month = month;
        this.duration = duration;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Check.whether(BTN_POP_UP2.resolveFor(actor).isVisible()).andIfSo(
                WaitUntil.the(BTN_POP_UP2, isPresent()),
                Click.on(BTN_POP_UP2)));

        actor.attemptsTo(WaitUntil.the(BTN_POP_UP, isPresent()),
                Click.on(BTN_POP_UP),
                WaitUntil.the(BTN_SAIL_TO, isPresent()),
                Click.on(BTN_SAIL_TO),
                Click.on(BTN_OPTIONS.of(trip)),
                Click.on(BTN_DURATION),
                Click.on(BTN_OPTIONS.of(duration)),
                Click.on(BTN_SEARCH_CRUISES),
                Wait.seconds(1)
        );

    }

    public static SelectCruiseTrip onThePage(String trip, String month, String duration) {
        return Tasks.instrumented(SelectCruiseTrip.class, trip, month, duration);
    }
}
