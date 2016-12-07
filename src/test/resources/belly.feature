Feature: Belly

  Scenario: Eat lot cakes
    Given I eat 42 cakes
    When I wait 1 hour
    Then my belly should growl

  Scenario: Eat lot cakes
    Given I eat 42 cakes
    When I wait 0 hour
    Then my belly should silent


  Scenario: Eat few cakes
    Given I eat 23 cakes
    When I wait 1 hour
    Then my belly should growl