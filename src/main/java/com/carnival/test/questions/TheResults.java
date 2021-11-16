package com.carnival.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.carnival.test.userinterfaces.SelectCruiseTripUserInterfaces.LBL_RESULTS;

public class TheResults implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_RESULTS.resolveFor(actor).isPresent();
    }

    public static TheResults onThePage(){
        return new TheResults();
    }
}
