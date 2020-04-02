Feature: Access the website's home page
  As a user
  I want to navigate to the PeeBu Homepage
  So that I can see PeeBu's home page

  Background: 
    Given the user has an open browser
    When the user navigates to the PeeBu Home Page

  Scenario: See the "PeeBu" Headline
    Then the user sees the "PeeBu" Headline

  Scenario: See the transactions table
    Then the user sees the transactions table

  Scenario: See the statistics
    Given the user scrolls down
    Then the user sees the "Statistics" Headline
