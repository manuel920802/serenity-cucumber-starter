Feature: Perform Calculations

  As a primary school maths student
  I want to perform various calculations
  So that i can practice my maths skills

  Acceptance criteria
  Perform additions and subtractions
  Perform multiplications and divisions
  Invalid inputs reported as NaN
  Division by zero

  Background:
    Given Matt a maths student has opened the calculator

    Scenario Outline: Perform mathematical calculations
      When Matt performs the following calculation:
      | Left Operand   | Operator   | Right Operand   |
      | <Left Operand> | <Operator> | <Right Operand> |
      Then he should see a result of "<Result>"

      Examples: Additions and subtractions
      | Left Operand | Operator | Right Operand | Result |
      |     1        |   +      |      2        |   3    |
      |     12       |   +      |      34       |   46   |
      |     12       |   -      |      5        |   7    |
      |     12       |   -      |      34       |  -22   |

      Examples: Multiplications and divisions
        | Left Operand | Operator | Right Operand | Result |
        |     1        |   *      |      2        |   2    |
        |     2        |   *      |      4        |   8    |
        |     10       |   /      |      4        |   2.5  |

      Scenario Outline: Reporting invalid inputs
        When Matt performs the following calculation:
          | Left Operand   | Operator   | Right Operand   |
          | <Left Operand> | <Operator> | <Right Operand> |
        Then he should see a result of "<Result>"

        Examples: Non-numerical characters
          | Left Operand | Operator | Right Operand | Result |
          |     abc      |   +      |      123      |   NaN  |
          |     123      |   +      |      abv      |   NaN  |
          |     !$&      |   +      |      567      |   NaN  |

        Examples: Division by zero
          | Left Operand | Operator | Right Operand | Result    |
          |     1        |   /      |      0        | Infinity  |




