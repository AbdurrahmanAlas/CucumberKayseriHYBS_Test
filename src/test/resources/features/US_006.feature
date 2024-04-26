
  Feature: US_006 "When the user clicks on the 'Vehicle List' button in the Business Module, the functionalities on the page should work properly."
    # Kullanici İsletmeModulu/ARAC LİSTESİ butonuna tikladiginda sayfadaki islevler düzgün calismalidir  çevirirmisin
    @tc07
    Scenario: TC_0601 When the user clicks on the 'Vehicle List' button, the relevant page should appear.
      # Kullanici Arac listesi butonuna tikladiginda ilgili sayfa gelmelidir. VE Tasıma izin belgesi ve ATS belgesi checkboxlari görünür ve tiklanabilir olmalidir çevir

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * User should be able to click on VEHICLE LIST
      * Test whether the checkbox has status or not.
    @tc07
    Scenario: TC_0601 When the user clicks on the 'ATS Document' button, the relevant page should appear. And the checkboxes for 'Transport Permit' and 'ATS Document' should be visible and clickable."
      # Kullanici Arac listesi butonuna tikladiginda ilgili sayfa gelmelidir. VE Tasıma izin belgesi ve ATS belgesi checkboxlari görünür ve tiklanabilir olmalidir çevir

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * User should be able to click on VEHICLE LIST
      * Test whether the ATS checkbox has status or not.


    Scenario: TC_0601 Verify that when clicking on the dropdown, "Construction" and "Public" are selected, and the relevant categories are displayed.
      # Kullanici Arac listesi butonuna tikladiginda ilgili sayfa gelmelidir. VE Tasıma izin belgesi ve ATS belgesi checkboxlari görünür ve tiklanabilir olmalidir çevir

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * User should be able to click on VEHICLE LIST
      * Verify that when clicking on the dropdown, Construction and Public are selected, and the relevant categories are displayed.

    @tc07
    Scenario: TC_0601 Verify that when clicking on the go to Company
      # Kullanici Arac listesi butonuna tikladiginda ilgili sayfa gelmelidir. VE Tasıma izin belgesi ve ATS belgesi checkboxlari görünür ve tiklanabilir olmalidir çevir

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * User should be able to click on VEHICLE LIST
      * Verify that when clicking on the go to Company