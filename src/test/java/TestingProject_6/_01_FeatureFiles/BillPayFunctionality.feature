#Login olunuz.
# Bill Pay sayfasına gidiniz, 3 ayrı fatura ödeyerek sistemi test ediniz.
#1 - Elektrik faturası $85
#2 - Su faturası $45
#3 - Doğalgaz faturası $120 olarak 3 ayrı fatura ödeyiniz.
#NOT: Her fatura için farklı veri kullanınız.
# Her ödemeden sonra faturanın ödendiğini doğrulayınız
#
Feature: Bill Pay Functionality

  Scenario Outline: Account Login and Bill Pay
    Given   Login to Parabank
    When    Login username and password
    Then    Click to Bill Pay Button
    And     Add invoice "<PayeeName>" and "<Address>" and "<City>" and "<State>" and "<ZipCode>" and "<Phone>" and "<Account>" and "<VerifyAccount>" and "<Amount>"
    When    Verify that invoice have been added
    Examples:
      | PayeeName | Address | City          | State      | ZipCode | Phone      | Account | VerifyAccount | Amount |
      | Elektrik  | Russian | Shbat         | Berdi      | 66354   | 0563636364 | 222333  | 222333        | 85     |
      | Su        | USA     | San Fransisco | California | 34461   | 0563636365 | 3334444 | 3334444       | 45    |
      | Doğalgaz  | Germany | Bavyera       | Ingolstadt | 62587   | 0563636366 | 444555  | 444555        | 120   |

