
  Feature: DENEME

    @firma
    Scenario: DENEME
      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."



      # TÜM FİRMALARIN BELGELERİ İNDİRME OLMADI HATA VAR HENUZ*************************

    @TUM
    Scenario: Tum firmalarin firma belgelerini ve arac belgelerini indir
      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
      * click on the inspect eye icon
      * the user clicks on the COMPANY DOCUMENTS  button the user verifies that the company information update form is opened
      * TUM FIRMALAR ICIN The ability to download documents from the document list should be tested.