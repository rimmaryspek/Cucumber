Feature: Add Employee
  @sprint3 @regression
  Scenario:
    Given user is navigated to HRMS application
    When user enters valid username and valid password
    And user clicks on login button
    Then user is successfully logged in
    When user click on PIM option
    And user clicks on Add Employee button
    And user enter firstname and lastname
    And user click on save button
    Then employee added successfully