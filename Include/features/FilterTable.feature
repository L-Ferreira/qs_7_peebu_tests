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
    And the user picks the <startdate> date on the "Start date" field
    And the user picks the <enddate> date on the "End date" field
    And the user selects the "Go" button
    Then the user sees <resultcount> filtered results

    Examples: 
      | startdate    | enddate      | resultcount |
      | "2020-02-01" | "2020-05-02" |           5 |
      | "2020-01-09" | "2020-03-03" |          12 |

  Scenario: Sort results by type in ascending order
    When the user selects the "ascending" order of the "type" column header cell
    Then the user sees the "Crist - Wintheiser" value on the "type" column of the first row

  Scenario Outline: Sort results by column
    When the user selects the <ordertype> order of the <columnname> column header cell
    Then the user sees the <firstvalue> value on the <columnname> column of the first row

    Examples: 
      | columnname | ordertype    | firstvalue        |
      | "entity"   | "ascending"  | "Abbott - Marvin" |
      | "amount"   | "ascending"  | "Pouros Group"           |
      | "type"     | "descending" | "Thompson Group"      |
      | "category" | "descending" | "Wintheiser, Kuhn and Turcotte"             |
