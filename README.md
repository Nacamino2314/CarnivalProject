# CarnivalProject
This artifact is a functional test automation project to search for a cruise trip.

# Content
+ List of Feature, Scenario and Test Cases
+ Software dependencies
+ Automation architecture
+ Automation execution

# List of Feature, Scenario and Test Cases
+ Feature @user-story-one -_This tests that it allows to search for cruises and allows to use the price filter. 
  Note: The second and third acceptance criteria are executed in the same way so the page does not have another option to sort by price. In the manual test this third criterion is   failed.
  
+ Feature @user-story-two -_This scenario verifies that you can view the cruise itinerary and display the booking option.

# Software dependencies 
+ The automation project is built with GRADLE.
+ Serenity version is 2.0.17
+ Version of cucumber is 1.9.20

# Automation architecture 
The automation is realized with Serenity Y with the layers recommended by the Screenplay pattern, tests are handled controlled by the BDD behavior. To the method proposed in the StepDefinitions the information must be sent from the feature so that it can fulfill the required search.

# Execution of the automation 
To run the automation and generate the test report, the following commands must be used:

gradle clean test aggregate --info. It allows executing all the Runner classes created.

gradle clean test --tests=SelectCruiseTripRunner aggregate --info. Allows to run a specific Runner class

gradle clean test -Dcucumber.options="--tags @user-story-one" --info or gradle clean test -Dcucumber.options="--tags @user-story-two" --info. Allows to execute a specific tag.

# Report
Serenity generates an evidence report in the Target folder named index.html.



