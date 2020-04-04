Feature: Fill transaction category
  As a user
  I want to see my transactions
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
    Then the user should not be able to see the alert to fill missing categories

  Scenario: Open missing category filling modal
    And there is at least one transaction with no category
    When the user navigates to the PeeBu Home Page
    And the user clicks the "Fix" button
    Then the user should see a modal with the transactions with no category

  Scenario: All transactions with no category appear on the fix modal
    And there are <number> transactions with no category
    When the user navigates to the PeeBu Home Page
    And the user clicks the "Fix" button
    Then the user should see <number> transactions on the opened modal

  Scenario: Add a category to a transaction
    And there is at least one transaction with no category
    When the user navigates to the PeeBu Home Page
    And the user clicks the "Fix" button
    And the user selects the <category> category for the <transactionid> transaction
    Then the user should go back to the PeeBu Home Page
    And the <transactionid> transaction should have the <category> category

