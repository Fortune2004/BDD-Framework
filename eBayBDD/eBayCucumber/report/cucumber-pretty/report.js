$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/salmaalam/IdeaProjects/eBayBDD/eBayCucumber/src/test/java/feature/Register.feature");
formatter.feature({
  "line": 2,
  "name": "Register Feature",
  "description": "",
  "id": "register-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Register Feature Test",
  "description": "",
  "id": "register-feature;register-feature-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User in the register page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "put first name",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "put last name",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "provide email address",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "give password",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click create account button",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.User_in_the_register_page()"
});
formatter.result({
  "duration": 3175803400,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.put_first_name()"
});
formatter.result({
  "duration": 556989207,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.put_last_name()"
});
formatter.result({
  "duration": 48962635,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.provide_email_address()"
});
formatter.result({
  "duration": 75545123,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.give_password()"
});
formatter.result({
  "duration": 70980071,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.click_create_account_button()"
});
formatter.result({
  "duration": 30084726424,
  "status": "passed"
});
});