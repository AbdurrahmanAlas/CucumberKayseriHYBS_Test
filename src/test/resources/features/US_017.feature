
@tc017
 Feature: US_017 When you click on the "FINANCIAL TRANSACTIONS" heading, the relevant page should appear and
           BALANCE LOADING,
           BALANCE DECLINE,
           PAYMENT CONTROL,
           CREATING A TRANSPORT PERMIT CERTIFICATE,
           TRANSPORT PERMIT RENEWAL
           "The buttons must be clickable and these titles must work without any problems."

    # "MALI ISLEMLER basligina tiklanildiginda ilgili sayfa gelmelidir ve     #BAKİYE YÜKLEME,    #BAKİYE DÜŞÜMÜ,    #ÖDEME KONTROL,
    #TAŞIMA İZİN BELGESI TAHAKKUKU OLUSTURMA,
    #TASIMA IZIN BELGESI YENILEME
    # butonlarına tiklanabilmeli ve bu baslıklar sorunsuz bir sekilde calismalidir."

  Scenario: TC_01701 WHEN THE BALANCE UPLOAD BUTTON IS CLICKED, BALANCES CAN BE UPLOADED TO THE COMPANY WITHOUT ANY PROBLEM AND SHOULD BE VERIFIED.
    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    *  click on the inspect eye icon
    * click on the financial transactions
    * Click on the top up balance button and verify that the balance has been loaded by entering the information.


  Scenario: TC_01702 WHEN THE BALANCE DROP BUTTON IS CLICKED, BALANCES CAN BE UPLOADED TO THE COMPANY WITHOUT ANY PROBLEM AND SHOULD BE VERIFIED.

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    * click on the inspect eye icon
    * click on the financial transactions
    * Click on the balance deduction button and enter the information to confirm the balance deduction.


  Scenario: TC_01703 "WHEN THE PAYMENT CHECK BUTTON IS CLICKED, IT SHOULD BE CHECKED WITHOUT ANY PROBLEM.

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    * click on the inspect eye icon
    * click on the financial transactions
    * Click on the payment check button and Verify that it has been checked successfully"


  Scenario: TC_01704 WHEN THE TRANSPORT PERMIT CERTIFICATE CREATION BUTTON IS CLICKED, IT SHOULD BE CONFIRMED THAT IT HAS BEEN CREATED WITHOUT PROBLEM.

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    * click on the inspect eye icon
    * click on the financial transactions
    * WHEN THE TRANSPORT PERMIT CERTIFICATE CREATION BUTTON IS CLICKED, IT SHOULD BE CONFIRMED THAT IT HAS BEEN CREATED WITHOUT PROBLEM."


    Scenario: TC_01705 WHEN THE TRANSPORT PERMIT CERTIFICATE RENEWAL BUTTON IS CLICKED, IT SHOULD BE VERIFIED THAT THE RENEWAL PROCESS HAS BEEN COMPLETED.

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
      * click on the inspect eye icon
      * click on the financial transactions
      * WHEN THE TRANSPORT PERMIT CERTIFICATE RENEWAL BUTTON IS CLICKED, IT SHOULD BE VERIFIED THAT THE RENEWAL PROCESS HAS BEEN COMPLETED."
