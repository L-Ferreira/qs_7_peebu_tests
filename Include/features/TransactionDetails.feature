Feature: See the transaction details
  As a user
  I want to open the transaction information modal
  So that I can see and edit the transaction details

  Background: 
    Given the user has an open browser
    And the user has at least one transaction
    When the user navigates to the PeeBu Home Page

  Scenario: Transaction table has values
    Then the user should see at least one table line with the transaction details

  Scenario: Transaction table line has an action button
    Then the user should see an "info" button on the "Actions" table column

  Scenario: See transaction information modal window
    And the user selects the "info" button on the first table line
    Then the user should see the transaction information modal window

  Scenario: Change a transaction's category to "Health"
    And the user selects the "info" button on the first table line
    And the user selects the "Edit" button
    And the user selects the "Health" button on the "Category" column
    And the user selects the "Save" button
    Then the user should go back to the PeeBu Home Page
    And the user should see the updated transaction with the "Health" category

  Scenario: Close information modal
    And the user selects the "info" button on the first table line
    And the user clicks the "Close" button
    Then the user should go back to the PeeBu Home Page
