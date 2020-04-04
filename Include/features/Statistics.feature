Feature: Access the Statistics section
  As a user
  I want to go to the statistics section
  So I can see the statistics by balance, categories and types

  Background: 
    Given the user has an open browser
    And the user navigates to the PeeBu Home Page
    And the user scrolls down to the Statistics section

  #Cateories
  Scenario: See the Categories Headline
    Then the user sees the "Categories" Headline

  Scenario: See the Number of transactions by category Headline
    Then the user sees the "Number of transactions by category" Headline

  Scenario: See the Number of transactions by category Pie Chart
    Then the user sees the "Number of transactions by category" Pie Chart

  Scenario: See the "Expenses by category" Headline
    Then the user sees the "Expenses by category" Headline

  Scenario: See the Expenses by category Bar Chart
    Then the user sees the "Expenses by category" Bar Chart

  Scenario Outline: See the categories statistics filtered results label
    When the user selects the "From date" button
    And the user picks the <startdate> date
    And the user selects the "To date" button
    And the user picks the <enddate> date
    Then the user should see the "Showing results from <startdate> to <enddate>" label

    Examples: 
      | startdate  | enddate    |
      | 2020-03-12 | 2020-03-17 |
      | 2020-03-05 | 2020-03-06 |

  Scenario Outline: See the categories statistics reset filter button
    When the user selects the "From date" button
    And the user picks the <startdate> date
    And the user selects the "To date" button
    And the user picks the <enddate> date
    Then the user should see the "Reset dates" button

    Examples: 
      | startdate  | enddate    |
      | 2020-03-12 | 2020-03-17 |
      | 2020-03-05 | 2020-03-06 |

  Scenario Outline: See the new values of the Number of transactions by category Pie Chart
    When the user selects the "From date" button
    And the user picks the <startdate> date
    And the user selects the "To date" button
    And the user picks the <enddate> date
    Then the user should see the updated "Number of transactions by category" Pie Chart

    Examples: 
      | startdate  | enddate    |
      | 2020-03-12 | 2020-03-17 |
      | 2020-03-05 | 2020-03-06 |

  Scenario Outline: See the new values of the Expenses by category Bar Chart
    When the user selects the "From date" button
    And the user picks the <startdate> date
    And the user selects the "To date" button
    And the user picks the <enddate> date
    Then the user should see the updated "Expenses by category" Bar Chart

    Examples: 
      | startdate  | enddate    |
      | 2020-03-12 | 2020-03-17 |
      | 2020-03-05 | 2020-03-06 |

  Scenario: Reset the categories statistics date
    Given the user filters by date
    When the user selects the "Reset dates" button
    Then the user should not see the "Showing results from <startdate> to <enddate>" label
    And the user should not see "Reset dates" button
    And the user should see the default "Number of transactions by category" Pie Chart
    And the user should see the default "Expenses by category" Bar Chart

  #Types
  Scenario: See the Types Headline
    Then the user sees the "Types" Headline

  Scenario: See the Number of transactions by type Headline
    Then the user sees the "Number of transactions by type" Headline

  Scenario: See the Number of transactions by type Pie Chart
    Then the user sees the "Number of transactions" by type Pie Chart

  Scenario: See the Expenses by type Headline
    Then the user sees the "Expenses by type" Headline

  Scenario: See the Expenses by type Bar Chart
    Then the user sees the "Expenses by type" Bar Chart

  Scenario Outline: See types statistics filtered results label
    When the user selects the "From date" button
    And the user picks the <startdate> date
    And the user selects the "To date" button
    And the user picks the <enddate> date
    Then the user should see the "Showing results from <startdate> to <enddate>" label

    Examples: 
      | startdate  | enddate    |
      | 2020-03-12 | 2020-03-17 |
      | 2020-03-05 | 2020-03-06 |

  Scenario Outline: See the types statistics reset filter button
    When the user selects the "From date" button
    And the user picks the <startdate> date
    And the user selects the "To date" button
    And the user picks the <enddate> date
    Then the user should see the "Reset dates" button

    Examples: 
      | startdate  | enddate    |
      | 2020-03-12 | 2020-03-17 |
      | 2020-03-05 | 2020-03-06 |

  Scenario Outline: See the new values of the Number of transactions by type Pie Chart
    When the user selects the "From date" button
    And the user picks the <startdate> date
    And the user selects the "To date" button
    And the user picks the <enddate> date
    Then the user should see the updated "Number of transactions by type" Pie Chart

    Examples: 
      | startdate  | enddate    |
      | 2020-03-12 | 2020-03-17 |
      | 2020-03-05 | 2020-03-06 |

  Scenario Outline: See the new values of the Expenses by type Bar Chart
    When the user selects the "From date" button
    And the user picks the <startdate> date
    And the user selects the "To date" button
    And the user picks the <enddate> date
    Then the user should see the updated "Expenses by type" Bar Chart

    Examples: 
      | startdate  | enddate    |
      | 2020-03-12 | 2020-03-17 |
      | 2020-03-05 | 2020-03-06 |

  Scenario: Reset the types statistics date
    Given the user filters by date
    When the user selects the "Reset dates" button
    Then the user should not see the "Showing results from <startdate> to <enddate>" label
    And the user should not see the "Reset dates" button
    And the user should see the default "Number of transactions by type" Pie Chart
    And the user should see the default "Expenses by type" Bar Chart

  #Balance
  Scenario: See the Balance Headline
    Then the user sees the "Balance" Headline

  Scenario: See the Balance Line Chart
    Then the user sees the "Balance" Line Chart

  Scenario Outline: See the balance statistics filtered results label
    When the user selects the "From date" button
    And the user picks the <startdate> date
    And the user selects the "To date" button
    And the user picks the <enddate> date
    Then the user should see the "Showing results from <startdate> to <enddate>" label

    Examples: 
      | startdate  | enddate    |
      | 2020-03-12 | 2020-03-17 |
      | 2020-03-05 | 2020-03-06 |

  Scenario Outline: See the balance statistics reset filter button
    When the user selects the "From date" button
    And the user picks the <startdate> date
    And the user selects the "To date" button
    And the user picks the <enddate> date
    Then the user should see the "Reset dates" button

    Examples: 
      | startdate  | enddate    |
      | 2020-03-12 | 2020-03-17 |
      | 2020-03-05 | 2020-03-06 |

  Scenario Outline: See the new values of the Balance Line Chart
    When the user selects the "From date" button
    And the user picks the <startdate> date
    And the user selects the "To date" button
    And the user picks the <enddate> date
    Then the user should see the updated "Balance" Line Chart

    Examples: 
      | startdate  | enddate    |
      | 2020-03-12 | 2020-03-17 |
      | 2020-03-05 | 2020-03-06 |

  Scenario: Reset the balance statistics date
    Given the user filters by date
    When the user selects the "Reset dates" button
    Then the user should not see the "Showing results from <startdate> to <enddate>" label
    And the user should not see the "Reset dates" button
    And the user should see the default "Balance"
