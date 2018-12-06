$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/SearchFlight.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
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
});