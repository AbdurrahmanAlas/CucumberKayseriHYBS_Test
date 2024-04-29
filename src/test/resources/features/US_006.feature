Feature: US_006 "When the user clicks on the 'Vehicle List' button in the Business Module, the functionalities on the page should work properly."
    # Kullanici İsletmeModulu/ARAC LİSTESİ butonuna tikladiginda sayfadaki islevler düzgün calismalidir
  @tc07
  Scenario: TC_0601 When the user clicks on the 'Vehicle List' button, the relevant page should appear.

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * User should be able to click on VEHICLE LIST
    * Test whether the checkbox has status or not.

          #  Senaryo: TC_0601 Kullanıcı 'Araç Listesi' butonuna tıkladığında ilgili sayfanın açılması gerekmektedir.
          #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
          #      * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
          #      * Kullanıcı ARAÇ LİSTESİ'ne tıklayabilmelidir
          #      * Onay kutusunun durumu olup olmadığını test edin.

  @tc07
  Scenario: TC_0602 When the user clicks on the 'ATS Document' button, the relevant page should appear. And the checkboxes for 'Transport Permit' and 'ATS Document' should be visible and clickable."
      # Kullanici Arac listesi butonuna tikladiginda ilgili sayfa gelmelidir. VE Tasıma izin belgesi ve ATS belgesi checkboxlari görünür ve tiklanabilir olmalidir çevir

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * User should be able to click on VEHICLE LIST
    * Test whether the ATS checkbox has status or not.

           # HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
           #      * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
           #      * Kullanıcı ARAÇ LİSTESİ'ne tıklayabilmelidir
           #      * ATS onay kutusunun durumunun olup olmadığını test edin.


  Scenario: TC_0603 Verify that when clicking on the dropdown, "Construction" and "Public" are selected, and the relevant categories are displayed.

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * User should be able to click on VEHICLE LIST
    * Verify that when clicking on the dropdown, Construction and Public are selected, and the relevant categories are displayed.

           # Senaryo: TC_0603 Açılır menüye tıklandığında "İnşaat" ve "Genel"in seçildiğini ve ilgili kategorilerin görüntülendiğini doğrulayın.
           #
           #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
           #      * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
           #      * Kullanıcı ARAÇ LİSTESİ'ne tıklayabilmelidir
           #      * Açılır menüye tıkladığınızda İnşaat ve Kamu'nun seçildiğini ve ilgili kategorilerin görüntülendiğini doğrulayın.


  @tc07
  Scenario: TC_0604 Verify that when clicking on the go to Company
      # Kullanici Arac listesi butonuna tikladiginda ilgili sayfa gelmelidir. VE Tasıma izin belgesi ve ATS belgesi checkboxlari görünür ve tiklanabilir olmalidir çevir

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * User should be able to click on VEHICLE LIST
    * Verify that when clicking on the go to Company

      # HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
      #      * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
      #      * Kullanıcı ARAÇ LİSTESİ'ne tıklayabilmelidir
      #      * Şirkete git seçeneğine tıkladığınızda bunu doğrulayın