$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GoogleSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Google Search Functionality;",
  "description": "",
  "id": "google-search-functionality;",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@GoogleSearch"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Verify google search functionality",
  "description": "",
  "id": "google-search-functionality;;verify-google-search-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Browser is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters \"URL\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Google Search page is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters required \"text\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on enter",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Respective results should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchSteps.browser_is_launched()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "URL",
      "offset": 13
    }
  ],
  "location": "GoogleSearchSteps.user_enters_something(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GoogleSearchSteps.google_search_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "text",
      "offset": 22
    }
  ],
  "location": "GoogleSearchSteps.user_enters_required_something(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GoogleSearchSteps.click_on_enter()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GoogleSearchSteps.respective_results_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
});