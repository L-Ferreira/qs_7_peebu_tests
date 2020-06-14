#Using API for filtering -> https://5e5d229a97d2ea00147971d0.mockapi.io/sq/transactions?filter=
Feature: Filter the transaction table
  As a user
  I want to filter the transaction table
  So I can see specific transaction combinations

  Background: 
    Given the user has an open browser
    And the user navigates to the PeeBu Home Page

  Scenario Outline: Use the table search field
    When the user inputs the <filter> text on the "Table Search" field
    And the user selects the "Go" button
    Then the user sees <resultcount> filtered results

    Examples: 
      | filter        | resultcount |
      | "education"   |          15 |
      | "residence"   |           9 |
      | "hairdresser" |           6 |

  Scenario Outline: Filter transactions by date
    When the user selects the "From date" button
    And the user picks the <startdate> date
    And the user selects the "To date" button
    And the user picks the <enddate> date
    Then the user sees <resultcount> filtered results

    #The resultcount values are not correct yet
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
      | columnname | ordertype    |
      | "entity"   | "ascending"  |
      | "amount"   | "ascending"  |
      | "date"     | "descending" |
      | "type"     | "descending" |
      | "category" | "ascending"  |
