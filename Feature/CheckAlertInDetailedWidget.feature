#Author: alice-liangyun.ge@soprabanking.com
#Feature name: CheckAlertInDetailedWidget
@Alert
Feature: Log in as an OP
  I want to use this template for my feature file

  @AlertHappyTest
  Scenario: Successful login with Valid Credential
    Given User is on Home Page
    And User enters "test" and "test"
    Then Users is on Work Station Page
    When User choose OP
    Then User is on Widget Home Page
    And I click on Administration button
    And User logOut

  @AlertHappyTest
  Scenario Outline: Successful login with More Valid Credential
    Given User is on Home Page
    And User enters <username> and <password>
    Then Users is on Work Station Page
    When User choose OP
    Then User is on Widget Home Page
    #And USer click on View Details
    And User logOut

    Examples: 
      | username | password |
      | "sopra"  | "sopra"	|
      | "crelan" | "sopra"  |
