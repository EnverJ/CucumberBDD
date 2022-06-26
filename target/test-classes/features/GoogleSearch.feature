Feature: Feature to test google search functionality
    Scenario: Google search is working 
      Given browser is open
      And user is on the google seach box
      When user enter a text in seach box
      And hit Enter
      Then User navigate to search result	