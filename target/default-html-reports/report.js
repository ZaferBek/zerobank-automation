$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PayBills.feature");
formatter.feature({
  "name": "Pay Bills page activities",
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
  "name": "Pay Saved Payee",
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
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.PayBillsStepDefs.the_user_navigates_to_Pay_Bills_module()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "page should have the title \"Zero - Pay Bills\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountSummaryStepDefs.page_should_have_the_title(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user completes a successful Pay operation",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.PayBillsStepDefs.user_completes_a_successful_Pay_operation()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "\"The payment was successfully submitted.\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.PayBillsStepDefs.should_be_displayed(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user tries to make a payment without entering the amount",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.PayBillsStepDefs.the_user_tries_to_make_a_payment_without_entering_the_amount()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "\"Please fill out this field.\" popup message should be displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user tries to make a payment without entering the date",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.PayBillsStepDefs.the_user_tries_to_make_a_payment_without_entering_the_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "\"Please fill out this field.\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.PayBillsStepDefs.should_be_displayed(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});