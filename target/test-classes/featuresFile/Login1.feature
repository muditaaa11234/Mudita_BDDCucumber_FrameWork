Feature: Test Login 
@tag1
  Scenario Outline: Check Login is success
    Scenario: search product
    Given user should be on home page
    And user be able to enter the "<product>"
    When user should be search the item
    Then then user should be able to choose the required product
   
      Examples: 
      | product |
      | bags |     
      | jewellery | 
    
