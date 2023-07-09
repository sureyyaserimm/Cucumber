Feature: DataTable Ornek

  Scenario: Users List
    When Write username "ismet"
    And Write username and password "ismet" and "1234"
    And Write username as DataTable
      | ismet  |
      | mehmet |
      | ayse   |
      | mehmet |

    And Write username and password as DataTable
      | ismet  | 1234 |
      | mehmet | 4564 |
      | ayse   | 8654 |
      | mehmet | 9854 |