$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Shahin Alam/eclipse-workspace/cucumberdemo/src/main/java/Features/Tags.feature");
formatter.feature({
  "line": 2,
  "name": "Free CRM application testing",
  "description": "",
  "id": "free-crm-application-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenario({
  "line": 55,
  "name": "Browser is close",
  "description": "",
  "id": "free-crm-application-testing;browser-is-close",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 56,
  "name": "This is a browser close test",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingStepDefinition.This_is_a_browser_close_test()"
});
formatter.result({
  "duration": 154772901,
  "status": "passed"
});
});