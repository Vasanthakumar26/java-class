
Feature: This is to test 1clx login 
Scenario Outline: 1clx login page scenario
    Given user is on login page
    When the user enters valid "<username>" and "<password>"
    And clicks on the login button
    And the user should be navigated to home page
    And user click on profile link
    And user click on details update
    And user change the profile
    And user enters password "<Old password>" and "<New password>" and "<Verify password>"
    And user click on password update button
    And user enters razorpay id "<Keyid>" and "<Secret key>"
    And User clicks on razorpay update
    And user select the sell type
    And user enters gstin number "<GSTIN number>"
    Then user clicks on GSTIN number update
    
    
    
    
    Examples:
    |username              |password      |Old password|New password|Verify password|Keyid                   |Secret key               |GSTIN number   |
    |logibif929@meidecn.com|V@santh1234   |V@santh1234 |V@santh123  |V@santh123     |rzp_test_vuVWkHnbavXAdC |JwXA4Cfh0LaOom2pio41F6C4 |07AAGFF2194N1Z1| 
    
    
    
    
    
    
    
    
    
    
    
    
