
  Feature: US_012 When the "User Request Lists/Building Permit Request" title is clicked, the functions on the page should work correctly.
       # Kullanici Talep Listeleri/YAPI RUHSAT TALEBİ basligina tiklanildiginda sayfadaki islevler düzgün calismalidir

    Scenario:TC_01201 BUILDING PERMIT REQUEST is clicked, the information related to the added building permits should be listed.
    It should be verified that the search is performed correctly in the search boxes.
      # YAPI RUHSAT TALEBİ  tıklandıgında eklenen yapı ruhsatlari ile ilgili  bilgiler listelenmelidir.
      #Searchboxlarda arama yaptıgında dogru bir şekilde arandıgı kontrol edilir

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * User should be able to click on BUILDING PERMIT REQUEST
      * t should be verified that the building permit request page has been opened.

    Scenario:TC_01202 BUILDING PERMIT REQUEST is clicked, the information related to the added building permits should be listed.
    It should be verified that the search is performed correctly in the search boxes.
      # YAPI RUHSAT TALEBİ  tıklandıgında eklenen yapı ruhsatlari ile ilgili  bilgiler listelenmelidir.
      #Searchboxlarda arama yaptıgında dogru bir şekilde arandıgı kontrol edilir

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * User should be able to click on BUILDING PERMIT REQUEST
      * User should be able to click on NEW BUILDING PERMIT REQUEST BUTTON
      * Enter the information related to the new building permit request and click on the create button.
      * Verify that the added information has arrived



    Scenario:TC_01203 When BUILDING PERMIT REQUEST is clicked, the DEACTIVATE, DELETE, -2 buttons on the right side regarding building permits should be active.
      # YAPI RUHSAT TALEBİ  tıklandıgında eklenen yapı ruhsatlari ile ilgili  sag kisimda bulunan PASİFE AL,SİL,EK-2 butonlari aktif calismalidir.

      Given Login to HYBS site, click the Login button and log in with your User information.
      * click  YapıRuhsatTaleb
      * User should be able to click on BUILDINGlıst
      * Click the Deactivate job button and verify
      * click the Delete job button and verify



    Scenario:TC_01204 When BUILDING PERMIT REQUEST is clicked, the  APPENDIX-2 buttons on the right side regarding building permits should be active.
      # YAPI RUHSAT TALEBİ  tıklandıgında eklenen yapı ruhsatlari ile ilgili  sag kisimda bulunan EK-2 butonlari aktif calismalidir.

      Given Login to HYBS site, click the Login button and log in with your User information.
      * click  YapıRuhsatTaleb
      * click on EK2 and verify it has arrived


    Scenario:TC_01205 When BUILDING PERMIT REQUEST is clicked, the UPDATE buttons on the right side regarding building permits should be active.
      # YAPI RUHSAT TALEBİ  tıklandıgında eklenen yapı ruhsatlari ile ilgili  sag kisimda bulunan EK-2 butonlari aktif calismalidir.

      Given Login to HYBS site, click the Login button and log in with your User information.
      * click  YapıRuhsatTaleb
      * click on UPDATE and verify it has arrived










