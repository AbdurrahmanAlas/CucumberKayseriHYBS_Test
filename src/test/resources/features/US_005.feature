
  Feature: "US_005 When the user clicks on the 'Disable/Enable Module/Company List/PASIVE' (X) button, the functionalities on the page should work properly."
    # Kullanici İsletmeModulu/FirmaListesi/PASİFE AL(X) butonuna tikladiginda sayfadaki islevler düzgün calismalidir  bunu ingilizceye cevir
    @tc07
    Scenario: TC_0501 When the 'Disable/Enable (X)' button of any company is clicked, that company should be disabled.
      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
      * When the 'Disable/Enable (X)' button of any company is clicked, that company should be disabled.


      ## BURADA BUG VAR FİRMA PASİFTEN TEKRAR AKTİF HALE ALMAK İCİN BUTON BULUNMUYOR

      Scenario: TC_0502 A company that has been disabled should be able to be viewed again in the ACTIVE company list."
        Given Login to HYBS site, click the Login button and log in with your User information.
        * User should be able to click on OPERATION MODULE
        * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
        * The user clicks on the disabled button
        * The 'Enable' button for the company should be displayed, and the company should be able to be sent back to the ACTIVE company list.



    Scenario: TC_0503 "When the 'Delete (U)' button of any company is clicked, that company should be deleted."
      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
      * When the 'Delete (U)' button of any company is clicked, that company should be deleted.