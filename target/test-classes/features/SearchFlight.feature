#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
Scenario Outline: Bill wants to travel from DXB to LHR
Given that Bill has decided to check available flights on <date> to <todate>
Examples:
|date|todate|
|11March2019|18March2019|
|04December2018|10December2018|
|04December2019|14December2019|

@tag2
Scenario: Bill wants to travel from DXB to LHR
Given that Bill has decided to check available flights
When he looks at a return trip from DXB to LHR leaving one week from now
Then he should be shown the cheapest return ticket from DXB to LHR

 