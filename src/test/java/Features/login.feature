Feature:  Customer Deposits and Withdraws amounts

  Scenario Outline: Test Case 1 -  Customer must be able to deposit an amount on their first account
    Given the user is on homepage
    When user clicks customer login button
    Then user clicks dropdown arrow
    And user selects a user name "Harry Potter"
    Then user clicks on login button
    Then user is on welcome page
    Then user click on deposit button
    And user deposits an amount <depositAmount>
    And user clicks on deposit button
    And user validate that the deposit was successful
    Then User logout
    Examples:
      | depositAmount |
      | 1500          |

  Scenario Outline: Test Case 2 -  Customer must be able to deposit an amount on each of their accounts
    Given User is on homepage
    When the user clicks customer login button
    Then the user clicks dropdown arrow
    And the user selects a user name "Albus Dumbledore"
    Then the user clicks on login button
    Then the user is on welcome page
    Then user click on first deposit button
    And user deposits first amount <depositAmount>
    And user clicks on Second deposit button
    And the user validate that the deposit was successful
    Then user clicks account dropdown
    And user select second account
    Then the user click on first deposit button
    And user deposits second amount <depositAmount>
    And the user clicks on second deposit button
    And the user validates that the deposit was successful
    Then user clicks accounts dropdown
    And user select third account
    Then user click on first deposits button
    And user deposits third amount <depositAmount>
    And the user clicks second deposit button
    And the user validate that the deposit is successful
    Then the User logout
    Examples:
      | account | depositAmount |
      | 1500    | 1500          |








