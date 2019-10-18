@GoogleSearch
Feature: Google Search Functionality;

Scenario: Verify google search functionality
Given Browser is launched
And User enters "URL"
When Google Search page is displayed
And User enters required "text"
And Click on enter
Then Respective results should be displayed
