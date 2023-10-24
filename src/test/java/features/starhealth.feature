Feature: Phase End Project

  Background: 
    Given User open the Chrome browser and starhealth application

  @training
  Scenario: Starhealth HomePage test
    Then validates the star Health home page title using a Junnit assertion
    Then clicks on the Buy Now button
    And User enters following details in page
      | FullName | PhNo       | PIN   |
      | Siva     | 8114489203 | 53564 |
    And Close the browser

  @simplilearn
  Scenario: Plan Page
    Then User click on the Plan for My Family page
    And Validate the user mobile number
    And User clicks on the Star Health logo symbol
    And Close the browser
