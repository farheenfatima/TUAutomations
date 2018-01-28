$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login With Valid Data",
  "description": "",
  "id": "login;login-with-valid-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am in Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I Select on Login Link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should see the login page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter the valid email address and valid password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click login buuton",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "i should see the welcome page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginWithValid.i_am_in_home_page()"
});
formatter.result({
  "duration": 12073257618,
  "status": "passed"
});
formatter.match({
  "location": "LoginWithValid.i_Select_on_login_link()"
});
formatter.result({
  "duration": 3592194367,
  "status": "passed"
});
formatter.match({
  "location": "LoginWithValid.i_should_see_the_login_page()"
});
formatter.result({
  "duration": 51724794,
  "status": "passed"
});
formatter.match({
  "location": "LoginWithValid.i_enter_the_valid_email_address_and_valid_password()"
});
formatter.result({
  "duration": 582960883,
  "status": "passed"
});
formatter.match({
  "location": "LoginWithValid.i_click_login_buuton()"
});
formatter.result({
  "duration": 104085938,
  "status": "passed"
});
formatter.match({
  "location": "LoginWithValid.i_should_see_the_welcome_page()"
});
formatter.result({
  "duration": 2624875286,
  "status": "passed"
});
});