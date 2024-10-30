Feature: I want to login to Takealot
  Background:
    Given Launch browser
  Scenario Outline: Takealot_login
    Given  i am loggin in
    And i enter "<email>" and "<password>"
    Examples:
      | email               | password |
      | luckiem28@gmail.com | Takealot@20    |

   Scenario Outline: User logged in
     Then Takealot homepage must be displayed with "<user>" signed in
     Examples: |user|
               |Hi LUCKSON (that's not me)|



