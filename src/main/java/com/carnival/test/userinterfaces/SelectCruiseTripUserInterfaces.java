package com.carnival.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectCruiseTripUserInterfaces {

    private SelectCruiseTripUserInterfaces() {
    }

    public static final Target BTN_POP_UP = Target.the(" pop up button").located(By.id("cookie-consent-btn"));
    public static final Target BTN_POP_UP2 = Target.the(" pop up two button").locatedBy(("//span[@class='vifp-sweeps-modal-close']"));
    public static final Target BTN_SAIL_TO = Target.the(" sail to button").located(By.id("cdc-destinations"));
    public static final Target BTN_OPTIONS = Target.the(" options sail to and duration buttons").locatedBy(("//button[@class='cdc-filter-button ng-binding' and contains(text(),'{0}')]"));
    public static final Target BTN_DURATION = Target.the(" duration button").located(By.id("cdc-durations"));
    public static final Target BTN_SEARCH_CRUISES = Target.the(" search cruises button").locatedBy(("//li[@class='cdc-filters-tab cdc-filters-tab--searchcta ng-scope']"));

}
