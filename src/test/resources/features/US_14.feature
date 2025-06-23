Feature:  US_015 When clicked on the title User Request Lists / CONSTRUCTION FILL REQUESTS, the functions on the page should work properly.
    # Kullanıcı İstek Listeleri / İNŞAAT DOLGU İSTEKLERİ başlığına tıklandığında sayfadaki fonksiyonların düzgün çalışması gerekmektedir.


  Scenario: TC_01501 When the 'ADD NEW CONSTRUCTION FILL REQUEST' button is clicked, the functions should work properly.

    Given Login to HYBS site, click the Login button and log in with your User information.
    * Click on the InsaatDolguTalebi link
    * Click on the Add yeni insaatDolguTalebi button
    * Add and create information in yeni insaatDolguTalebi

      # Senaryo: TC_01501 'YENİ İNŞAAT DOLGU TALEBİ EKLE' butonu tıklandığında fonksiyonlar düzgün çalışmalıdır.
      #
      #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
      #      * İnşaatDolguTalebi linkine tıklayın
      #      * Yeni inşaatDolguTalebi ekle butonuna tıklayın
      #      * Yeni inşaatDolguTalebi'de bilgi ekleyin ve oluşturun


  Scenario: TC_01502 When the 'CONSTRUCTION FILL REQUEST' is clicked, the 'UPDATE' buttons
  on the right side related to the added building permits should be active and functioning properly.

    Given Login to HYBS site, click the Login button and log in with your User information.
    * Click on the InsaatDolguTalebi link
    * click on the InsaatDolguTalebiGüncelleButton

      # Senaryo: TC_01502 'İNŞAAT DOLGU TALEBİ' tıklandığında 'GÜNCELLEME' butonları
      #    Eklenen yapı ruhsatları ile ilgili sağ tarafta aktif ve düzgün çalışıyor olmalıdır.
      #
      #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
      #      * İnşaatDolguTalebi linkine tıklayın
      #      * İnşaatDolguTalebiGüncelleButonuna tıklayın

  @01303
  Scenario: TC_01503 When the "Construction Fill Request" is clicked, the "DELETE" and "ATTACHMENT-2"
  buttons on the right side related to the added building permits should be active and functional.

    Given Login to HYBS site, click the Login button and log in with your User information.
    * Click on the InsaatDolguTalebi link
    * click on the InsaatDolguTalebi sil button
    * click on the InsaatDolguTalebi yuklenenbelge button
    * verify that the uploaded document has been opened

      # Senaryo: TC_01503 "İnşaat Dolgu Talebi" tıklandığında "SİL" ve "EK-2"
      #      Eklenen yapı ruhsatlarına ilişkin sağ tarafta bulunan butonların aktif ve çalışır durumda olması gerekmektedir.
      #
      #        HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
      #        * İnşaatDolguTalebi linkine tıklayın
      #        * İnşaatDolguTalebi sil butonuna tıklayın
      #        * İnşaatDolguTalebi yuklenenbelge butonuna tıklayın
      #      * yüklenen belgenin açıldığını doğrulayın


