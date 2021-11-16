package com.carnival.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.carnival.test.userinterfaces.SelectCruiseTripUserInterfaces.BTN_BOOK_NOW;

public class TheOptionToBookNow implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return BTN_BOOK_NOW.resolveFor(actor).isPresent();
    }

    public static TheOptionToBookNow onThePage(){
        return new TheOptionToBookNow();
    }
}
