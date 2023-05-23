$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Test",
  "description": "As user I want to login into saucedemo website",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3282757900,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should successfully login with valid credentials",
  "description": "",
  "id": "login-test;user-should-successfully-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    },
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter username \"standard_user\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter password \"secret_sauce\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should login successfuly",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnTheLoginPage()"
});
formatter.result({
  "duration": 131309900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterUsername(String)"
});
formatter.result({
  "duration": 81020600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 64048900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 88752300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldLoginSuccessfuly()"
});
formatter.result({
  "duration": 65518600,
  "status": "passed"
});
formatter.after({
  "duration": 615763400,
  "status": "passed"
});
formatter.before({
  "duration": 2238101200,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User should get error message with Invalid credentials",
  "description": "",
  "id": "login-test;user-should-get-error-message-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@sanity"
    },
    {
      "line": 11,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I am on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I enter username \" \"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I enter password \" \"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should see errorMessage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnTheLoginPage()"
});
formatter.result({
  "duration": 35843200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " ",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterUsername(String)"
});
formatter.result({
  "duration": 61318900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " ",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 41667600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 43099500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldSeeErrorMessage()"
});
formatter.result({
  "duration": 31343400,
  "status": "passed"
});
formatter.after({
  "duration": 582836700,
  "status": "passed"
});
});