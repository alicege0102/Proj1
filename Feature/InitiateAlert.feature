#Author: alice-liangyun.ge@soprabanking.com

@initiateAlert
Feature: initiateAlert request in AlertInitiatorService

  @initiateAlert
  Scenario Outline: Create alert via web service
    Given There is a file <fileNameForAlert> for creating web service
    And I create my web service: URL = "http://lbrusdkrengine01:49501/alert-jaxws/AlertInitiatorService", xml = <fileNameForAlert>
    Then I validate the <response>


    Examples: 
      | Description                     			| fileNameForAlert											| response 										|
      | Create an alert for crelan   					| "AlertForCrelanWithnotifType1.xml"		| "<error>false</error>" 			|
      | Create an alert for user						  | "AlertForTestWithnotifTypeAlice1.xml"			| "<error>false</error>" 	|
