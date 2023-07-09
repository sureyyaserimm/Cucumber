#Senaryo 1| Register Functionality
# Para Bank sitesinde bir hesap açınız
# Hesabın açıldığını “Your account was created successfully. You are now logged in.”
#mesajını doğrulayınız.

  Feature: Register Functionality

    Scenario: Account Register
      Given   Navigate to ParaBank
      When    Register username and password
      Then    User should register succesfully