Feature: Login

#  @login
#  Scenario Outline: Register a user 2
#    Given user launches the facebook
#    When user enters signup information "<FirstName>","<LastName>","<EmailOrMobile>","<SignUpPassword>"
#    And user clears sign up information
##    Then sign up info is cleared
#
#    Examples:
#      | FirstName | LastName | EmailOrMobile       | SignUpPassword |
#      | Test    | Shaik    | mehraj999@gmail.com | 92379889       |


  @facebook_proto2
  Scenario Outline: Register a user
    Given user launches the facebook "<Feature>","<Scenario>"
    When user enters signup information
    And user clears sign up information
#    Then sign up info is cleared

    Examples:
      | Feature  | Scenario       |
      | Register | SignUpUser_TC1 |
      | Register | SignUpUser_TC2 |