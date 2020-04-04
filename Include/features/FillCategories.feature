Feature: Fill transaction category
  As a user
  I want to see my transactions with no category
  So I can fill their category field

  Background: 
    Given the user has an open browser

  Scenario: See alert when there are transactions with no category
    And there is at least one transaction with no category
    When the user navigates to the PeeBu Home Page
    Then the user should see an alert to fill missing categories

  Scenario: Hide alert when all transactions have a category
    And all transactions have a valid category field
    When the user navigates to the PeeBu Home Page
    Then the user should not be able to see the "fill missing categories" alert

  Scenario: Open the fill categories modal view
    And there is at least one transaction with no category
    When the user navigates to the PeeBu Home Page
    And the user clicks the "Fix" button
    Then the user should see a modal with the transactions with no category

  Scenario: All transactions with no category appear on the fill categories modal view
    And there are <number> transactions with no category
    When the user navigates to the PeeBu Home Page
    And the user clicks the "Fix" button
    Then the user should see <number> transactions on the opened modal

  Scenario: Add a category to a transaction on the fill categories modal view
    And there is at least one transaction with no category
    When the user navigates to the PeeBu Home Page
    And the user clicks the "Fix" button
    And the user selects the <category> category for the <transactionid> transaction
    And the user clicks the "Save" button
    Then the user should go back to the PeeBu Home Page
    And the <transactionid> transaction should have the <category> category

  Scenario: Cancel and go back to the PeeBu Home page
    And there is at least one transaction with no category
    When the user navigates to the PeeBu Home Page
    And the user clicks the "Fix" button
    And the user clicks the "Cancel" button
    Then the user should go back to the PeeBu Home Page
