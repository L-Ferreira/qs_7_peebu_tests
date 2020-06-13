Feature: See the transaction details
  As a user
  I want to open the transaction information modal
  So that I can see and edit the transaction details

  Background: 
    Given the user has an open browser
    And the user has a transaction with the following information
      | entity                        | amount | type    | category |
      | Wintheiser, Kuhn and Turcotte | 269.10 | invoice | Vet      |
    When the user navigates to the PeeBu Home Page

  Scenario: Transaction table has values
    Then the user sees at least one table line with the transaction details

  Scenario: Transaction table line has an action button
    Then the user sees an "info" button on the "Actions" table column

  Scenario: See transaction information modal window
    And the user selects the "info" button on the first table line
    Then the user sees the transaction information modal window

  Scenario: Change a transaction's category to "Health"
    And the user selects the "info" button on the first table line
    And the user selects the "Health" button on the "Category" dropdown
    And the user selects the "Save" button
    Then the user goes back to the PeeBu Home Page
    And the user sees the updated transaction with the "Health" category

  Scenario: Close information modal
    And the user selects the "info" button on the first table line
    And the user selects the "Close" button
    Then the user goes back to the PeeBu Home Page

  Scenario: Transaction Information details are correct
    And the user selects the "info" button on the first table line
    Then the user sees the following information on the details
      | entity                        | amount | type    | category |
      | Wintheiser, Kuhn and Turcotte | 269.10 | invoice | Vet      |
