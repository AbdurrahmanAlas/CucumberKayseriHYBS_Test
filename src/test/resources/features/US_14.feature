

  Feature:  US_015 When clicked on the title User Request Lists / CONSTRUCTION FILL REQUESTS, the functions on the page should work properly.


    Scenario: TC_01501 When the 'ADD NEW CONSTRUCTION FILL REQUEST' button is clicked, the functions should work properly.

      Given Login to HYBS site, click the Login button and log in with your User information.
      * Click on the InsaatDolguTalebi link
      * Click on the Add yeni insaatDolguTalebi button
      * Add and create information in yeni insaatDolguTalebi


    Scenario: TC_01502 When the 'CONSTRUCTION FILL REQUEST' is clicked, the 'UPDATE' buttons
    on the right side related to the added building permits should be active and functioning properly.
      # İNSAAT DOLGU TALEBİ  tıklandıgında eklenen yapı ruhsatlari ile ilgili  sag kisimda bulunan GÜNCELLE   butonlari aktif calismalidir.

      Given Login to HYBS site, click the Login button and log in with your User information.
      * Click on the InsaatDolguTalebi link
      * click on the InsaatDolguTalebiGüncelleButton

    @01303
      Scenario: TC_01503 When the "Construction Fill Request" is clicked, the "DELETE" and "ATTACHMENT-2"
      buttons on the right side related to the added building permits should be active and functional.

        Given Login to HYBS site, click the Login button and log in with your User information.
        * Click on the InsaatDolguTalebi link
        * click on the InsaatDolguTalebi sil button
        * click on the InsaatDolguTalebi yuklenenbelge button
      * verify that the uploaded document has been opened


