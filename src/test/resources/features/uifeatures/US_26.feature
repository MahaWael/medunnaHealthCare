Feature:Contact portal test

  @US26_TC001
  Scenario:US26_TC001
    Given US26_TC001 any user goes to Medunna website
    Given US26_TC001 any user clicks to contact portal
    And US26_TC001 any user provide "name", "email", "subject", "message"
    And US26_TC001 any user clicks to send
    Then US26_TC001 any user validate green box