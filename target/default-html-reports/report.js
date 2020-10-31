$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddNewPayee.feature");
formatter.feature({
  "name": "Add new Payee under Pay Bills",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityNavigationStepDefs.the_user_is_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Add a new Payee",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user navigates to Pay Bills module",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user selects Add New Payee tab",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user creates new payee using following information",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "message \"The new payee The Law Offices of Hyde, Price\u0026Scharks was successfully created.\" should be displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});