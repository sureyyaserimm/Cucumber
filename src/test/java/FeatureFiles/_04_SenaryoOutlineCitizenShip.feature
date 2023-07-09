#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile doğrulayınız.
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test)

Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShip page

  Scenario Outline: CitizenShip create
    When User a CitizenShip name as "<name>" and code as "<short>"
    Then Success message should be displayed

    When User a CitizenShip name as "<name>" and code as "<short>"
    Then Already exist message should be displayed

    When User delete the "<name>"
    Then Success message should be displayed
    Examples:
      | name       | short  |
      | sry123srm007 | s1s2s30 |
      | sry123srm107 | s1s2s30 |
      | sry123srm207 | s1s2s30 |
      | sry123srm307 | s1s2s30 |


#testNG dataProvide burada Scenario Outline olarak krşımıza çıkıyor.

