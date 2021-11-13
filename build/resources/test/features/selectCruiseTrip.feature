Feature: As a user I want select cruise trip

  @user-story-one
  Scenario Outline: Search cruises on the page correctly
    Given he goes to the page
    When  he selects the trip <trip> cruises and duration <duration>
#    Then he should see the results
#    When  he filters by price


    Examples:
      | trip        | duration   |
      | The Bahamas | 6 - 9 Days |