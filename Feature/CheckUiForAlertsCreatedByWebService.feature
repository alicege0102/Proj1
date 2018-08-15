#Author: alice-liangyun.ge@soprabanking.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@initiateAlert
Feature: initiateAlert request in AlertInitiatorService

  @initiateAlert
  Scenario Outline: IntegrationTestForAlertDetailedWidget
    Given There is a file <fileName> for creating web service
    And I create my web service: URL = "http://lbrusdkrengine01:49501/alert-jaxws/AlertInitiatorService", xml = <fileNameForAlert>
    And I generate 1 alert with file "<fileName>"
    And User is on Home Page
    And User enters "test" and "test"
    Then Users is on Work Station Page
    When User choose OP
    Then User is on Widget Home Page
    And User logOut
   

    Examples: 
      | Description                     | fileName                             | 
      | AlertForTestWithnotifTypeAlice1 | "AlertForCrelanWithnotifType1.xml"   | 
      | AlertForTestWithnotifTyp1       | "AlertForTestWithnotifTypeAlice1.xml" | 