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
  "error_message": "extension.GenericError: Don\u0027t contain top level elements\r\n\tat implementation.ApiHelper.isContainsTopLevelElements(ApiHelper.java:24)\r\n\tat stepDefinition.ApiStepDefinition.containsTopLevelElements(ApiStepDefinition.java:25)\r\n\tat ✽.response contains top level elements(src/test/java/features/ApiFeature.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Hourly object contains 49",
  "keyword": "And "
});
formatter.match({
  "location": "ApiStepDefinition.hourlyObjectContains(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Minutely object contains 61",
  "keyword": "And "
});
formatter.match({
  "location": "ApiStepDefinition.minutelyObjectContains(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Daily object contains 8",
  "keyword": "And "
});
formatter.match({
  "location": "ApiStepDefinition.dailyObjectContains(Integer)"
});
formatter.result({
  "status": "skipped"
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
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: Element By.xpath: //button[contains(@class,\u0027cta cta--large cta--primary js-widget-submit\u0027)] not found (tried for 50 second(s) with 5 MILLISECONDS interval)\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027RAHUL3147517\u0027, ip: \u0027192.168.70.70\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:51388}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a), userDataDir\u003dC:\\Users\\RAHULB~1\\AppData\\Local\\Temp\\scoped_dir36396_3685}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d70.0.3538.110, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: fd7dad9ff70f27b763f2506f93b0de55\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:80)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:232)\r\n\tat extension.seleniumFramework.WebElementHelper.waitOnElement(WebElementHelper.java:21)\r\n\tat extension.seleniumFramework.ExtendedWebElement.fetchElement(ExtendedWebElement.java:26)\r\n\tat extension.seleniumFramework.ExtendedWebElement.click(ExtendedWebElement.java:41)\r\n\tat implementation.SearchFlightHelper.searchFight(SearchFlightHelper.java:137)\r\n\tat stepDefinition.SearchFlightStepDefinition.searchFlight(SearchFlightStepDefinition.java:51)\r\n\tat ✽.he looks at a return trip from DXB to LHR leaving one week from now(src/test/java/features/SearchFlight.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "he should be shown the cheapest return ticket from DXB to LHR",
  "keyword": "Then "
});
formatter.match({
  "location": "SelectPriceDefinition.cheapestFlightShown(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});