$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#  @login"
    },
    {
      "line": 4,
      "value": "#  Scenario Outline: Register a user 2"
    },
    {
      "line": 5,
      "value": "#    Given user launches the facebook"
    },
    {
      "line": 6,
      "value": "#    When user enters signup information \"\u003cFirstName\u003e\",\"\u003cLastName\u003e\",\"\u003cEmailOrMobile\u003e\",\"\u003cSignUpPassword\u003e\""
    },
    {
      "line": 7,
      "value": "#    And user clears sign up information"
    },
    {
      "line": 8,
      "value": "##    Then sign up info is cleared"
    },
    {
      "line": 9,
      "value": "#"
    },
    {
      "line": 10,
      "value": "#    Examples:"
    },
    {
      "line": 11,
      "value": "#      | FirstName | LastName | EmailOrMobile       | SignUpPassword |"
    },
    {
      "line": 12,
      "value": "#      | Test    | Shaik    | mehraj999@gmail.com | 92379889       |"
    }
  ],
  "line": 16,
  "name": "Register a user",
  "description": "",
  "id": "login;register-a-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@facebook_proto2"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user launches the facebook \"\u003cFeature\u003e\",\"\u003cScenario\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "user enters signup information",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user clears sign up information",
  "keyword": "And "
});
formatter.examples({
  "comments": [
    {
      "line": 20,
      "value": "#    Then sign up info is cleared"
    }
  ],
  "line": 22,
  "name": "",
  "description": "",
  "id": "login;register-a-user;",
  "rows": [
    {
      "cells": [
        "Feature",
        "Scenario"
      ],
      "line": 23,
      "id": "login;register-a-user;;1"
    },
    {
      "cells": [
        "Register",
        "SignUpUser_TC1"
      ],
      "line": 24,
      "id": "login;register-a-user;;2"
    },
    {
      "cells": [
        "Register",
        "SignUpUser_TC2"
      ],
      "line": 25,
      "id": "login;register-a-user;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 13064717000,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Register a user",
  "description": "",
  "id": "login;register-a-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@facebook_proto2"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user launches the facebook \"Register\",\"SignUpUser_TC1\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "user enters signup information",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user clears sign up information",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 28
    },
    {
      "val": "SignUpUser_TC1",
      "offset": 39
    }
  ],
  "location": "StpRegister.user_launches_the_facebook(String,String)"
});
formatter.result({
  "duration": 2751608700,
  "status": "passed"
});
formatter.match({
  "location": "StpRegister.user_enters_signup_information()"
});
formatter.result({
  "duration": 18380585200,
  "status": "passed"
});
formatter.match({
  "location": "StpRegister.user_clears_sign_up_information()"
});
formatter.result({
  "duration": 6734018500,
  "status": "passed"
});
formatter.after({
  "duration": 160400,
  "status": "passed"
});
formatter.after({
  "duration": 853032200,
  "status": "passed"
});
formatter.before({
  "duration": 9477916300,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Register a user",
  "description": "",
  "id": "login;register-a-user;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@facebook_proto2"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user launches the facebook \"Register\",\"SignUpUser_TC2\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "user enters signup information",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user clears sign up information",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 28
    },
    {
      "val": "SignUpUser_TC2",
      "offset": 39
    }
  ],
  "location": "StpRegister.user_launches_the_facebook(String,String)"
});
formatter.result({
  "duration": 39837300,
  "status": "passed"
});
formatter.match({
  "location": "StpRegister.user_enters_signup_information()"
});
formatter.result({
  "duration": 20427013800,
  "status": "passed"
});
formatter.match({
  "location": "StpRegister.user_clears_sign_up_information()"
});
formatter.result({
  "duration": 3616054800,
  "status": "passed"
});
formatter.after({
  "duration": 32900,
  "status": "passed"
});
formatter.after({
  "duration": 729120000,
  "status": "passed"
});
});