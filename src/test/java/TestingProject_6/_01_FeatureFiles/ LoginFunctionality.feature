#Case 1: Para Bank sitesine geçerli kullanıcı bilgileriyle giriş yapınız ve Login
#olduğunuzu doğrulayınız. Log Out olunuz.
# Case 2: Para Bank sitesine geçersiz kullanıcı bilgileriyle giriş yapınız ve Login
#olmadığınızı doğrulayınız. (Username ve password için ayrı ayrı deneyiniz.)

Feature: Login Functionality

  Scenario: Account Login
    Given   Login to Parabank
    When    Login username and password
    Then    User should register succesfully and logout

  Scenario: Mistake login
    Given   Login to Parabank
    Then    User should username login mistake and verify
    And    User should password login mistake and verify


