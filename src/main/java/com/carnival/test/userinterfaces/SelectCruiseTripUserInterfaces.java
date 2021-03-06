package com.carnival.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectCruiseTripUserInterfaces {

    private SelectCruiseTripUserInterfaces() {
    }

    public static final Target BTN_POP_UP = Target.the(" pop up button").located(By.id("cookie-consent-btn"));
    public static final Target BTN_POP_UP2 = Target.the(" pop up two button").locatedBy(("//span[@class='vifp-sweeps-modal-close']"));
    public static final Target BTN_SAIL_TO = Target.the(" sail to button").located(By.id("cdc-destinations"));
    public static final Target BTN_OPTIONS = Target.the(" options sail to and duration buttons").locatedBy("//button[@class='cdc-filter-button ng-binding' and contains(text(),'{0}')]");
    public static final Target BTN_DURATION = Target.the(" duration button").located(By.id("cdc-durations"));
    public static final Target BTN_SEARCH_CRUISES = Target.the(" search cruises button").locatedBy("//li[@class='cdc-filters-tab cdc-filters-tab--searchcta ng-scope']");
    public static final Target LBL_RESULTS = Target.the(" label of the results").locatedBy("//span[@class='sbsc-container__result-count ng-binding']");

    public static final Target BTN_PRICING = Target.the(" pricing button").located(By.id("sfn-nav-pricing"));
    public static final Target LBL_PRICE = Target.the(" label of the price").locatedBy("(//span[@class='vrl-item__price-value ng-binding'])[1]");

    public static final Target BTN_ITINERARY = Target.the("itinerary button").locatedBy("(//a[@class='vrl-item__learn-more'])[1]");
    public static final Target BTN_ITINERARY_PAGE = Target.the("itinerary button of the page").locatedBy("//p[contains(text(),'{0}')]//ancestor::button[@class='about-cta']");
    public static final Target BTN_BOOK_NOW = Target.the("book now button").located(By.id("sm-booking-btn"));

}
