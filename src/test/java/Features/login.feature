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

  Scenario Outline: Test Case 3 -  Customer must be able to deposit and withdraw an amount
    Given the User lands on homepage
    When the User click customer login button
    Then the User click dropdown arrow
    And the User selects a user "Ron Weasly"
    Then the User click on login button
    Then the User lands on welcome page
    And user verify the original balance
    Then user clicks first deposit button
    And user deposits amount <depositAmount>
    And the user click on second deposit button
    And the user verifies that the Deposit was successful
    Then user clicks on Transactions button
    And the user verifies that the transaction appears
    Then user clicks back button
    And user click withdrawal button
    Then user withdraws an amount
    And user click withdraw button
    And user validate that the current Balance is the original balance
    Then the user clicks on Transactions button
    And user verifies that the transaction appears
    Then the user logs out
    Examples:
      | account | depositAmount |
      | 1500    | 31459          |









