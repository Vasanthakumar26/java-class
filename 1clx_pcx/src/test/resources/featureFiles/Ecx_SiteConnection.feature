Feature: This is to test 1clx login 
Scenario Outline:  1clx login page scenario
   Given user click on login page
    When user click on signIn button
     And user choose the user option Ecx 
     And user enters valid "<username>" and "<password>"
     And clicks on the ecx login 
     And the user should be navigated to ecx home page
     And user click on my ping page
    Then user click on pcx site page
    
    Examples:
     |username               |password     | 
     |sacope1563@jobbrett.com|V@santh1234  |