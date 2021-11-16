package com.carnival.test.tasks;

import com.carnival.test.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import static com.carnival.test.userinterfaces.SelectCruiseTripUserInterfaces.BTN_PRICING;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class SelectPrice implements Task {

    WebDriver driver;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_PRICING, isPresent()),
                Click.on(BTN_PRICING)
        );

        driver = getProxiedDriver();
        WebElement e = driver.findElement(By.xpath("//span[@class='rz-bar-wrapper']//following::span[@ng-style='minPointerStyle']"));
        actor.attemptsTo(Wait.seconds(6));
        Actions move = new Actions(driver);
        actor.attemptsTo(Wait.seconds(6));
        Action action = (Action) move.dragAndDropBy(e, 250, 0).build();
        action.perform();
        actor.attemptsTo(Wait.seconds(6));

        WebElement e1 = driver.findElement(By.xpath("//span[@class='rz-bar-wrapper']//following::span[@ng-style='maxPointerStyle']"));
        actor.attemptsTo(Wait.seconds(6));
        Actions move1 = new Actions(driver);
        actor.attemptsTo(Wait.seconds(6));
        Action action1 = (Action) move1.dragAndDropBy(e1, -100, 0).build();
        action1.perform();
        actor.attemptsTo(Wait.seconds(6));

    }

    public static SelectPrice onThePage() {
        return Tasks.instrumented(SelectPrice.class);
    }
}
