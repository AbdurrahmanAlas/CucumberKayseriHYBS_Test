
  Feature: US_013 When the User Request Lists/EXTERNAL EXCAVATION REQUEST heading is clicked, the functions on the page should work properly.
    # Kullanici Talep Listeleri/HARİCİ KAZI TALEBİ basligina tiklanildiginda sayfadaki islevler düzgün calismalidir


    Scenario:TC_01301 The functions should work properly when the ADD NEW EXTERNAL EXCAVATION REQUEST button is clicked.

      Given Login to HYBS site, click the Login button and log in with your User information.
      * Click on the External Excavation Request link
      * Click on the Add new External Excavation request button
      * Add and create information in new External excavation request

            # Senaryo:TC_01301 YENİ HARİCİ KAZI TALEBİ EKLE butonuna tıklandığında fonksiyonlar düzgün çalışmalıdır.
            #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
            #      * Dış Kazı Talebi linkine tıklayın
            #      * Yeni Dış Kazı isteği ekle butonuna tıklayın
            #      * Yeni Harici kazı talebinde bilgi ekleme ve oluşturma

      Scenario: TC_01302 When EXTERNAL EXCAVATION REQUEST is clicked, the update buttons on the right side regarding the added building permits should be active.

        Given Login to HYBS site, click the Login button and log in with your User information.
        * Click on the External Excavation Request link
        * click on the Update button
        * Test that the data can be updated correctly

        # Senaryo: TC_01302 DIŞ KAZI TALEBİ tıklandığında eklenen yapı ruhsatlarına ilişkin sağ tarafta yer alan güncelleme butonlarının aktif olması gerekmektedir.
        #        HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
        #        * Dış Kazı Talebi linkine tıklayın
        #        * Güncelle düğmesine tıklayın
        #        * Verilerin doğru şekilde güncellenebildiğini test edin

    Scenario: TC_01303 When EXTERNAL EXCAVATION REQUEST is clicked, the  DELETE, button on the right side regarding the added building permits should be active.

      Given Login to HYBS site, click the Login button and log in with your User information.
      * Click on the External Excavation Request link
      * click on the Delete button
      * Test that the data can be delete correctly

      #  Senaryo: TC_01303 DIŞ KAZI TALEBİ tıklandığında eklenen yapı izinlerine ilişkin sağ tarafta bulunan SİL butonunun aktif olması gerekmektedir.
      #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
      #      * Dış Kazı Talebi linkine tıklayın
      #      * Sil butonuna tıklayın
      #      * Verilerin doğru şekilde silinebildiğini test edin


    @01302
    Scenario: TC_01304 When EXTERNAL EXCAVATION REQUEST is clicked, the  EK2, button on the right side regarding the added building permits should be active.
      # HARİCİ KAZI TALEBİ  tıklandıgında eklenen yapı ruhsatlari ile ilgili  sag kisimda bulunan ,EK-2 butonlari aktif calismalidir.

      Given Login to HYBS site, click the Login button and log in with your User information.
      * Click on the External Excavation Request link
      * click on the EK2 button
      * Test that the data can be EK2 correctly

    # Senaryo: TC_01304 DIŞ KAZI TALEBİ tıklandığında eklenen yapı izinlerine ilişkin sağ tarafta bulunan EK2 butonunun aktif olması gerekmektedir.
    #      # HARİCİ KAZI TALEBİ tıklandığında yapı ruhsatları ile ilgili sag kisimda bulunan,EK-2 butonları aktif calismalidir.
    #
    #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
    #      * Dış Kazı Talebi linkine tıklayın
    #      * EK2 butonuna tıklayın
    #      * Verilerin doğru EK2 olabileceğini test edin