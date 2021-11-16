Feature: As a user I want select cruise trip

  @user-story-one
  Scenario Outline: Search cruises on the page correctly
    Given he goes to the page
    When  he selects the trip <trip> cruises and duration <duration>
    Then he should see the results
    When  he filters by price
    Then he should see the prices of the trip


    Examples:
      | trip        | duration   |
      | The Bahamas | 6 - 9 Days |

  @user-story-two
  Scenario Outline: Search itinerary on the page correctly
    Given he goes to the page
    When  he selects the trip <trip> cruises and duration <duration>
    When  he selects the itinerary <itinerary>
    Then he should see the option to book now

    Examples:
      | trip        | duration   | itinerary |
      | The Bahamas | 6 - 9 Days | Day 3     |