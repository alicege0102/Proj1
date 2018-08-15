#Author: alice-liangyun.ge@soprabanking.com

@CreateNotificationType
Feature: CreateNotificationType
	I want to use this template for my feature file

Scenario Outline: Title of your scenario
    Given There is a file <fileNameForAlertType> for creating web service
    And I create my web service: URL = "http://lbrusdkrengine01:49501/alert-jaxws/NotificationTypeService?wsdl", xml = <fileNameForAlertType>
    Then I validate the <response>
   

    Examples: 
      | Description                     			| fileNameForAlertType		| response 																																			|
      | Create a new notificationType   			| "notifTypeAlice4.xml"		| "<error>false</error>" 																												|
      | Create an existing notificationType   | "notifTypeAlice3.xml"		| "<code>A notification with this notificationTypeName already exists.</code>" 	|
