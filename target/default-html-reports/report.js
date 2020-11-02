$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountSummary.feature");
formatter.feature({
  "name": "Account Summary Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Account Summary Page title confirmation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
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
formatter.step({
  "name": "the user is on Account Summary page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountSummaryStepDefs.the_user_is_on_Account_Summary_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "page should have the title \"Zero - Account Summary\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountSummaryStepDefs.page_should_have_the_title(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Account Summary page should have the following account types",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountSummaryStepDefs.account_Summary_page_should_have_the_following_account_types(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Credit Accounts table must have columns",
  "rows": [
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
formatter.after({
  "status": "skipped"
});
});