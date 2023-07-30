Feature:login
  Scenario:
    When  i enter valid "standard_user"
    And   i enter valid "secret_sauce"
    Then  i click on login button


  Scenario:
    When  i enter valid "standard_user"
    And   i enter invalid "eman"
    Then  i click on login button