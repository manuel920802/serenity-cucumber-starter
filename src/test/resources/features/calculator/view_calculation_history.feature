Feature: View Calculation History

  As a maths student
  I want to see what calculations i have already done
  So that i can review the work i do each session

  Acceptance criteria
  View previous calculations in reverse chronological order

  Background:
    Given Matt a maths student has opened the calculator

    Scenario: Each completed calculation should appear in the calculation history
      When Matt performs the following calculation:
        | Left Operand   | Operator   | Right Operand   |
        |     10         |   +        |     20          |
      Then the calculation history should contain:
      | Expression  | Result |
      |  10 + 20    |  30    |

      Scenario: Calculations should be shown in reverse chronological order
        Given Matt has performed the following calculations:
          | Left Operand   | Operator   | Right Operand   |
          |     1          |   +        |     2           |
          |     2          |   -        |     4           |
          |     3          |   *        |     6           |
        When Matt performs the following calculation:
          | Left Operand   | Operator   | Right Operand   |
          |     4          |   /        |     2           |
        Then the calculation history should contain:
          | Expression  | Result |
          |  4 / 2      |  2     |
          |  3 * 6      |  18    |
          |  2 - 4      |  -2    |
          |  1 + 2      |  3     |