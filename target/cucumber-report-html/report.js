$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/ApiFeature.feature");
formatter.feature({
  "name": "Api Testing",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@apiTest"
    }
  ]
});
formatter.scenario({
  "name": "Verify API is working",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@apiTest"
    },
    {
      "name": "@api"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I hit api",
  "keyword": "When "
});
formatter.match({
  "location": "ApiStepDefinition.iHitApi()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "response contains top level elements",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiStepDefinition.containsTopLevelElements()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hourly object contains 49",
  "keyword": "And "
});
formatter.match({
  "location": "ApiStepDefinition.hourlyObjectContains(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Minutely object contains 61",
  "keyword": "And "
});
formatter.match({
  "location": "ApiStepDefinition.minutelyObjectContains(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Daily object contains 8",
  "keyword": "And "
});
formatter.match({
  "location": "ApiStepDefinition.dailyObjectContains(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/java/features/SearchFlight.feature");
formatter.feature({
  "name": "SearchFlight",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Bill wants to travel from DXB to LHR",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "that Bill has decided to check available flights",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchFlightStepDefinition.checkAvailableFlights()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he looks at a return trip from DXB to LHR leaving one week from now",
  "keyword": "When "
});
formatter.match({
  "location": "SearchFlightStepDefinition.searchFlight(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he should be shown the cheapest return ticket from DXB to LHR",
  "keyword": "Then "
});
formatter.match({
  "location": "SelectPriceDefinition.cheapestFlightShown(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});