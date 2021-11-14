package com.carnival.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.carnival.test.userinterfaces.SelectCruiseTripUserInterfaces.LBL_PRICE;


public class ThePrice implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_PRICE.resolveFor(actor).isPresent();
    }

    public static ThePrice onThePage(){
        return new ThePrice();
    }
}
