@apiTest
Feature: Api Testing

  @api
 Scenario: Verify API is working
 When I hit api
 Then response contains top level elements
 And Hourly object contains 49
 And Minutely object contains 61
 And Daily object contains 8 