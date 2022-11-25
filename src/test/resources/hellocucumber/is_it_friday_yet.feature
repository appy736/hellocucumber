Feature: Is it Friday yet?
  Everybody wants to know when its Friday

#  Scenario: Sunday isn't Friday
#    Given Today is Sunday
#    When I ask whether its Friday yet
#    Then I should be told "Nope"
#
#    Scenario: Friday is Friday
#      Given today is friday
#      When I ask whether its Friday yet
#      Then I should be told "TGIF"

  Scenario Outline: Today isor is not Friday
    Given Today is "<day>"
    When I ask whether its Friday yet
    Then I should be told "<answer>"
    Examples:
      | day           | answer |
      | Friday        | TGIF   |
      | Sunady        | Nope   |
      | Anything else | Nope   |



