$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/CheckAlertInDetailedWidget.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: alice-liangyun.ge@soprabanking.com"
    },
    {
      "line": 2,
      "value": "#Feature name: CheckAlertInDetailedWidget"
    }
  ],
  "line": 4,
  "name": "Log in as an OP",
  "description": "I want to use this template for my feature file",
  "id": "log-in-as-an-op",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@Alert"
    }
  ]
});
formatter.scenario({
  "line": 8,
  "name": "Successful login with Valid Credential",
  "description": "",
  "id": "log-in-as-an-op;successful-login-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@AlertHappyTest"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User enters \"test\" and \"test\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Users is on Work Station Page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User choose OP",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User is on Widget Home Page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I click on Administration button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User logOut",
  "keyword": "And "
});
formatter.match({
  "location": "CheckAlertInDetailedWidgetSteps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 6844777622,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 13
    },
    {
      "val": "test",
      "offset": 24
    }
  ],
  "location": "CheckAlertInDetailedWidgetSteps.user_enters_and(String,String)"
});
formatter.result({
  "duration": 324182660,
  "status": "passed"
});
formatter.match({
  "location": "CheckAlertInDetailedWidgetSteps.users_is_on_Work_Station_Page()"
});
formatter.result({
  "duration": 26053,
  "status": "passed"
});
formatter.match({
  "location": "CheckAlertInDetailedWidgetSteps.user_choose_OP()"
});
formatter.result({
  "duration": 3329397052,
  "status": "passed"
});
formatter.match({
  "location": "CheckAlertInDetailedWidgetSteps.user_is_on_Widget_Home_Page()"
});
formatter.result({
  "duration": 33227,
  "status": "passed"
});
formatter.match({
  "location": "CheckAlertInDetailedWidgetSteps.i_click_on_Administration_button()"
});
formatter.result({
  "duration": 535523377,
  "status": "passed"
});
formatter.match({
  "location": "CheckAlertInDetailedWidgetSteps.user_logOut()"
});
formatter.result({
  "duration": 781794106,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 18,
  "name": "Successful login with More Valid Credential",
  "description": "",
  "id": "log-in-as-an-op;successful-login-with-more-valid-credential",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@AlertHappyTest"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User enters \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Users is on Work Station Page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User choose OP",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User is on Widget Home Page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 24,
      "value": "#And USer click on View Details"
    }
  ],
  "line": 25,
  "name": "User logOut",
  "keyword": "And "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "log-in-as-an-op;successful-login-with-more-valid-credential;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 28,
      "id": "log-in-as-an-op;successful-login-with-more-valid-credential;;1"
    },
    {
      "cells": [
        "\"sopra\"",
        "\"sopra\""
      ],
      "line": 29,
      "id": "log-in-as-an-op;successful-login-with-more-valid-credential;;2"
    },
    {
      "cells": [
        "\"crelan\"",
        "\"sopra\""
      ],
      "line": 30,
      "id": "log-in-as-an-op;successful-login-with-more-valid-credential;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 29,
  "name": "Successful login with More Valid Credential",
  "description": "",
  "id": "log-in-as-an-op;successful-login-with-more-valid-credential;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Alert"
    },
    {
      "line": 17,
      "name": "@AlertHappyTest"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User enters \"sopra\" and \"sopra\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Users is on Work Station Page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User choose OP",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User is on Widget Home Page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 24,
      "value": "#And USer click on View Details"
    }
  ],
  "line": 25,
  "name": "User logOut",
  "keyword": "And "
});
formatter.match({
  "location": "CheckAlertInDetailedWidgetSteps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 4287396085,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sopra",
      "offset": 13
    },
    {
      "val": "sopra",
      "offset": 25
    }
  ],
  "location": "CheckAlertInDetailedWidgetSteps.user_enters_and(String,String)"
});
formatter.result({
  "duration": 496381832,
  "status": "passed"
});
formatter.match({
  "location": "CheckAlertInDetailedWidgetSteps.users_is_on_Work_Station_Page()"
});
formatter.result({
  "duration": 22655,
  "status": "passed"
});
formatter.match({
  "location": "CheckAlertInDetailedWidgetSteps.user_choose_OP()"
});
formatter.result({
  "duration": 2561569664,
  "status": "passed"
});
formatter.match({
  "location": "CheckAlertInDetailedWidgetSteps.user_is_on_Widget_Home_Page()"
});
formatter.result({
  "duration": 37381,
  "status": "passed"
});
formatter.match({
  "location": "CheckAlertInDetailedWidgetSteps.user_logOut()"
});
formatter.result({
  "duration": 768992225,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Successful login with More Valid Credential",
  "description": "",
  "id": "log-in-as-an-op;successful-login-with-more-valid-credential;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Alert"
    },
    {
      "line": 17,
      "name": "@AlertHappyTest"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User enters \"crelan\" and \"sopra\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Users is on Work Station Page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User choose OP",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User is on Widget Home Page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 24,
      "value": "#And USer click on View Details"
    }
  ],
  "line": 25,
  "name": "User logOut",
  "keyword": "And "
});
formatter.match({
  "location": "CheckAlertInDetailedWidgetSteps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 4556338280,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "crelan",
      "offset": 13
    },
    {
      "val": "sopra",
      "offset": 26
    }
  ],
  "location": "CheckAlertInDetailedWidgetSteps.user_enters_and(String,String)"
});
formatter.result({
  "duration": 724109560,
  "status": "passed"
});
formatter.match({
  "location": "CheckAlertInDetailedWidgetSteps.users_is_on_Work_Station_Page()"
});
formatter.result({
  "duration": 63055,
  "status": "passed"
});
formatter.match({
  "location": "CheckAlertInDetailedWidgetSteps.user_choose_OP()"
});
formatter.result({
  "duration": 2953538670,
  "status": "passed"
});
formatter.match({
  "location": "CheckAlertInDetailedWidgetSteps.user_is_on_Widget_Home_Page()"
});
formatter.result({
  "duration": 21144,
  "status": "passed"
});
formatter.match({
  "location": "CheckAlertInDetailedWidgetSteps.user_logOut()"
});
formatter.result({
  "duration": 765534716,
  "status": "passed"
});
});