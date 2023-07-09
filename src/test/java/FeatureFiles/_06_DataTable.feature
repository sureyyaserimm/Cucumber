Feature: DataTable Functionality


  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    @Regression
  Scenario: Create Country
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | country123 |
      | codeInput | sd1231     |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | country123 |

    Then Success message should be displayed

  @Regression
  Scenario: Create Nationality
    And Click on the element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | srysrm12345 |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario: Fee Functionality
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput       | srys3fee |
      | codeInput       | f152fd   |
      | integrationCode | 1217522  |
      | priorityCode    | 5642156  |

    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |

    And User delete item from Dialog Content
      | srys3fee |

    Then Success message should be displayed














