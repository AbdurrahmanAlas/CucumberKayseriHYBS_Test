
  Feature: US_013 When the User Request Lists/EXTERNAL EXCAVATION REQUEST heading is clicked, the functions on the page should work properly.
    # Kullanici Talep Listeleri/HARİCİ KAZI TALEBİ basligina tiklanildiginda sayfadaki islevler düzgün calismalidir


    Scenario:TC_01301 The functions should work properly when the ADD NEW EXTERNAL EXCAVATION REQUEST button is clicked.
      # YENİ HARİCİ KAZI TALEBİ EKLE  butonuna tiklandiginda fonksiyonlar düzgün bir biçimde çalışmalı

      Given Login to HYBS site, click the Login button and log in with your User information.
      * Click on the External Excavation Request link
      * Click on the Add new External Excavation request button
      * Add and create information in new External excavation request

      Scenario: TC_01302 When EXTERNAL EXCAVATION REQUEST is clicked, the update buttons on the right side regarding the added building permits should be active.
      # HARİCİ KAZI TALEBİ  tıklandıgında eklenen yapı ruhsatlari ile ilgili  sag kisimda bulunan PASİFE AL,SİL,EK-2 butonlari aktif calismalidir.

        Given Login to HYBS site, click the Login button and log in with your User information.
        * Click on the External Excavation Request link
        * click on the Update button
        * Test that the data can be updated correctly

    Scenario: TC_01303 When EXTERNAL EXCAVATION REQUEST is clicked, the  DELETE, button on the right side regarding the added building permits should be active.
      # HARİCİ KAZI TALEBİ  tıklandıgında eklenen yapı ruhsatlari ile ilgili  sag kisimda bulunan PASİFE AL,SİL,EK-2 butonlari aktif calismalidir.

      Given Login to HYBS site, click the Login button and log in with your User information.
      * Click on the External Excavation Request link
      * click on the Delete button
      * Test that the data can be delete correctly


    @01302
    Scenario: TC_01304 When EXTERNAL EXCAVATION REQUEST is clicked, the  EK2, button on the right side regarding the added building permits should be active.
      # HARİCİ KAZI TALEBİ  tıklandıgında eklenen yapı ruhsatlari ile ilgili  sag kisimda bulunan PASİFE AL,SİL,EK-2 butonlari aktif calismalidir.

      Given Login to HYBS site, click the Login button and log in with your User information.
      * Click on the External Excavation Request link
      * click on the EK2 button
      * Test that the data can be EK2 correctly