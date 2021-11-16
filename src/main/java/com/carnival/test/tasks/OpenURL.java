package com.carnival.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenURL implements Task {

    private String URL;

    public OpenURL(String URL) {
        this.URL = URL;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(URL));
    }

    public static OpenURL onPage(String url ){
        return Tasks.instrumented(OpenURL.class,url);
    }
}
