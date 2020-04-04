Feature: Filter the transactions table
  As a user
  I want to filter the transactions table
  So I can see specific transactions combinations

  Background: 
    Given the user has an open browser
    And the user navigates to the PeeBu Home Page

  Scenario Outline: Use the table search field
    When the user selects the table search field
    And the user inputs a <filter> text
    Then the user should see <resultcount> filtered results

    Examples: 
      | filter   | resultcount |
      | farmacia |           5 |
      | propinas |           7 |

  Scenario Outline: Filter transactions by date
    When the user selects the "Choose a date" button
    And the user inserts a <startdate> and an <enddate>
    Then the user should see <resultcount> filtered results

    Examples: 
      | startdate  | enddate    | resultcount |
      | 2020-03-12 | 2020-03-17 |           8 |
      | 2020-03-05 | 2020-03-06 |           3 |

  Scenario: Sort results by type in ascending order
    When the user clicks on the "ascending" arrow of the "type" column header cell
    Then the user should see the results in "ascending" order of "type"

  Scenario Outline: Sort results by column
    When the user clicks on the <ordertype> arrow of the <columnname> column header cell
    Then the user should see the results in <ordertype> order of <columnname>

    Examples: 
      | columnname | ordertype |
      | name1      |         5 |
      | name2      |         7 |


