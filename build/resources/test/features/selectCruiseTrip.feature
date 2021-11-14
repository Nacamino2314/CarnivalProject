Feature: As a user I want select cruise trip

  @user-story-one
  Scenario Outline: Search cruises on the page correctly
    Given he goes to the page
    When  he selects the trip <trip> cruises and month <month> and duration <duration>
    Then he should see the results
    When  he filters by price
    Then he should see the prices of the trip


    Examples:
      | trip        | month | duration   |
      | The Bahamas | Nov   | 6 - 9 Days |