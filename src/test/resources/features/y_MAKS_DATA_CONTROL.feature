
  Feature: MAKS_DATA_CONTROL

    Scenario: Control in Building Permit processes
      Given Login to HYBS site, click the Login button and log in with your User information.
      * Click the 'Is Surecleri' link
      * Click the 'Building Permit Process' link
      * Click the search field and enter the relevant plot number
      * Check multiple plot numbers and print those not found in the list


      @cezat
      Scenario: Control in Punishment List
        Given Login to HYBS site, click the Login button and log in with your User information.
        * User should be able to click on OPERATION MODULE
        * User should be able to click on CEZA_tAAHHUT_LIST
        * The relevant plot should be verified by searching for the AdaParcel in the listt.
