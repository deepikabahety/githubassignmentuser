#Author: Deepika Bahety
@GitHubUserInfo
Feature: GitHub User information which include API and UI Test Case

  #Task #1 - API
  @GitHubUserInfoAPI
  Scenario: Github API calls to get the user and repository information
    #Given I want to write a step with precondition
    When I give the username from the console
    And I call userinfo api to get the given user information and print it on console
    Then I call repository api which is owned by the given user to get the repo information and print it on console

  #Task #2 - UI
  @GitHubUserInfoUI
  Scenario: Github UI automation to get the stars of given user repository and assert with API value
    Given Chrome Driver is opened
    When I opened github page and search the username
    And I Click on first repository and get the number of stars
    Then I compare stars value of UI and API
