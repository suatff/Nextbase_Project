@NEXTBASE-1413
Feature: Message functionality testing
  #NEXTBASE-1405
  Background: User should be on the login page
    Given user is on the login page
  @NEXTBASE-1406
  Scenario Template: Send a message
    When user enters "<username>","<password>"
    And user clicks to login button
    When user click on the message
    Then user enters something in the field
    Then user send to message



    Examples: credentials
      | username                      | password |
      | helpdesk1@cybertekschool.com  | UserUser |
      | marketing1@cybertekschool.com | UserUser |
      | hr1@cybertekschool.com        | UserUser |

  @NEXTBASE-1407
  Scenario Template: Verify "All employees" is default and changable
    When user enters "<username>","<password>"
    And user clicks to login button
    When user click on the message
    Then user enters something in the field
    Then user se "All employees" is default
    And user can delete "All employees" from recipients
    And user add a recipient

    Examples: credentials
      | username                      | password |
      | helpdesk1@cybertekschool.com  | UserUser |
      | marketing1@cybertekschool.com | UserUser |
      | hr1@cybertekschool.com        | UserUser |
  @NEXTBASE-1408
  Scenario Template: Verify user can able to cancel sending messages at any time before sending
    When user enters "<username>","<password>"
    And user clicks to login button
    When user click on the message
    And user enters something in the field
    Then user click to cancel button
    And user click on the message
    Then user se the blank message field


    Examples: credentials
      | username                      | password |
      | helpdesk1@cybertekschool.com  | UserUser |
      | marketing1@cybertekschool.com | UserUser |
      | hr1@cybertekschool.com        | UserUser |

  @NEXTBASE-1409
  Scenario Template: Verify "The message title is not specified" message is displayed
    When user enters "<username>","<password>"
    And user clicks to login button
    When user click on the message
    Then user send to message
    Then user se the error message on the screen




    Examples: credentials
      | username                      | password |
      | helpdesk1@cybertekschool.com  | UserUser |
      | marketing1@cybertekschool.com | UserUser |
      | hr1@cybertekschool.com        | UserUser |

  @NEXTBASE-1410
  Scenario Template: Verify "Please specify att least one person" error message is displayed
    When user enters "<username>","<password>"
    And user clicks to login button
    When user click on the message
    And user enters something in the field
    And user can delete "All employees" from recipients
    Then user send to message
    Then user se the recipient error message on the screen




    Examples: credentials
      | username                      | password |
      | helpdesk1@cybertekschool.com  | UserUser |
      | marketing1@cybertekschool.com | UserUser |
      | hr1@cybertekschool.com        | UserUser |

  @NEXTBASE-1411
  Scenario Template: Verify options for recipient groups is displayed and selectable
    When user enters "<username>","<password>"
    And user clicks to login button
    When user click on the message
    And user click add more button in the recipients field
    Then user can se recipient groups




    Examples: credentials
      | username                      | password |
      | helpdesk1@cybertekschool.com  | UserUser |
      | marketing1@cybertekschool.com | UserUser |
      | hr1@cybertekschool.com        | UserUser |

  @NEXTBASE-1412
  Scenario Template: Verify options for recipient groups is displayed and selectable
    When user enters "<username>","<password>"
    And user clicks to login button
    When user click on the message
    And user click add more button in the recipients field
    And user add a new recipient
    Then user can delete "All employees" from recipients




    Examples: credentials
      | username                      | password |
      | helpdesk1@cybertekschool.com  | UserUser |
      | marketing1@cybertekschool.com | UserUser |
      | hr1@cybertekschool.com        | UserUser |
